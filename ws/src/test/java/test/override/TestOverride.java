package test.override;

import java.util.Stack;

public class TestOverride {
	
	static char c;
	
	public static void main(String[] args) {

		Mammifero m = new Cane();
		
		System.out.println(m.getNumeroMani());
		System.out.println(m.numeroMani);
		
		System.out.println(m.getNome());
		System.out.println(c);
		
		int a = 0;
		String b = "b";
		
		System.out.println(a+b);
		
		Stack s = new Stack<>();
		
		A o1 = new C( );
		B o2 = (B) o1;
		
		System.out.println(o1.m1() );
		System.out.println(o2.m1());
		
		
		
	}

}
