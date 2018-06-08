package it.ats.modello;

import java.util.Date;

public class Cane {

	private String taglia;
	private int idCane;
	private String chip;
	private String sesso;
	private Date dataNascita;
	private int pedigree;
	private int idUtente;
	private int idRazza;
	private String pathFoto;
	private String pelo;
	
	
	public String getPelo() {
		return pelo;
	}
	public void setPelo(String pelo) {
		this.pelo = pelo;
	}
	public Cane(String taglia, int idCane, String chip, String sesso, Date dataNascita, int pedigree, int idUtente,
			int idRazza, String pathFoto, String pelo) {
		super();
		this.taglia = taglia;
		this.idCane = idCane;
		this.chip = chip;
		this.sesso = sesso;
		this.dataNascita = dataNascita;
		this.pedigree = pedigree;
		this.idUtente = idUtente;
		this.idRazza = idRazza;
		this.pathFoto = pathFoto;
		this.pelo = pelo;
	}
	public Cane() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getPedigree() {
		return pedigree;
	}
	public void setPedigree(int pedigree) {
		this.pedigree = pedigree;
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
	public String getPathFoto() {
		return pathFoto;
	}
	public void setPathFoto(String pathFoto) {
		this.pathFoto = pathFoto;
	}
	@Override
	public String toString() {
		return "Cane [taglia=" + taglia + ", idCane=" + idCane + ", chip=" + chip + ", sesso=" + sesso
				+ ", dataNascita=" + dataNascita + ", pedigree=" + pedigree + ", idUtente=" + idUtente + ", idRazza="
				+ idRazza + ", pathFoto=" + pathFoto + ", pelo=" + pelo + ", toString()=" + super.toString() + "]";
	}
	
	



}
