package concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierSequencetest {

	public static void main(String[] args) {

		ExecutorService es = Executors.newCachedThreadPool();
		CyclicBarrier l = new CyclicBarrier(3, new EclipseStartUpTest());

		es.execute(new ThreadMemoryAllocation1(l));
		es.execute(new ThreadIOConnections1(l));
		es.execute(new ThreadLoadLibraries1(l));

		System.out.println("This is main thread");

	}

}

/**
 * Thread 1
 * 
 * @author nsax11
 *
 */
class ThreadMemoryAllocation1 implements Runnable {
	CyclicBarrier latch;

	public ThreadMemoryAllocation1(CyclicBarrier latch) {
		this.latch = latch;
	}

	@Override
	public void run() {

		System.out.println("Thread - " + Thread.currentThread().getName() + " " + "doing memory allocation");

		try {
			latch.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

/**
 * Thread 2
 * 
 * @author nsax11
 *
 */
class ThreadIOConnections1 implements Runnable {

	CyclicBarrier latch;

	public ThreadIOConnections1(CyclicBarrier latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Thread - " + Thread.currentThread().getName() + " " + "doing IO connection");
		try {
			latch.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

/**
 * Thread 3
 * 
 * @author nsax11
 *
 */
class ThreadLoadLibraries1 implements Runnable {

	CyclicBarrier latch;

	public ThreadLoadLibraries1(CyclicBarrier latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Thread - " + Thread.currentThread().getName() + " " + " Loading libraries.");

		try {
			latch.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

/**
 * FinaL Thread
 * 
 * @author nsax11
 *
 */
class EclipseStartUpTest implements Runnable {

	public EclipseStartUpTest() {
	}

	@Override
	public void run() {

		System.out
				.println("Thread - " + Thread.currentThread().getName() + " " + "All necessary steps done. start up.");

	}
}