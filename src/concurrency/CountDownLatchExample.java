package concurrency;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {

	public static void main(String[] args) {

		ExecutorService es = Executors.newCachedThreadPool();
		CountDownLatch cdlbegin = new CountDownLatch(1 );

		for (int i = 0; i < 3; i++) {
			es.execute(new Thread2(cdlbegin));
		}
		try {
			int i = System.in.read();
			if (i != 0) {
				cdlbegin.countDown();
				// cdlbegin.countDown();
				// cdlbegin.countDown();
				System.out.println("main thread");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch bl]ock
			e.printStackTrace();
		} finally {
			es.shutdown();
		}

	}
}

class Thread2 implements Runnable {

	CountDownLatch cdlbegin;

	public Thread2(CountDownLatch cdl) {
		// TODO Auto-generated constructor stub
		cdlbegin = cdl;
	}

	public void run() {
		System.out.println("starting thread " + Thread.currentThread().getName());
		try {
			try {
				cdlbegin.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("processing starts");

		} /*
			 * catch (InterruptedException e) { // TODO Auto-generated catch
			 * block e.printStackTrace(); }
			 */
		finally {

		}

	}
}
