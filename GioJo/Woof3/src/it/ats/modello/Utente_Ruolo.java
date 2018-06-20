package it.ats.modello;

public class Utente_Ruolo {
	private int id_Utente_Ruolo;
	private int id_Ruolo;
	private int id_Utente;
	public Utente_Ruolo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_Utente_Ruolo() {
		return id_Utente_Ruolo;
	}
	public void setId_Utente_Ruolo(int id_Utente_Ruolo) {
		this.id_Utente_Ruolo = id_Utente_Ruolo;
	}
	public int getId_Ruolo() {
		return id_Ruolo;
	}
	public void setId_Ruolo(int id_Ruolo) {
		this.id_Ruolo = id_Ruolo;
	}
	public int getId_Utente() {
		return id_Utente;
	}
	public void setId_Utente(int id_Utente) {
		this.id_Utente = id_Utente;
	}
	public Utente_Ruolo(int id_Utente_Ruolo, int id_Ruolo, int id_Utente) {
		super();
		this.id_Utente_Ruolo = id_Utente_Ruolo;
		this.id_Ruolo = id_Ruolo;
		this.id_Utente = id_Utente;
	}
	@Override
	public String toString() {
		return "Utente_Ruolo [id_Utente_Ruolo=" + id_Utente_Ruolo + ", id_Ruolo=" + id_Ruolo + ", id_Utente="
				+ id_Utente + "]";
	}
}