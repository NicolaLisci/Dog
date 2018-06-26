package it.ats.persistenza;

import java.util.List;

import it.ats.modello.Cane;

import it.ats.modello.Utente;

public interface DAODogSitter {

	List<Utente> vediTutto() throws DAOException;
}
