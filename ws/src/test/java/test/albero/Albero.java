package test.albero;

public class Albero {

	public boolean radici;
	protected static boolean corteccia;

	public Albero() {
		super();
		this.radici = true;
		this.corteccia = true;
	}

	public Albero(boolean radici) {
		super();
		this.radici = radici;
	}

	public boolean hasRadici() {
		return radici;
	}

	public void setRadici(boolean radici) {
		this.radici = radici;
	}

}
