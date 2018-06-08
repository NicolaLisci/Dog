package it.ats.persistenza;

import java.util.List;

import it.ats.modello.Utente;

public interface DAOUtente {
	
	void save(Utente utente) throws DAOException;

	void delete(Utente utente) throws DAOException;

	List<Utente> findAll() throws DAOException;


}
