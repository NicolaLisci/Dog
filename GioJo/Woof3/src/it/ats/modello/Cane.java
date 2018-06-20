package it.ats.modello;

import java.util.Date;

public class Cane {

	private String nome;
	private String taglia;
	private int idCane;
	private String chip;
	private String sesso;
	private String dataNascita;
	private int pedegree;
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
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cane(String nome, String taglia, int idCane, String chip, String sesso, String dataNascita, int pedegree,
			int idUtente, int idRazza, String pathFoto, String pelo) {
		super();
		this.nome = nome;
		this.taglia = taglia;
		this.idCane = idCane;
		this.chip = chip;
		this.sesso = sesso;
		this.dataNascita = dataNascita;
		this.pedegree = pedegree;
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
	public String getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}
	public int getPedegree() {
		return pedegree;
	}
	public void setPedegree(int pedegree) {
		this.pedegree = pedegree;
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
		return "Cane [nome=" + nome + ", taglia=" + taglia + ", idCane=" + idCane + ", chip=" + chip + ", sesso="
				+ sesso + ", dataNascita=" + dataNascita + ", pedegree=" + pedegree + ", idUtente=" + idUtente
				+ ", idRazza=" + idRazza + ", pathFoto=" + pathFoto + ", pelo=" + pelo;
	}

	
	



}
