package it.ats.persistenza.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.ats.modello.Cane;
import it.ats.modello.DogFriendly;

import it.ats.persistenza.DAOException;
import it.ats.persistenza.DataSource;
import it.ats.persistenza.DAODogFriendly;

public class DAODogFriendlyImpl implements DAODogFriendly {

	public List<DogFriendly> findAll() throws DAOException {

		List<DogFriendly> listDogFriendly = new ArrayList<DogFriendly>();

		String sql = "SELECT * FROM DOG_FRIENDLY ";

		DataSource instance = DataSource.getInstance();

		Connection connection = null;

		Statement statement = null;

		ResultSet resultSet = null;

		try {

			connection = instance.getConnection();

			statement = connection.createStatement();

			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				// id_friendly NUMBER PRIMARY KEY NOT NULL,
				// nomeAttivita VARCHAR2(40) NOT NULL,
				// indirizzo VARCHAR2(40) NOT NULL,
				// id_attivita NUMBER

				int idDogFriendly = resultSet.getInt(1);

				String nomeAttivita = resultSet.getString(2);
				String indirizzo = resultSet.getString(3);
				int id_attivita = resultSet.getInt(4);

				DogFriendly DogFriendlyC = new DogFriendly();

				DogFriendlyC.setid_DogFriendly(idDogFriendly);
				DogFriendlyC.setIdAttivita(id_attivita);
				DogFriendlyC.setIndirizzo(indirizzo);
				DogFriendlyC.setNomeAttivita(nomeAttivita);
				listDogFriendly.add(DogFriendlyC);

			}

		} catch (SQLException ex) {

			System.out.println(ex.getMessage());

			throw new DAOException(ex.getMessage(), ex);

		} finally {

			instance.close(resultSet);

			instance.close(statement);

			instance.close(connection);

		}

