package test.arrays;

public class TestArrays {

	public void sayHello() {
		System.out.println("Hello World ");
	} // 3
		// public static void sayHello(){ System.out.println("Static Hello World");}

	public static void main(String[] args) {
		int[] a = {};

		System.out.println(a.length);

		new TestArrays().sayHello();

		for (int i = 0; i < 3; i++) {
			System.out.print(args + " ");
		}
		
		int[] ax = { 1, 2, 3, 4 };
		int[] bx = { 2, 3, 1, 0 };
		System.out.println( ax [ (ax = bx)[3] ] );

	}

}
