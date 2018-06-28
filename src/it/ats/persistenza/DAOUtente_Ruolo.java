package it.ats.persistenza;

import java.util.List;

import it.ats.modello.Utente_Ruolo;

public interface DAOUtente_Ruolo {
	void save(int id_Utente) throws DAOException ;
	void aggiorna(int id_Utente,int id_Ruolo) throws DAOException;
	List<Utente_Ruolo> findUtente(int idUtente) throws DAOException;
	void saveIdRuolo(int id_Utente,int id_Ruolo) throws DAOException ;

}
