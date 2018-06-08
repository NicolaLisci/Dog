package it.ats.modello;

public class DogFriendly {

	private int id_DogFriendly;
	private int idAttivita;
	private String nomeAttivita;
	private String indirizzo;
	public DogFriendly(int id_DogFriendly, String nomeAttivita, int idAttivita) {
		super();
		this.id_DogFriendly = id_DogFriendly;
		this.nomeAttivita = nomeAttivita;
		this.idAttivita = idAttivita;
		this.indirizzo = indirizzo;
	}

	public DogFriendly() {
		super();
	}

	public int getid_DogFriendly() {
		return id_DogFriendly;
	}

	public void setid_DogFriendly(int id) {
		this.id_DogFriendly = id_DogFriendly;
	}

	public String getNomeAttivita() {
		return nomeAttivita;
	}

	public void setNomeAttivita(String nomeAttivita) {
		this.nomeAttivita = nomeAttivita;
	}

	public int getIdAttivita() {
		return idAttivita;
	}

	public void setIdAttivita(int idAttivita) {
		this.idAttivita = idAttivita;
	}
	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String toString() {
		return "DogFriendly [id_DogFriendly=" + id_DogFriendly + ", nomeAttivita=" + nomeAttivita + ", idAttivita=" + idAttivita+ ", indirizzo=" + indirizzo + "]";
	}

}
