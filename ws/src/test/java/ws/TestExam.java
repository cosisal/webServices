package ws;

import java.util.ArrayList;

public class TestExam {

	public static void main(String[] args) {
		StringBuilder b1 = new StringBuilder("snorkler");
		StringBuilder b2 = new StringBuilder("yoodler");
		
		
		b1.replace(0, 3, "xxxxxxx");
		System.out.println(b1);
		
		
		char c = 65535;
		
		System.out.println(Character.BYTES);
		
		
		String abcdefghi = "abcdefghi";
		
		ArrayList<Integer> djak = new ArrayList<>();
		
		System.out.println(abcdefghi.substring(1,5));
		
		String prova = "jdakjda";
		
		switch  (prova) {
		case "djaks": System.out.println("pippo");
		case "jdakjda": System.out.println("dXjXjXjhauhdahdjka");
		default: System.out.println("paperino");
		break; 
		}
		
		int index = 1;
		String[] strArr = new String[5];
		String myStr = strArr[index];
		
		for (String string : strArr) {
			System.out.println(string);
		}
		
//		System.out.println(myStr);
		
		int x = 10;
		do {
			x--;
			System.out.println(x); // 1
		} while (x < 10);
		
	}

}
