package ws;

public class TestMacchina {
	
	public static void main(String[] args) {
		Macchina m = new Macchina();
		Fiat f = new Fiat();
		
		m.setAlimentazione("benzina");
		m.setNumeroPorte(5);
		m.setNumeroRuote(4);
		
		f.setAlimentazione("benzinassssssssssssssssss");
		f.setMarca("fiat");
		f.setModello("tipo");
		f.setNumeroPorte(5);
		f.setNumeroRuote(4);
		
//		m = f;
		f = (Fiat) m;
		
		System.out.println(m.getAlimentazione());
		System.out.println(f.getModello());
		System.out.println(f.getAlimentazione());
		
	}
	
	
}
