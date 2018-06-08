package it.ats.persistenza;

import java.util.List;

import it.ats.modello.Studente;

public interface DAORazza {
	void save(Razza razza) throws DAOException;

	void delete(Razza razza) throws DAOException;

	List<Razza> findAll() throws DAOException;

}
