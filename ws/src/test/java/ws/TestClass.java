package ws;

public class TestClass {
	
		static int a;
		int b;

	public TestClass() {
		int c;
		c = a;
		a++;
		b += c;

	}
	
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		int i;
		int j;
		for (i = 0, j = 0; j < 1 && i < 1; ++j, i++) {
			System.out.println(i + " " + j);
		}
		
		TestClass testClass = new TestClass();
		
		String c = "dada";
		
		String s = ""+63 + new Integer(10);
		
		char ch = 'd';
		
		if (true == 2 > 10)
		
		System.out.println(c.charAt(1));
		
		System.out.println(i + " " + j);
		
		System.out.println(testClass.b);
	}
}