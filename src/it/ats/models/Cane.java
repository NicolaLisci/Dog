package it.ats.modello;

import java.util.Date;

public class Cane {

	private String taglia;
	private int idCane;
	private String chip;
	private String sesso;
	private Date dataNascita;
	private boolean Pedigree;
	private int idUtente;
	private int idRazza;

	public Cane(String taglia, int idCane, String chip, String sesso, Date dataNascita, boolean pedigree, int idUtente,
			int idRazza) {
		super();
		this.taglia = taglia;
		this.idCane = idCane;
		this.chip = chip;
		this.sesso = sesso;
		this.dataNascita = dataNascita;
		Pedigree = pedigree;
		this.idUtente = idUtente;
		this.idRazza = idRazza;
	}

	public Cane() {
		super();
	}

	public String getTaglia() {
		return taglia;
	}

	public void setTaglia(String taglia) {
		this.taglia = taglia;
	}

	public int getIdCane() {
		return idCane;
	}

	public void setIdCane(int idCane) {
		this.idCane = idCane;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public boolean isPedigree() {
		return Pedigree;
	}

	public void setPedigree(boolean pedigree) {
		Pedigree = pedigree;
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}

	public int getIdRazza() {
		return idRazza;
	}

	public void setIdRazza(int idRazza) {
		this.idRazza = idRazza;
	}

	@Override
	public String toString() {
		return "Cane [taglia=" + taglia + ", idCane=" + idCane + ", chip=" + chip + ", sesso=" + sesso
				+ ", dataNascita=" + dataNascita + ", Pedigree=" + Pedigree + ", idUtente=" + idUtente + ", idRazza="
				+ idRazza + "]";
	}

}
