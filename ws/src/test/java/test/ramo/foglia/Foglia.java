package test.ramo.foglia;

import test.albero.Ramo;

public class Foglia extends Ramo {
	
	boolean stomi;
	
	public Foglia() {
		super();
		this.stomi = true;
		System.out.println("Corteccia: "+Foglia.corteccia);
	}

	public Foglia(boolean internodo, boolean radici) {
		super(internodo, radici);
	}

	public Foglia(boolean stomi) {
		super();
		this.stomi = stomi;
	}

	public boolean hasStomi() {
		return stomi;
	}

	public void setStomi(boolean stomi) {
		this.stomi = stomi;
		this.internodo = false;
	}
	
}
