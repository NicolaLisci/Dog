package it.ats.persistenza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataSource {

	private static DataSource instance;
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@172.22.179.32:1521:xe";
	private static final String USERNAME = "martino";
	private static final String PASSWORD = "martino";

	private DataSource() {

		try {

			Class.forName(DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

	}

	public static DataSource getInstance() {

		if (instance == null) {

			instance = new DataSource();

		}

		return instance;

	}

	public Connection getConnection() throws DAOException {

		try {

			return DriverManager.getConnection(URL, USERNAME, PASSWORD);

		} catch (SQLException e) {

			throw new DAOException(e.getMessage(), e);

		}

	}

	public void close(Connection connection) throws DAOException {

		try {

			if (connection != null) {

				connection.close();

			}

		} catch (SQLException e) {

			throw new DAOException(e.getMessage(), e);

		}

	}

	public void close(Statement statement) throws DAOException {

		try {

			if (statement != null) {

				statement.close();

			}

		} catch (SQLException e) {

			throw new DAOException(e.getMessage(), e);

		}

	}

	public void close(ResultSet resultSet) throws DAOException {

		try {

			if (resultSet != null) {

				resultSet.close();

			}

		} catch (SQLException e) {

			throw new DAOException(e.getMessage(), e);

		}

	}

}
