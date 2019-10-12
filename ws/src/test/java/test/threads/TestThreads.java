package test.threads;

/**
 * @author salvo
 *
 */
public class TestThreads extends Thread {
	static Thread t1, t2, t3;

	
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		t1 = new Thread(new TestThreads());
		t2 = new Thread(new TestThreads());
		t3 = new Thread(new TestThreads());
		t1.start();
		t2.start();
		t3.start();
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.print(Thread.currentThread().getId() + " ");
			if (i == 250)
				try {
					System.out.print("**" + t1.getId() + "**");
					t1.sleep(600);
				} catch (Exception e) {
				}
		}
	}
}
