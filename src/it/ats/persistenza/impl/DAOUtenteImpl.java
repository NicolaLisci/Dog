package it.ats.persistenza.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import it.ats.modello.Utente;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.DAOUtente;
import it.ats.persistenza.DataSource;

public class DAOUtenteImpl implements DAOUtente{

	public void save(Utente utente) throws DAOException {
		
		String insert = "INSERT INTO UTENTE VALUES(ID_UTENTE_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,";
		String data = "TO_DATE(?,'dd/mm/yyyy'))";
		String sql = insert + data;
		System.out.println(sql);
		//INSERT INTO UTENTE VALUES (ID_UTENTE_SEQ.NEXTVAL,'NICOLA','LISCI','UOMO','NICOLALISCI','PASSWORD','CAGLIARI','N','VIA BELLINI 6',1,'LISCINICOLA@LIVE.IT','3463178172',TO_DATE('22/12/1990', 'dd/mm/yyyy'));
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		
//		ID_UTENTE
//	1	NOME
//	2	COGNOME
//	3	SESSO
//	4	USERNAME
//	5	PASSWORD
//	6	CITTA
//	7	UTENTE_IMMAGINE
//	8	INDIRIZZO
//	9	VERIFICATO
//	10	MAIL
//	11	NUMERO_TELEFONO
//	12	DATA_NASCITA 
		

		
		try {
			connection = instance.getConnection();
			prepareStatement = connection.prepareStatement(sql, new String[] { "ID_UTENTE" });
			//prepareStatement.setInt(1, utente.getId());
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
			System.out.println("qua");
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
		// TODO Auto-generated method stub
		return null;
	}

	public Utente findUtente(String username, String email) throws DAOException {
		String select1 = "SELECT * FROM UTENTE WHERE USERNAME = ";
		+ username + 
		String select2 = " AND MAIL = "
		+ email + " ";
		
		String query  = select1 + username + 
		System.out.println(sql); 
		
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {

			connection = instance.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while (resultSet.first()) {
				
	
			}

		} catch (SQLException ex) {

			System.out.println(ex.getMessage());

			throw new DAOException(ex.getMessage(), ex);

		} finally {

			instance.close(resultSet);

			instance.close(statement);

			instance.close(connection);

		}

		
		}
		return null;
	}

}
