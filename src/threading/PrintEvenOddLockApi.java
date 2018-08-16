package threading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @author Nitin
 *
 */
public class PrintEvenOddLockApi {

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Thread oddPrinterThread = new Thread(new OddPrinter(lock));
		Thread evenPrinterThread = new Thread(new EvenPrinter(lock));
		oddPrinterThread.start();
		evenPrinterThread.start();
	}

	static class OddPrinter implements Runnable {

		Lock flag;

		OddPrinter(Lock flag) {
			this.flag = flag;
		}

		public void run() {

			for (int i = 0; i < 10; i++) {
				synchronized (flag) {
					while (flag.printEven)
						try {
							flag.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

					if (i % 2 != 0) {
						System.out.println(Thread.currentThread().getName() + " " + i);
						flag.setPrintEven(true);
						flag.notify();
					}
				}
			}

		}
	}

	static class EvenPrinter implements Runnable {
		Lock lock;

		EvenPrinter(Lock flag) {
			this.lock = flag;
		}

		public void run() {
				for (int i = 0; i < 10; i++) {
				. {
						while (!flag.printEven)
							try {
								flag.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}

						if (i % 2 == 0) {
							System.out.println(Thread.currentThread().getName() + " " + i);
							flag.setPrintEven(false);
							flag.notify();
						}
					}
				}
			}
	}

}

class SharedFlag {
	boolean printEven;

	SharedFlag(boolean f) {
		printEven = f;
	}

	public boolean isPrintEven() {
		return printEven;
	}

	public void setPrintEven(boolean printEven) {
		this.printEven = printEven;
	}

}
