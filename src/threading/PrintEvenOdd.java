package threading;

/**
 * 
 * @author Nitin
 *
 */
public class PrintEvenOdd {

	public static void main(String[] args) {
		SharedFlagThreadLocal sharedFlag = new SharedFlagThreadLocal(true);
		Thread oddPrinterThread = new Thread(new OddPrinterThreadLocal(sharedFlag), "OddPrinter");
		Thread evenPrinterThread = new Thread(new EvenPrinterThreadLocal(sharedFlag), "EvenPrinter");
		oddPrinterThread.start();
		evenPrinterThread.start();
	}

}

class OddPrinter implements Runnable {

	SharedFlagThreadLocal flag;

	OddPrinter(SharedFlagThreadLocal flag) {
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

class EvenPrinter implements Runnable {
	SharedFlagThreadLocal flag;

	EvenPrinter(SharedFlagThreadLocal flag) {
		this.flag = flag;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (flag) {
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
