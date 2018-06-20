package it.ats.persistenza.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import it.ats.modello.Cane;
import it.ats.modello.Utente;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.DAOUtente;
import it.ats.persistenza.DataSource;

public class DAOUtenteImpl implements DAOUtente {

	public void save(Utente utente) throws DAOException {

		String insert = "INSERT INTO UTENTE VALUES(ID_UTENTE_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,";
		String data = "TO_DATE(?,'dd/mm/yyyy'))";
		String sql = insert + data;
		System.out.println(sql);
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement prepareStatement = null;


		try {
			connection = instance.getConnection();
			prepareStatement = connection.prepareStatement(sql, new String[] { "ID_UTENTE" });
			// prepareStatement.setInt(1, utente.getId());
			prepareStatement.setString(1, utente.getNome());
			prepareStatement.setString(2, utente.getCognome());
			prepareStatement.setString(3, utente.getSesso());
			prepareStatement.setString(4, utente.getUsername());
			prepareStatement.setString(5, utente.getPassword());
			prepareStatement.setString(6, utente.getCitta());
			prepareStatement.setString(7, utente.getPathFoto());
			prepareStatement.setString(8, utente.getIndirizzo());
			prepareStatement.setInt(9, utente.getVerificato());
			prepareStatement.setString(10, utente.geteMail());
			prepareStatement.setString(11, utente.getnTelefono());
			prepareStatement.setString(12, utente.getDataNascita());

			prepareStatement.executeUpdate();

			ResultSet generatedKeys = prepareStatement.getGeneratedKeys();

			if (generatedKeys != null && generatedKeys.next()) {

				int id = generatedKeys.getInt(1);

				utente.setId(id);

			}

		} catch (SQLException ex) {
			// System.out.println("qua");
			System.out.println(ex.getMessage());

			throw new DAOException(ex.getMessage(), ex);

		} finally {

			instance.close(prepareStatement);

			instance.close(connection);

		}

	}

	public void delete(Utente utente) throws DAOException {
		// TODO Auto-generated method stub

	}

	public List<Utente> findAll() throws DAOException {
		// String sql = "SELECT * FROM UTENTE";
		// List<Utente> listaUtenti = new ArrayList<Utente>();
		// DataSource instance = DataSource.getInstance();
		// Connection connection = null;
		// Statement statement = null;
		// ResultSet resultSet = null;
		// try {
		// connection = instance.getConnection();
		// statement = connection.createStatement();
		// resultSet = statement.executeQuery(sql);
		// while (resultSet.next()) {
		// int id = resultSet.getInt("ID_UTENTE");
		// String nome = resultSet.getString("NOME");
		// String cognome = resultSet.getString("COGNOME");
		// String sesso = resultSet.getString("SESSO");
		// String user = resultSet.getString("USERNAME");
		// String password = resultSet.getString("PASSWORD");
		// String citta=resultSet.getString("CITTA");
		// String immagine=resultSet.getString("UTENTE_IMMAGINE");
		// String indirizzo = resultSet.getString("INDIRIZZO");
		// int verificato=resultSet.getInt("VERIFICATO");
		// String mail = resultSet.getString("MAIL");
		// String nTel = resultSet.getString("NUMERO_TELEFONO");
		// Date dataNascita=resultSet.getDate("DATA_NASCITA");
		//
		// Utente utente = new Utente();
		// utente.setId(id);
		// utente.setNome(nome);
		// utente.setSesso(sesso);
		// utente.setUsername(user);
		// utente.setPassword(password);
		// utente.setCitta(citta);
		// utente.setPathFoto(immagine);
		// utente.setIndirizzo(indirizzo);
		// utente.setVerificato(verificato);
		// utente.seteMail(mail);
		// utente.setnTelefono(nTel);
		// utente.setDataNascita(dataNascita);
		//
		// listaUtenti.add(utente);
		//
		// }
		//
		// } catch (SQLException e) {
		// throw new DAOException(e.getMessage(), e);
		//
		// } finally {
		//
		// instance.close(resultSet);
		//
		// instance.close(statement);
		//
		// instance.close(connection);
		//
		// }
		//
		// return listaUtenti;
		return null;

	}

