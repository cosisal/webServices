package test;

public class NoCatch {

	public static void main(String[] args) {
		try {
			throw new Exception();
		}finally {
			System.out.println("dadsada");
		}
	}
}
