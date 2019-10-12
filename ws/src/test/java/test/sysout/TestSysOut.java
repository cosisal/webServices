package test.sysout;


import static java.lang.Integer.MAX_VALUE;

public class TestSysOut {
	public static void main(String[] args) {
		System.out.println("" +5 + 6); //1
		System.out.println(5 + "" +6); // 2
		System.out.println(5 + 6 +""); // 3
		System.out.println(5 + 6); // 4
		
		StringBuilder sb = new StringBuilder("mdakdjakl");
		System.out.println(MAX_VALUE);
	}
}
