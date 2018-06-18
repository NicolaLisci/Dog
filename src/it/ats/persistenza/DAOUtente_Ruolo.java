package it.ats.persistenza;

public interface DAOUtente_Ruolo {
	void save(int id_Utente) throws DAOException ;
	void aggiorna(int id_Utente,int id_Ruolo) throws DAOException;
}
