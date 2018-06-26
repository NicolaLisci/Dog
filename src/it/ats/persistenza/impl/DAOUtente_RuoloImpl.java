package it.ats.persistenza.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import it.ats.modello.Utente;
import it.ats.modello.Utente_Ruolo;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.DAOUtente;
import it.ats.persistenza.DAOUtente_Ruolo;
import it.ats.persistenza.DataSource;

public class DAOUtente_RuoloImpl implements DAOUtente_Ruolo {
	public void save(int id_Utente) throws DAOException {

			String sql = "INSERT INTO UTENTE_RUOLO VALUES(ID_UTENTE_RUOLO_SEQ.NEXTVAL,?,2)";
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement prepareStatement = null;

		Utente_Ruolo utente_Ruolo=new Utente_Ruolo();

		try {
			
			connection = instance.getConnection();
			prepareStatement = connection.prepareStatement(sql, new String[] { "ID_UTENTE_RUOLO" });
			prepareStatement.setInt(1, id_Utente);
			
			
			
			prepareStatement.executeUpdate();

			ResultSet generatedKeys = prepareStatement.getGeneratedKeys();

			if (generatedKeys != null && generatedKeys.next()) {

				int id = generatedKeys.getInt(1);

				utente_Ruolo.setId_Utente_Ruolo(id);

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


	
	public void aggiorna(int id_Utente,int id_Ruolo) throws DAOException {

		String sql = "UPDATE UTENTE_RUOLO SET ID_UTENTE="+id_Utente+", ID_RUOLO=" +id_Ruolo+")";
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		Statement statement = null;

		try {
			connection = instance.getConnection();
				statement=connection.createStatement();
			statement.executeUpdate(sql);
			
		} catch (SQLException ex) {
			// System.out.println("qua");
			System.out.println(ex.getMessage());

			throw new DAOException(ex.getMessage(), ex);

		} finally {

			instance.close(statement);

			instance.close(connection);

		}

	}
	public Utente_Ruolo findUtente(int idUtente) throws DAOException {
		String sql = "SELECT * FROM UTENTE_RUOLO WHERE ID_UTENTE = " + idUtente + "  ";
		Utente_Ruolo utente_Ruolo = new Utente_Ruolo();
		
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

				int id_utente_ruolo = resultSet.getInt(1);
				int id_utente = resultSet.getInt(2);
				int id_ruolo = resultSet.getInt(3);
				

			

				
				utente_Ruolo.setId_Utente_Ruolo(id_utente_ruolo);
				utente_Ruolo.setId_Utente(id_utente);
				utente_Ruolo.setId_Ruolo(id_ruolo);
				
			}
		} catch (SQLException ex) {

			System.out.println(ex.getMessage());

			throw new DAOException(ex.getMessage(), ex);

		} finally {

			instance.close(resultSet);

			instance.close(statement);

			instance.close(connection);

		}
		return utente_Ruolo;

	
}
	
	public void saveIdRuolo(int id_Utente,int id_Ruolo) throws DAOException {

		String sql = "INSERT INTO UTENTE_RUOLO VALUES(ID_UTENTE_RUOLO_SEQ.NEXTVAL,?,"+id_Ruolo+")";
	DataSource instance = DataSource.getInstance();
	Connection connection = null;
	PreparedStatement prepareStatement = null;

	Utente_Ruolo utente_Ruolo=new Utente_Ruolo();

	try {
		
		connection = instance.getConnection();
		prepareStatement = connection.prepareStatement(sql, new String[] { "ID_UTENTE_RUOLO" });
		prepareStatement.setInt(1, id_Utente);
		
		
		
		prepareStatement.executeUpdate();

		ResultSet generatedKeys = prepareStatement.getGeneratedKeys();

		if (generatedKeys != null && generatedKeys.next()) {

			int id = generatedKeys.getInt(1);

			utente_Ruolo.setId_Utente_Ruolo(id);

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
}
