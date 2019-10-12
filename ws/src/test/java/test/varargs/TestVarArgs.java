package test.varargs;

public class TestVarArgs {
	public static void test(String a, boolean b, int... f) {}
	public static void test(int...i) {};
	
	public static void main(String[] args) {
		test();
		Integer i = 20; //3
		for (int i1 = 0; i1 < 10; i1++) System.out.print(i1 + " "); //1
		for (int i1 = 10; i1 > 0; i1--) System.out.print(i1 + " "); //2
		
		System.out.print(i + " "); //4
	}
	
//	public void test(int... f, String a, boolean b ) {}
}
