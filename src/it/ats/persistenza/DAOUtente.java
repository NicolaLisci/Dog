package it.ats.persistenza;

import java.util.List;

import it.ats.modello.Utente;

public interface DAOUtente {
	
	void save(Utente utente) throws DAOException;
	Utente findUtente (String username, String email) throws DAOException;
	void delete(Utente utente) throws DAOException;
	List<Utente> findAll() throws DAOException;

	boolean findByUserPass(String user,String pass) throws DAOException;
}

