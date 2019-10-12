package test.ereditarieta;

public class CA extends BA {
	private CA() {
		super();
	} // C1

	public CA(String s) {
		this();
		System.out.println("C :" + s);
	} // C2

	public CA(int i) {
	} // C3
	
	public static void main(String[] args) {
		CA ca = new CA();
	}
}