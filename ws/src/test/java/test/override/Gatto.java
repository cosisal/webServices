package test.override;

public class Gatto extends Mammifero {
	boolean hasCoda = true;
	boolean hasBaffi = true;
	int numeroMani = 0;
	
	public int getNumeroMani() {
		return numeroMani;
		
	}
	
	public String getNome() {
		return "Gatto";
	}
	
	public static void metodoStaticoOverride() {
		System.out.println("Faccio qualcosa da gatto");
	}
}
