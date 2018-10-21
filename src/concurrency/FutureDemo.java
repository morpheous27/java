package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newCachedThreadPool();
		Future<String> result = es.submit(new Thread31());
		System.out.println("waiting for the thread to finish up");
		String rr = result.get();
	}

}

class Thread31 implements Callable<String> {

	public String call() throws Exception {

		Thread.sleep(10000);
		return "done";
	}

}
