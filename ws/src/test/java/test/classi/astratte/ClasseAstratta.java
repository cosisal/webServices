package test.classi.astratte;

abstract class ClasseAstratta {

	transient int i;
	public String variabileDiClasse = "Test";

	public ClasseAstratta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public abstract void printSomething();

	public abstract void printAnotherThing();

	public void iCanPrint() {
		System.out.println("Si può fare!!!");
		i++;
	}

	public static void iCanPrintAlone() {

		System.out.println("Si può fare staticamente!!!");
	}

	public static void main(String[] args) {

		ClasseAstratta.iCanPrintAlone();
		ClasseAstratta t = new ClasseAstratta() {

			@Override
			public void printSomething() {
				System.out.println("Voglio dire anche io la mia!!!");

			}

			@Override
			public void printAnotherThing() {
				// TODO Auto-generated method stub

			}
		};

		t.iCanPrint();
		t.printSomething();
	}

}
