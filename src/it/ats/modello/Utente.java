package it.ats.modello;

public class Utente {
 
private int id;
private String nome;
private String cognome;
private String sesso;
private String username;
private String password;
private String indirizzo;
private String nTelefono;
private int verificato;
private String eMail;


public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
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
public String getIndirizzo() {
	return indirizzo;
}
public void setIndirizzo(String indirizzo) {
	this.indirizzo = indirizzo;
}
public String getnTelefono() {
	return nTelefono;
}
public void setnTelefono(String nTelefono) {
	this.nTelefono = nTelefono;
}
public int isVerificato() {
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


public String toString() {
	return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", sesso=" + sesso + ", username="
			+ username + ", password=" + password + ", indirizzo=" + indirizzo + ", nTelefono=" + nTelefono
			+ ", verificato=" + verificato + ", eMail=" + eMail + ", toString()=" + super.toString() + "]";
}
public Utente(int id, String nome, String cognome, String sesso, String username, String password, String indirizzo,
		String nTelefono, int verificato, String eMail) {
	super();
	this.id = id;
	this.nome = nome;
	this.cognome = cognome;
	this.sesso = sesso;
	this.username = username;
	this.password = password;
	this.indirizzo = indirizzo;
	this.nTelefono = nTelefono;
	this.verificato = verificato;
	this.eMail = eMail;
}
public Utente() {
	super();
	
}

	
}
