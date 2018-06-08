package it.ats.persistenzaImpl;

public class DAORazzaImpl implements DAORazza {

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
				
				String razza = resultSet.getString(2);


				Razza razza = new Razza();

				razza.setId(id);

				razza.setMatricola(matricola);

				razza.setNome(nome);

				razza.setCognome(cognome);

				listRazza.add(razza);

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
				
				String razza = resultSet.getString(2);


				Razza razza = new Razza();

				razza.setId(id);

				razza.setMatricola(matricola);

				razza.setNome(nome);

				razza.setCognome(cognome);

				listRazza.add(razza);

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
