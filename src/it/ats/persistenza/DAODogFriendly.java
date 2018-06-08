package it.ats.persistenza;

import java.util.List;

import it.ats.modello.DogFriendly;


public interface DAODogFriendly {
	List<DogFriendly> findAll() throws DAOException;
	List<DogFriendly> findId(int id_DogFriendly) throws DAOException;
	List<DogFriendly> findidAttivita(int idAttivita) throws DAOException;
	List<DogFriendly> findidnome(String nome) throws DAOException;
	List<DogFriendly> findindirizzo(String indirizzo) throws DAOException;
	
}

