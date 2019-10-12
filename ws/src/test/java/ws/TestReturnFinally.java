package ws;

public class TestReturnFinally {
	
	int i = 5;
	
	public int luckyNumber(int seed) {
		if (seed > 10)
			return seed % 10;
		int x = 0;		
		try {
			if (seed % 2 == 0)
				throw new Exception("No Even no.");
			else
				return x;
		} catch (Exception e) {
			return 3;
		} finally {
			return 7;
		}
	}

	public static void main(String args[]) {
		int amount = 100, seed = 6;
		switch (new TestReturnFinally().luckyNumber(6)) {
		default: System.out.println("Sono default");
		case 33:
			amount = amount * 2;
		case 73:
			amount = amount * 2;
		case 63:
			amount = amount + amount;
		
		}
		System.out.println(amount);
	}
}