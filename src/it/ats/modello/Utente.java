package it.ats.modello;

import java.util.Date;

public class Utente {
 
private int id;
private String nome;
private String cognome;
private String sesso;
private String username;
private String password;
private String indirizzo;
private String citta;
private String nTelefono;
private int verificato;
private String eMail;
private String pathFoto;
private String dataNascita;

public Utente() {
	super();
	this.id = id;
	this.nome = nome;
	this.cognome = cognome;
	this.sesso = sesso;
	this.username = username;
	this.password = password;
	this.indirizzo = indirizzo;
	this.citta=citta;
	this.nTelefono = nTelefono;
	this.verificato = verificato;
	this.eMail = eMail;
	this.pathFoto = pathFoto;
	this.dataNascita=dataNascita;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getCognome() {
	return cognome;
}
public void setCognome(String cognome) {
	this.cognome = cognome;
}
public String getSesso() {
	return sesso;
}
public void setSesso(String sesso) {
	this.sesso = sesso;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getIndirizzo() {
	return indirizzo;
}
public void setIndirizzo(String indirizzo) {
	this.indirizzo = indirizzo;
}
public String getCitta() {
	return citta;
}
public void setCitta(String citta) {
	this.citta = citta;
}
public String getnTelefono() {
	return nTelefono;
}
public void setnTelefono(String nTelefono) {
	this.nTelefono = nTelefono;
}
public int getVerificato() {
	return verificato;
}
public void setVerificato(int verificato) {
	this.verificato = verificato;
}
public String geteMail() {
	return eMail;
}
public void seteMail(String eMail) {
	this.eMail = eMail;
}
public String getPathFoto() {
	return pathFoto;
}
public void setPathFoto(String pathFoto) {
	this.pathFoto = pathFoto;
}
public String getDataNascita() {
	return dataNascita;
}
public void setDataNascita(String nascita) {
	this.dataNascita = nascita;
}


@Override
public String toString() {
	return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", sesso=" + sesso + ", username="
			+ username + ", password=" + password + ", indirizzo=" + indirizzo + ", citta=" + citta + ", nTelefono="
			+ nTelefono + ", verificato=" + verificato + ", eMail=" + eMail + ", pathFoto=" + pathFoto
			+ ", dataNascita=" + dataNascita + "]";
}





	
}
