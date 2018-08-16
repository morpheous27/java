package concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample2 {

	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(4);
		CountDownLatch cdl = new CountDownLatch(3);

		es.execute(new Thread21(cdl, "Cache service"));
		es.execute(new Thread21(cdl, "DB connection service"));
		es.execute(new Thread21(cdl, "file check"));
		es.execute(new Thread22(cdl, "server start"));

		es.shutdown();
	}
}

class Thread21 implements Runnable {

	CountDownLatch cdlbegin;
	String serviceName;

	public Thread21(CountDownLatch cdl, String serviceName) {
		// TODO Auto-generated constructor stub
		cdlbegin = cdl;
		this.serviceName = serviceName;
	}

	public void run() {

		System.out.println("Executing service: - " + serviceName + " done");
		cdlbegin.countDown();
		System.out.println(serviceName + " done");

	}
}

class Thread22 implements Runnable {

	CountDownLatch cdlbegin;
	String serviceName;

	public Thread22(CountDownLatch cdl, String serviceName) {
		// TODO Auto-generated constructor stub
		cdlbegin = cdl;
		this.serviceName = serviceName;
	}

	public void run() {

		System.out.println("Waiting for premilinary services to start: " + serviceName + " done");
		try {
			cdlbegin.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(serviceName + " done");

	}
}
