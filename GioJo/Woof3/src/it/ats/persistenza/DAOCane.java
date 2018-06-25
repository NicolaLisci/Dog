package it.ats.persistenza;

import java.util.List;

import it.ats.modello.Cane;

public interface DAOCane {
void salva(Cane cane) throws DAOException;
void aggiorna(Cane cane) throws DAOException;
void elimina(int idCane) throws DAOException;
Cane vediTutto( int id_cane) throws DAOException;
List<Cane> elencoCani(int idUtente) throws DAOException;	

}
