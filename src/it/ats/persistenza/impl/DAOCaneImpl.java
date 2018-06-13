package it.ats.persistenza.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import it.ats.modello.Cane;
import it.ats.persistenza.DAOCane;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.DataSource;

public class DAOCaneImpl implements DAOCane {

	public void salva(Cane cane) throws DAOException {
		
		String sql = "INSERT INTO CANE VALUES(ID_CANE_SEQ.NEXTVAL,?,?,?,?,?,TO_DATE(?,'dd/mm/yyyy'),?,?,?,?)";


		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = instance.getConnection();
			preparedStatement = connection.prepareStatement(sql, new String[] { "ID_CANE" });
			preparedStatement.setString(1, cane.getTaglia());
			preparedStatement.setString(2, cane.getChip());
			preparedStatement.setString(3, cane.getSesso());
			preparedStatement.setString(4, cane.getPathFoto());
			preparedStatement.setString(5, cane.getPelo());
			preparedStatement.setString(6,cane.getDataNascita());
			preparedStatement.setInt(7, cane.getPedegree());
			preparedStatement.setInt(8, cane.getIdUtente());
			preparedStatement.setInt(9, cane.getIdRazza());
			preparedStatement.setString(10, cane.getNome());


			preparedStatement.executeUpdate();
			ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
			if (generatedKeys != null && generatedKeys.next()) {
				int id = generatedKeys.getInt(1);
				cane.setIdCane(id);
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		} finally {
			instance.close(preparedStatement);
			instance.close(connection);

		}
	}

	public void elimina(int id_cane) throws DAOException {
		String sql = "DELETE FROM CANE WHERE ID_CANE = ? ";
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = instance.getConnection();
			preparedStatement = connection.prepareStatement(sql, new String[] { "ID_CANE" });
			preparedStatement.setInt(1, id_cane);
			preparedStatement.executeUpdate();
		} catch (Exception e) {

			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);

		} finally {
			instance.close(preparedStatement);
			instance.close(connection);

		}
	}

	public Cane vediTutto(int id_cane) throws DAOException {

		String sql = "SELECT * FROM CANE WHERE ID_CANE = ?";
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = instance.getConnection();
			preparedStatement = connection.prepareStatement(sql, new String[] { "ID_CANE" });
			preparedStatement.setInt(1, id_cane);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				int id = resultSet.getInt(1);
				String taglia = resultSet.getString(2);
				String chip = resultSet.getString(3);
				String sesso = resultSet.getString(4);
				String pathImmagine = resultSet.getString(5);
				String pelo = resultSet.getString(6);
				Date dataNascita = resultSet.getDate(7);
				int pedegree = resultSet.getInt(8);
				int idUtente = resultSet.getInt(9);
				int idRazza = resultSet.getInt(10);

				Cane cane = new Cane();

				cane.setIdCane(id);
				cane.setTaglia(taglia);
				cane.setChip(chip);
				cane.setSesso(sesso);
				cane.setPathFoto(pathImmagine);
				cane.setPelo(pelo);
				cane.setDataNascita(dataNascita.toString());
				cane.setPedegree(pedegree);
				cane.setIdUtente(idUtente);
				cane.setIdRazza(idRazza);

				return cane;

			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);

		} finally {
			instance.close(preparedStatement);
			instance.close(connection);

		}
		return null;
	}

	public void aggiorna(Cane cane) throws DAOException {

		String sql = "UPDATE CANE SET TAGLIA=?, CHIP=?, SESSO=?, CANE_IMMAGINE=?, PELO=?, DATA_NASCITA=TO_DATE(?,'dd/mm/yyyy'),"
				+ "PEDEGREE=?, ID_UTENTE=?, ID_RAZZA=? WHERE ID_CANE=?";

		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = instance.getConnection();
			preparedStatement = connection.prepareStatement(sql, new String[] { "ID_CANE" });
			preparedStatement.setString(1, cane.getTaglia());
			preparedStatement.setString(2, cane.getChip());
			preparedStatement.setString(3, cane.getSesso());
			preparedStatement.setString(4, cane.getPathFoto());
			preparedStatement.setString(5, cane.getPelo());
			preparedStatement.setString(6, cane.getDataNascita());
			preparedStatement.setInt(7, cane.getPedegree());
			preparedStatement.setInt(8, cane.getIdUtente());
			preparedStatement.setInt(9, cane.getIdRazza());
			preparedStatement.setInt(10, cane.getIdCane());
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		} finally {
			instance.close(preparedStatement);
			instance.close(connection);

		}

	}
}
