package concurrency;

import java.util.concurrent.Callable;

public class CallableDemo {

	Thread.UncaughtExceptionHandler h = new Thread.UncaughtExceptionHandler() {

		public void uncaughtException(Thread t, Throwable e) {
			// TODO Auto-generated method stub

		}
	};

}

class CallableThread implements Callable {

	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
