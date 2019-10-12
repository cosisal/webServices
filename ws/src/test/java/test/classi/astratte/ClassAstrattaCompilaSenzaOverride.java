package test.classi.astratte;

abstract class ClassAstrattaCompilaSenzaOverride {
	abstract void calculate();

	public static void main(String[] args) {
		System.out.println("calculating");
		ClassAstrattaCompilaSenzaOverride x = null;
		x.calculate();

		ClasseAstrattaEstesa cae = new ClasseAstrattaEstesa() {

			@Override
			public void printAnotherThing() {
				// TODO Auto-generated method stub

			}
		};

	}
}
