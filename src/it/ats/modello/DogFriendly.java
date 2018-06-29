package it.ats.modello;

import java.io.Serializable;

public class DogFriendly implements Serializable{

	private int id_DogFriendly;
	private int idAttivita;
	private String nomeAttivita;
	private String indirizzo;
	private String tipoAttivita;
	
	
	public DogFriendly(int id_DogFriendly,int idAttivita,String nomeAttivita,String indirizzo,String tipoAttivita) {
		super();
		this.id_DogFriendly = id_DogFriendly;
		this.idAttivita= idAttivita;
		this.nomeAttivita = nomeAttivita;
		this.indirizzo = indirizzo;
		this.tipoAttivita = tipoAttivita;
		
	}
	public DogFriendly() {
		super();
		
		
	}

	public int getId_DogFriendly() {
		return id_DogFriendly;
	}


	public void setId_DogFriendly(int id_DogFriendly) {
		this.id_DogFriendly = id_DogFriendly;
	}


	public int getIdAttivita() {
		return idAttivita;
	}


	public void setIdAttivita(int idAttivita) {
		this.idAttivita = idAttivita;
	}


	public String getNomeAttivita() {
		return nomeAttivita;
	}


	public void setNomeAttivita(String nomeAttivita) {
		this.nomeAttivita = nomeAttivita;
	}


	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	public String getTipoAttivita() {
		return tipoAttivita;
	}


	public void setTipoAttivita(String tipoAttivita) {
		this.tipoAttivita = tipoAttivita;
	}
}
