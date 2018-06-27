package it.ats.persistenza.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import it.ats.modello.Cane;

import it.ats.modello.Utente;
import it.ats.persistenza.DAODogSitter;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.DataSource;

public class DAODogSitterImpl implements DAODogSitter {

	
	public List<Utente> vediTutto() throws DAOException
	{
		List<Utente>listaDogSitter=new ArrayList<Utente>();
		String sql = "SELECT * FROM UTENTE_RUOLO WHERE ID_RUOLO = 3";
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = instance.getConnection();
			preparedStatement = connection.prepareStatement(sql, new String[] { "ID_UTENTE_RUOLO" });
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				ResultSet resultSet2=null;
				int idUtente = resultSet.getInt(2);
				System.out.println("ID UTENTE CHE é DOGSITTER"+idUtente);
				sql = "SELECT * FROM UTENTE WHERE ID_UTENTE = ?";
				preparedStatement = connection.prepareStatement(sql, new String[] { "ID_UTENTE" });				
				preparedStatement.setInt(1, idUtente);
				resultSet2 = preparedStatement.executeQuery();
				while(resultSet2.next())
				{
					Utente utente=new Utente();
					String nome=resultSet2.getString(2);
					String cognome=resultSet2.getString(3);
					String email=resultSet2.getString(11);
					String nTel=resultSet2.getString(12);
					int id=resultSet2.getInt(1);
					utente.setId(id);
					utente.setNome(nome);
					utente.setCognome(cognome);
					utente.seteMail(email);
					utente.setnTelefono(nTel);
					listaDogSitter.add(utente);
				}
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);

		} finally {
			instance.close(preparedStatement);
			instance.close(connection);

		}
		return listaDogSitter;
		
		
		
		
	}
}
