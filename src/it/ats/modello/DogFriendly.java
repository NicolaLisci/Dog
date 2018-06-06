package it.ats.modello;

public class DogFriendly {

	private int id;
	private int idAttivita;
	private String nomeAttivita;

	public DogFriendly(int id, String nomeAttivita, int idAttivita) {
		super();
		this.id = id;
		this.nomeAttivita = nomeAttivita;
		this.idAttivita = idAttivita;
	}

	public DogFriendly() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String toString() {
		return "DogFriendly [id=" + id + ", nomeAttivita=" + nomeAttivita + ", idAttivita=" + idAttivita + "]";
	}

}
