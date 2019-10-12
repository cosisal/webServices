package ws;

import java.io.IOException;

public class Macchina {
	String alimentazione;
	int numeroRuote;
	int numeroPorte;
	public String getAlimentazione() {
		return alimentazione;
	}
	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	public int getNumeroRuote() {
		return numeroRuote;
	}
	public void setNumeroRuote(int numeroRuote) {
		this.numeroRuote = numeroRuote;
	}
	public int getNumeroPorte() {
		return numeroPorte;
	}
	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}
	
	private final void mioMetodo(String c) throws ArrayIndexOutOfBoundsException, Exception, IOException {
		System.out.println("Faccio qualcosa " + c);
	}
}
