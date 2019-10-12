package test.varargs;

public class TestVarArgs {
	public static void test(String a, boolean b, int... f) {}
	public static void test(int...i) {};
	
	public static void main(String[] args) {
		test();
		Integer i = 20; //3
		for (int i = 0; i < 10; i++) System.out.print(i + " "); //1
		for (int i = 10; i > 0; i--) System.out.print(i + " "); //2
		
		System.out.print(i + " "); //4
	}
	
//	public void test(int... f, String a, boolean b ) {}
}
