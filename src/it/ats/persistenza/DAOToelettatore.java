package it.ats.persistenza;

import java.util.List;

import it.ats.modello.Utente;

public interface DAOToelettatore {
	List<Utente> vediTutto() throws DAOException;
}
