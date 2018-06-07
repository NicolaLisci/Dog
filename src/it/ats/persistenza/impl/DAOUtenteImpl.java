package it.ats.persistenza.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import it.ats.modello.Utente;
import it.ats.persistenza.DAOException;
import it.ats.persistenza.DAOUtente;
import it.ats.persistenza.DataSource;

public class DAOUtenteImpl implements DAOUtente{

	public void save(Utente utente) throws DAOException {
		
		String insert = "INSERT INTO UTENTE VALUES(ID_UTENTE_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,";
		String data = "TO_DATE('?','dd/mm/yyyy');";
		String sql = insert + data;
		System.out.println(sql);
		//INSERT INTO UTENTE VALUES (ID_UTENTE_SEQ.NEXTVAL,'NICOLA','LISCI','UOMO','NICOLALISCI','PASSWORD','CAGLIARI','N','VIA BELLINI 6',1,'LISCINICOLA@LIVE.IT','3463178172',TO_DATE('22/12/1990', 'dd/mm/yyyy'));
		DataSource instance = DataSource.getInstance();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		
//		ID_UTENTE
//		NOME
//		COGNOME
//		SESSO
//		USERNAME
//		PASSWORD
//		CITTA
//		UTENTE_IMMAGINE
//		INDIRIZZO
//		VERIFICATO
//		MAIL
//		NUMERO_TELEFONO
//		DATA_NASCITA 13
		

		
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
			
			prepareStatement.executeUpdate();

			ResultSet generatedKeys = prepareStatement.getGeneratedKeys();

//			if (generatedKeys != null && generatedKeys.next()) {
//
//				int id = generatedKeys.getInt(1);
//
//				studente.setId(id);
//
//			}

		} catch (SQLException ex) {

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

}
