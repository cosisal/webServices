package test.characters;

public class TestCharacters {
	String c;

	public void m1() {
		char[] cA = { 'a', 'b' };
		m2(c, cA);
		System.out.println(( c) + ", " + cA[1]);
	}

	public void m2(String c, char[] cA) {
		c = "b";
		cA[1] = cA[0] = 'm';
	}

	public static void main(String args[]) {
		new TestCharacters().m1();
	}
}
