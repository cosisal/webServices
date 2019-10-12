package test.arrays;

public class TestArrayCopy {

	public static void main(String[] args) {
		
		int[] scores1 = { 1, 2, 3, 4, 5, 6};
		int[] scores2 = { 0, 0, 0, 0, 0, 0};
		
		System.arraycopy(scores2, 2, scores1, 3, 2);
		
		for(int i : scores2) System.out.print(i);
		
		for(int i : scores1) System.out.print(i);
		
		System.out.println(true||false); 
		
		boolean b = true|false;
		
		boolean bint = (10<11);
		
		System.out.println(b);
		
	}
	
}