	public Utente findUtente(String email, String password) throws DAOException {
		String sql = "SELECT * FROM UTENTE WHERE MAIL = '" + email + "' AND PASSWORD = '" + password + "'";
		Utente utente = new Utente();
		System.out.println("email: " + email);
		System.out.println("password: " + password);
		System.out.println(sql);

		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {

			connection = instance.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			if (resultSet.next()) {
				System.out.println(resultSet);

				int id_utente = resultSet.getInt(1);
				String nome = resultSet.getString(2);
				String cognome = resultSet.getString(3);
				String sesso = resultSet.getString(4);
				String username = resultSet.getString(5);
				String passwrd = resultSet.getString(6);
				String citta = resultSet.getString(7);
				String foto = resultSet.getString(8);
				String indirizzo = resultSet.getString(9);
				int verificato = resultSet.getInt(10);
				String mail = resultSet.getString(11);
				String telefono = resultSet.getString(12);
				String nascita = resultSet.getString(13);

				System.out.println("id_utente:" + id_utente);
				System.out.println("nome:" + nome);
				System.out.println("cognome:" + cognome);
				System.out.println("sesso:" + sesso);
				System.out.println("username:" + username);
				System.out.println("passwrd:" + passwrd);
				System.out.println("citta:" + citta);
				System.out.println("foto:" + foto);
				System.out.println("indirizzo:" + indirizzo);
				System.out.println("verificato:" + verificato);
				System.out.println("mail:" + mail);
				System.out.println("telefono:" + telefono);
				System.out.println("nascita:" + nascita);

				utente.setId(id_utente);
				utente.setNome(nome);
				utente.setCognome(cognome);
				utente.setSesso(sesso);
				utente.setUsername(username);
				utente.setPassword(passwrd);
				utente.setCitta(citta);
				utente.setPathFoto(foto);
				utente.setIndirizzo(indirizzo);
				utente.setVerificato(verificato);
				utente.seteMail(mail);
				utente.setnTelefono(telefono);
				utente.setDataNascita(nascita);

			}

		} catch (SQLException ex) {

			System.out.println(ex.getMessage());

			throw new DAOException(ex.getMessage(), ex);

		} finally {

			instance.close(resultSet);

			instance.close(statement);

			instance.close(connection);

		}
		return utente;

	}

	public boolean findByUserPass(String user, String pass) throws DAOException {
		String sql = "SELECT * FROM UTENTE WHERE USERNAME=? AND PASSWORD=?";
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			connection = instance.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, user);
			statement.setString(2, pass);
			resultSet = statement.executeQuery();
			if (resultSet.next()) {
				return true;
			}

		} catch (SQLException ex) {

			System.out.println(ex.getMessage());

			throw new DAOException(ex.getMessage(), ex);

		} finally {

			instance.close(resultSet);

			instance.close(statement);

			instance.close(connection);

		}

		return false;
	}

	@Override
	public void updateVerificato(String mail, int id) throws DAOException {

		String sql = "UPDATE UTENTE SET VERIFICATO = ? WHERE ID_UTENTE = ?";
		//System.out.println(sql);
		
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = instance.getConnection();
			preparedStatement = connection.prepareStatement(sql, new String[] { "ID_UTENTE" });
			preparedStatement.setString(1, "1");
			preparedStatement.setString(2, String.valueOf(id));
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		} finally {
			instance.close(preparedStatement);
			instance.close(connection);

		}
		System.out.println("verificato qui");
	}

	public void aggiorna(Utente utente) throws DAOException {
		String sql = "UPDATE UTENTE SET NOME=?, COGNOME=?, SESSO=?, USERNAME=?, PASSWORD=?,CITTA=?,UTENTE_IMMAGINE=?, INDIRIZZO=?,MAIL=?,NUMERO_TELEFONO=?,DATA_NASCITA=TO_DATE(?,'dd/mm/yyyy') WHERE ID_UTENTE=?";
		System.out.println("id:" +utente.getId());
		System.out.println("nome:" +utente.getNome());
		System.out.println("cognome:" +utente.getCognome());
		System.out.println("sesso:" +utente.getSesso());
		System.out.println("username:" +utente.getUsername());
		System.out.println("passwrd:" +utente.getPassword());
		System.out.println("citta:" +utente.getCitta());
		System.out.println("foto:" +utente.getPathFoto());
		System.out.println("indirizzo:" +utente.getIndirizzo());
		System.out.println("verificato:" +utente.getVerificato());
		System.out.println("mail:" +utente.geteMail());
		System.out.println("telefono:" +utente.getnTelefono());
		System.out.println("nascita:" +utente.getDataNascita());
		
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = instance.getConnection();
			preparedStatement = connection.prepareStatement(sql, new String[] { "ID_UTENTE" });
			preparedStatement.setString(1, utente.getNome());
			preparedStatement.setString(2, utente.getCognome());
			preparedStatement.setString(3, utente.getSesso());
			preparedStatement.setString(4, utente.getUsername());
			preparedStatement.setString(5, utente.getPassword());
			preparedStatement.setString(6, utente.getCitta());
			preparedStatement.setString(7, utente.getPathFoto());
			preparedStatement.setString(8, utente.getIndirizzo());
			preparedStatement.setString(9, utente.geteMail());
			preparedStatement.setString(10, utente.getnTelefono());
			preparedStatement.setString(11, utente.getDataNascita());
			preparedStatement.setInt(12, utente.getId());
			preparedStatement.executeUpdate();
			System.out.println(preparedStatement.toString());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		} finally {
			instance.close(preparedStatement);
			instance.close(connection);

		}
		System.out.println("aggiornato qui");
	}
	

	
	
	
}
