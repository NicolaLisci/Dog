package it.ats.modello;

public class TipoAttivita {
	private int id;
	private String tipoAttivita;
	
	
	public TipoAttivita() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TipoAttivita(int id, String tipoAttivita) {
		super();
		this.id = id;
		this.tipoAttivita = tipoAttivita;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTipoAttivita() {
		return tipoAttivita;
	}


	public void setTipoAttivita(String tipoAttivita) {
		this.tipoAttivita = tipoAttivita;
	}



	public String toString() {
		return "TipoAttivita [id=" + id + ", tipoAttivita=" + tipoAttivita + ", toString()=" + super.toString() + "]";
	}

}
