package test.threads;

public class TetstArguments {

	
	private static void moreInteger(int... args) {
		int n = 1;
		
		System.out.println(args[n = 8-6+3]);
		float f =  (float) 1234567890;
		int i = 1234567890;
		
		System.out.println(n);
		
		System.out.println(f);
		System.out.println((int)f);
		
		System.out.println(i-(int)f);
	}
	public static void main(String[] args) {
		TetstArguments.moreInteger(1,2,3,4,5,6,7);
		
		
		
	}
}
