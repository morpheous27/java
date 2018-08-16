package concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author Nitin :- The below mentioned program simulates the scenario of
 *         webserver which starts only when all the dependencies are fullfilled.
 */
public class CyclicBarrierExample {

	public static void main(String[] args) {

		CyclicBarrier cyclicBarrier = new CyclicBarrier(10, new Runnable() {
			public void run() {
				System.out.println("All necessary files have been loaded. Starting servicing requests...");
			}
		});

		System.out.println("starting server");
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			executorService.execute(new Thread1(cyclicBarrier, i));
		}
		// System.out.println("Shutting down thread services.");
		executorService.shutdown();
		cyclicBarrier.reset();

	}
}

class Thread1 extends Thread {
	// class Thread1 implements Callable<Integer> {
	CyclicBarrier cb;
	int threadNo;

	Thread1(CyclicBarrier c, int counter) {
		cb = c;
		threadNo = counter;
	}

	public void run() {
		System.out.println("loading class libraries part " + threadNo + "...");
		try {
			cb.await();
		} catch (InterruptedException e) {

			e.printStackTrace();
		} catch (BrokenBarrierException e) {

			e.printStackTrace();
		}
		System.out.println("libraries part " + threadNo + " done.");
	}

	// public Integer call() throws Exception {
	// System.out.println("loading class libraries part " + threadNo + "...");
	// try {
	// cb.await();
	// } catch (InterruptedException e) {
	//
	// e.printStackTrace();
	// } catch (BrokenBarrierException e) {
	//
	// e.printStackTrace();
	// }
	// System.out.println("libraries part " + threadNo + " done.");
	// return null;
	// }

}
