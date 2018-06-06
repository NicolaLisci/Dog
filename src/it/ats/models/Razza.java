package it.ats.modello;

public class Razza {

	private int idRazza;
	private String razza;

	public Razza(int idRazza, String razza) {
		super();
		this.idRazza = idRazza;
		this.razza = razza;
	}

	public Razza() {
		super();
	}

	public int getIdRazza() {
		return idRazza;
	}

	public void setIdRazza(int idRazza) {
		this.idRazza = idRazza;
	}

	public String getRazza() {
		return razza;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}

	@Override
	public String toString() {
		return "Razza [idRazza=" + idRazza + ", razza=" + razza + "]";
	}
}
