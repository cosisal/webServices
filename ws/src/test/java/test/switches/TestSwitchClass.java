package test.switches;

public class TestSwitchClass {
	public static int switchTest(int k) {
		Integer j = 1;
		switch (k) {
		case 1:
			k++;
		case 2:
			k++;
		case 3:
			k++;
		case 4:
			k++;
		case 5:
			k++;
		default:
			k++;
		}
		return j + k;
	}

	public static void calculate(int x) {
		String val;
		switch (x) {
		case 2:
		default:
			val = "def";
		}
		System.out.println(val);
	}

	public static void main(String[] args) {
		System.out.println(switchTest(1));
		calculate(288);
		Object t = new Integer(106);
		int k = ((Integer) t).intValue()/10;
		System.out.println(k);
	}
}
