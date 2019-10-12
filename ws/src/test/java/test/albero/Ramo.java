package test.albero;

public class Ramo extends Albero{
	
	protected boolean internodo;
	public boolean radici;
	
	static {System.out.println("Metodo statico di stampa");}
	
	public Ramo() {
		super();
		this.internodo = true;
		this.radici = false;
		this.corteccia = true;
	}

	public Ramo(boolean radici) {
		super(radici);
	}

	public Ramo(boolean internodo, boolean radici) {
		super();
		this.internodo = internodo;
		this.radici = radici;
	}

	public boolean hasInternodo() {
		return internodo;
	}

	public void setInternodo(boolean internodo) {
		this.internodo = internodo;
	}

	public boolean hasRadici() {
		return radici;
	}

	public void setRadici(boolean radici) {
		this.radici = radici;
	}
	
	
	
}
