package it.ats.persistenzaImpl;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

public class DAODogFriendly implements DAORazza{
	

		@Override
		public List<Razza> findAll() throws DAOException {

			List<Razza> listRazza = new ArrayList<Razza>();

			String sql = "SELECT * FROM RAZZE";

			DataSource instance = DataSource.getInstance();

			Connection connection = null;

			Statement statement = null;

			ResultSet resultSet = null;

			try {

				connection = instance.getConnection();

				statement = connection.createStatement();

				resultSet = statement.executeQuery(sql);

				while (resultSet.next()) {

					int id = resultSet.getInt(1);

					int matricola = resultSet.getInt(2);

					String nome = resultSet.getString(3);

					String cognome = resultSet.getString(4);

					Razza razza = new Razza();

					studente.setId(id);

					studente.setMatricola(matricola);

					studente.setNome(nome);

					studente.setCognome(cognome);

					listRazza.add(studente);

				}

			} catch (SQLException ex) {

				System.out.println(ex.getMessage());

				throw new DAOException(ex.getMessage(), ex);

			} finally {

				instance.close(resultSet);

				instance.close(statement);

				instance.close(connection);

			}

			return listRazza;

		}


}
