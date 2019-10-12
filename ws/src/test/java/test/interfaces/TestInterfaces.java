package test.interfaces;

public class TestInterfaces {

	Worker getWorker(final int i) {
		return new Worker() {

			@Override
			public void perform_work() {
				System.out.println(i);

			}
		};
	}

	Worker getWorkers(final int i) {
		class MyWorker implements Worker {

			@Override
			public void perform_work() {
				System.out.println(i);
				
			}
			
		};
		return new MyWorker();
	}

}
