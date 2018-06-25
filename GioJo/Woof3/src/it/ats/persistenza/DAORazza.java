package it.ats.persistenza;

import java.util.List;
import it.ats.modello.Razza;



public interface DAORazza {
	
	List<Razza> findAll() throws DAOException;
	List<Razza> findId(int IdRazza) throws DAOException;
	List<Razza> findRazza(String razza) throws DAOException;
	String findById(int id)throws DAOException;
	
}
