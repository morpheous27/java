package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(5);
		Thread t = new Thread(new WorkerThread());

		while (true) {
			executor.submit(t);
		}

	}

}

class WorkerThread implements Runnable {

	public void run() {
		System.out.println("Thread is:" + Thread.currentThread().getName());

	}
}
