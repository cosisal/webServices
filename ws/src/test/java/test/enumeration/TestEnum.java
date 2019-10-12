package test.enumeration;

public enum TestEnum {
	SALVO("Cosi"),
	MARIANGELA("Paradiso"),
	MARIANGELAS,
	GIORGIA("Cosi");
	
	String cognome;
	private TestEnum() {
		this.cognome = "Cosi";
	};
	
	private TestEnum(String cognome) {
		this.cognome = cognome;
	}
	
	public static void main(String[] args) {
		System.out.println(TestEnum.SALVO.cognome);
		System.out.println(TestEnum.MARIANGELA.cognome);
		System.out.println(TestEnum.MARIANGELAS.cognome);
		System.out.println(TestEnum.GIORGIA.cognome);
	}
	
	
}
