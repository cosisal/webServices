package test.loop;

public class TestLoop {
	
	String da;
	
	public TestLoop() {
		// TODO Auto-generated constructor stub
	}
	
	public TestLoop(String da) {
		
		this();
		this.da = da;
	}
	
	void daod() {
		
		
	}
	
	public static void main(String args[]) {
//		int i;
//		int j;
//		for (i = 0;  i < 10 ; i++) {
//			System.out.println(i);
//		}
//
//		for (i = 0;  i < 10 ; ++i) {
//			System.out.println(i);
//		}
		
		
		for (double d = Math.random(); d < 0.5; d = Math.random()) {
			System.out.println(d);
		}			
	}
}