		return listDogFriendly;

	}

	@Override
	public List<DogFriendly> findId(int IdDogFriendly) throws DAOException {

		List<DogFriendly> listDogFriendly = new ArrayList<DogFriendly>();

		String sql = "SELECT * FROM DOG_FRIENDLY  WHERE id_friendly=" + IdDogFriendly;

		DataSource instance = DataSource.getInstance();

		Connection connection = null;

		Statement statement = null;

		ResultSet resultSet = null;

		try {

			connection = instance.getConnection();

			statement = connection.createStatement();

			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {
				int idDogFriendly = resultSet.getInt(1);

				String nomeAttivita = resultSet.getString(2);
				String indirizzo = resultSet.getString(3);
				int id_attivita = resultSet.getInt(4);

				DogFriendly DogFriendlyC = new DogFriendly();

				DogFriendlyC.setid_DogFriendly(idDogFriendly);
				DogFriendlyC.setIdAttivita(id_attivita);
				DogFriendlyC.setIndirizzo(indirizzo);
				DogFriendlyC.setNomeAttivita(nomeAttivita);
				listDogFriendly.add(DogFriendlyC);

			}

		} catch (SQLException ex) {

			System.out.println(ex.getMessage());

			throw new DAOException(ex.getMessage(), ex);

		} finally {

			instance.close(resultSet);

			instance.close(statement);

			instance.close(connection);

		}

		return listDogFriendly;

	}

	@Override
	public List<DogFriendly> findidAttivita(int idAttivita) throws DAOException {
		List<DogFriendly> listDogFriendly = new ArrayList<DogFriendly>();

		String sql = "SELECT * FROM DOG_FRIENDLY  WHERE id_attivita=" + idAttivita;

		DataSource instance = DataSource.getInstance();

		Connection connection = null;

		Statement statement = null;

		ResultSet resultSet = null;

		try {

			connection = instance.getConnection();

			statement = connection.createStatement();

			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				int idDogFriendly = resultSet.getInt(1);

				String nomeAttivita = resultSet.getString(2);
				String indirizzo = resultSet.getString(3);
				int id_attivita = resultSet.getInt(4);

				DogFriendly DogFriendlyC = new DogFriendly();

				DogFriendlyC.setid_DogFriendly(idDogFriendly);
				DogFriendlyC.setIdAttivita(id_attivita);
				DogFriendlyC.setIndirizzo(indirizzo);
				DogFriendlyC.setNomeAttivita(nomeAttivita);
				listDogFriendly.add(DogFriendlyC);

			}

		} catch (SQLException ex) {

			System.out.println(ex.getMessage());

			throw new DAOException(ex.getMessage(), ex);

		} finally {

			instance.close(resultSet);

			instance.close(statement);

			instance.close(connection);

		}

		return listDogFriendly;
	}

	@Override
	public List<DogFriendly> findidnome(String nome) throws DAOException {

		List<DogFriendly> listDogFriendly = new ArrayList<DogFriendly>();

		String sql = "SELECT * FROM DOG_FRIENDLY  WHERE NOMEATTIVITA=" + nome;

		DataSource instance = DataSource.getInstance();

		Connection connection = null;

		Statement statement = null;

		ResultSet resultSet = null;

		try {

			connection = instance.getConnection();

			statement = connection.createStatement();

			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				int idDogFriendly = resultSet.getInt(1);

				String nomeAttivita = resultSet.getString(2);
				String indirizzo = resultSet.getString(3);
				int id_attivita = resultSet.getInt(4);

				DogFriendly DogFriendlyC = new DogFriendly();

				DogFriendlyC.setid_DogFriendly(idDogFriendly);
				DogFriendlyC.setIdAttivita(id_attivita);
				DogFriendlyC.setIndirizzo(indirizzo);
				DogFriendlyC.setNomeAttivita(nomeAttivita);
				listDogFriendly.add(DogFriendlyC);

			}

		} catch (SQLException ex) {

			System.out.println(ex.getMessage());

			throw new DAOException(ex.getMessage(), ex);

		} finally {

			instance.close(resultSet);

			instance.close(statement);

			instance.close(connection);

		}

		return listDogFriendly;
	}

	@Override
	public List<DogFriendly> findindirizzo(String indirizzo) throws DAOException {

		List<DogFriendly> listDogFriendly = new ArrayList<DogFriendly>();

		String sql = "SELECT * FROM DOG_FRIENDLY  WHERE indirizzo=" + indirizzo;

		DataSource instance = DataSource.getInstance();

		Connection connection = null;

		Statement statement = null;

		ResultSet resultSet = null;

		try {

			connection = instance.getConnection();

			statement = connection.createStatement();

			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				int idDogFriendly = resultSet.getInt(1);

				String nomeAttivita = resultSet.getString(2);
				indirizzo = resultSet.getString(3);
				int id_attivita = resultSet.getInt(4);

				DogFriendly DogFriendlyC = new DogFriendly();

				DogFriendlyC.setid_DogFriendly(idDogFriendly);
				DogFriendlyC.setIdAttivita(id_attivita);
				DogFriendlyC.setIndirizzo(indirizzo);
				DogFriendlyC.setNomeAttivita(nomeAttivita);
				listDogFriendly.add(DogFriendlyC);

			}

		} catch (SQLException ex) {

			System.out.println(ex.getMessage());

			throw new DAOException(ex.getMessage(), ex);

		} finally {

			instance.close(resultSet);

			instance.close(statement);

			instance.close(connection);

		}

		return listDogFriendly;
	}

	@Override
	public void elimina(int id_DogFriendly) throws DAOException {

		String sql = "DELETE FROM DOG_FRIENDLY  WHERE ID_FRIENDLY  = ? ";
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = instance.getConnection();
			preparedStatement = connection.prepareStatement(sql, new String[] { "ID_FRIENDLY" });
			preparedStatement.setInt(1, id_DogFriendly);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);

		} finally {
			instance.close(preparedStatement);
			instance.close(connection);

		}
	}

	@Override
	public void salva(DogFriendly dogFriendly) throws DAOException {

		String sql = "INSERT INTO DOG_FRIENDLY  VALUES (ID_FRIENDLY_SEQ.NEXTVAL,?,?,?) ";

		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {

			connection = instance.getConnection();
		
			preparedStatement = connection.prepareStatement(sql, new String[] { "ID_FRIENDLY" });
			
			preparedStatement.setString(1, dogFriendly.getNomeAttivita());
			preparedStatement.setString(2, dogFriendly.getIndirizzo());
			preparedStatement.setInt(3, dogFriendly.getIdAttivita());
			
			preparedStatement.executeUpdate();
			
			ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
			if (generatedKeys != null && generatedKeys.next()) {
				int id = generatedKeys.getInt(1);
				dogFriendly.setid_DogFriendly(id);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		} finally {
			instance.close(preparedStatement);
			instance.close(connection);

		}
	}

}
