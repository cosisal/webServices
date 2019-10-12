package test.ereditarieta;

class ABCD {
	int x = 10;
	static int y = 20;
}

class MNOP extends ABCD {
	int x = 30;
	static int y = 40;
}

public class TestClass {
	public static void main(String[] args) {
		
		MNOP edfg = new MNOP();
		MNOP abcd = new MNOP();
		
		System.out.println( edfg.x+ ", " + abcd.y);
	}
}