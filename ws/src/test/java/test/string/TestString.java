package test.string;

public class TestString {
	public static void main(String[] args) {
		String hello = "Hello";
		String Hello = "Hello";
		String lo = "lo";
		
		System.out.println(hello == Hello.intern());
		System.out.println(hello == ("Hel" + "lo"));
		System.out.println(hello == ("Hel"+lo));
		
		String testSubstring = "0123456";
		System.out.println(testSubstring.substring(1,3));
	}
}
