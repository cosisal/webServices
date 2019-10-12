package test.costruttori;

public class ClasseCostruttorePrivata {
	private ClasseCostruttorePrivata(){
		
	}
	private class SottoclassePrivata{
		public SottoclassePrivata() {}
	}
	
	SottoclassePrivata scp;
	
	public void setScp() {
		scp = new SottoclassePrivata();
	}
}
