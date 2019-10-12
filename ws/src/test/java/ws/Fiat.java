package ws;

import java.io.IOException;

public class Fiat extends Macchina {
	String marca;
	String modello;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}

	private void mioMetodo(String c) throws IOException{
		System.out.println("Faccio più di qualcosa "+c);
	}
}
