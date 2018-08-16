package concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchSequencetest {

	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(2);
		CountDownLatch l = new CountDownLatch(3);

		es.execute(new ThreadMemoryAllocation(l));
		es.execute(new ThreadIOConnections(l));
		es.execute(new ThreadLoadLibraries(l));
		es.execute(new EclipseStartUp(l));

		System.out.println("This is main thread");

	}

}

/**
 * Thread 1
 * 
 * @author nsax11
 *
 */
class ThreadMemoryAllocation implements Runnable {
	CountDownLatch latch;

	public ThreadMemoryAllocation(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {

		System.out.println("Thread - " + Thread.currentThread().getName() + " " + "doing memory allocation");

		latch.countDown();

	}
}

/**
 * Thread 2
 * 
 * @author nsax11
 *
 */
class ThreadIOConnections implements Runnable {

	CountDownLatch latch;

	public ThreadIOConnections(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Thread - " + Thread.currentThread().getName() + " " + "doing IO connection");

		latch.countDown();

	}
}

/**
 * Thread 3
 * 
 * @author nsax11
 *
 */
class ThreadLoadLibraries implements Runnable {

	CountDownLatch latch;

	public ThreadLoadLibraries(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Thread - " + Thread.currentThread().getName() + " " + " Loading libraries.");

		// latch.countDown();

	}
}

/**
 * FinaL Thread
 * 
 * @author nsax11
 *
 */
class EclipseStartUp implements Runnable {

	CountDownLatch latch;

	public EclipseStartUp(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out
				.println("Thread - " + Thread.currentThread().getName() + " " + "All necessary steps done. start up.");

	}
}