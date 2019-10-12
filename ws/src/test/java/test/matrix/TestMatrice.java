package test.matrix;

public class TestMatrice {

	public static void main(String args[]) {
		String[][][] arr = 
		{ 
				{ 
					{ "a", "b", "c" }, { "d", "e", null } 
				}, 
				{ 
					{ "x" }, null 
				}, 
				{ 
					{ "y" } 
				},
				{ 
					{ "z", "p" }, {} 
				} 
		};
		System.out.println(arr[1][1][0]);
	}
}
