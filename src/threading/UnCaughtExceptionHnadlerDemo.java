package threading;

public class UnCaughtExceptionHnadlerDemo {

	public static void main(String[] args) throws InterruptedException {

		Thread.UncaughtExceptionHandler h = new Thread.UncaughtExceptionHandler() {
			public void uncaughtException(Thread th, Throwable ex) {
				System.out.println("Uncaught exception: " + ex);
			}
		};

		Thread t = new Thread() {
			public void run() {
				System.out.println("Sleeping ...");
				try {
					Thread.sleep(1000);
					throw new RuntimeException();
				} catch (InterruptedException e) {
					System.out.println("Throwing exception ...");
				}
				System.out.println("exception has been handled and hence i ran");
			}
		};
		t.setUncaughtExceptionHandler(h);
		t.start();
		t.join();

		System.out.println("thread failed but still i executed");
	}
}
