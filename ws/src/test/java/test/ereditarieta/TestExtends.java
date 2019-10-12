package test.ereditarieta;

public class TestExtends {

	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	
	public void test() {
//		b = c;
//		c = b;
		b = (D) d;
		
		System.out.println(b.letteraB);
		System.out.println(d.letteraD);
		
	}
	
	public static void main(String[] args) {
		TestExtends te = new TestExtends();
		te.test();
		
	}
	
}
