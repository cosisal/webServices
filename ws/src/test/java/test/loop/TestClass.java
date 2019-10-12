package test.loop;

public class TestClass {
	int x = 5;

	int getX() {
		return x;
	}

	public static void main(String args[]) throws Exception {
		TestClass tc = new TestClass();
		// tc.looper();
		tc.foolLoop();
		System.out.println(tc.x);
	}

	public void looper() {
		int x = 0;
		while ((x = getX()) != 0) {
			for (int m = 10; m >= 0; m--) {
				x = m;
			}
		}
	}

	public void foolLoop() {
		int i = 0, j = 0;
		X1: for (i = 0; i < 3; i++) {
			X2: for (j = 3; j > 0; j--) {
				if (i < j)
					continue X1;
				else
					break X2;
			}
		}
		System.out.println(i + " " + j);
	}
}
