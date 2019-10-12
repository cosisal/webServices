package test.override;

public class Mammifero {
	boolean hasZampe;
	int numeroZampe;
	boolean hasMani;
	int numeroMani = 2;
	
	public int getNumeroMani() {
		return numeroMani;
		
	}
	
	public Object getNome() {
		return "Mammifero";
	}
	
	public String getxxxx() {
		return "1";
	}
	
	public static void metodoStaticoOverride() {
		System.out.println("Faccio qualcosa da mammifero");
	}
	
}
