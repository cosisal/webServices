package test.passaggio.parametri;

public class TestPassaggioPerRiferimento {
	static Integer someInt = 10;

	public static void changeIt(Integer a) {
		a = 20;
	}

	public static void main(String[] args) {
		changeIt(someInt);
		System.out.println(someInt);
	}
}
