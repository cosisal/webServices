package test.initialization;

class AX {
	
	static int a = 1;
	
	static int[] x = new int[0];
	static {
		x[0] = 10;
	}

	public void test() {
		System.out.println(this.a);
		
	}
	
	public static void main(String[] args) {
		AX ax = new AX();
	}
}
