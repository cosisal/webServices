package test.ereditarieta;

public class SubClass extends SuperClass {
	int i, j, k;

	public SubClass(int m, int n) {
		i = m;
		j = (int) Math.round(0.6);
		
	} // 1

	public SubClass(int m) {
		super(m);
	} // 2
	
	
	public static void main(String[] args) {
		SubClass sc = new SubClass(0, 0);
		System.out.println(sc.j);
		
		
		String [] s = {"Ciao"};
		
		System.out.println(s.length);
		
		System.out.println("12345".charAt(6));
	}
}
