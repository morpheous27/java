package threading;

/**
 * 
 * @author Nitin
 *
 */
public class ThreadLocalDemo {

	public static void main(String[] args) {
		SharedFlagThreadLocal sharedFlag = new SharedFlagThreadLocal(true);
		Thread oddPrinterThread = new Thread(new OddPrinterThreadLocal(sharedFlag), "OddPrinter");
		Thread evenPrinterThread = new Thread(new EvenPrinterThreadLocal(sharedFlag), "EvenPrinter");
		oddPrinterThread.start();
		evenPrinterThread.start();
	}

}

class OddPrinterThreadLocal implements Runnable {

	ThreadLocal<SharedFlagThreadLocal> localFlag = new ThreadLocal<SharedFlagThreadLocal>();

	OddPrinterThreadLocal(SharedFlagThreadLocal flag) {
		localFlag.set(flag);
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			synchronized (localFlag.get()) {
				while (localFlag.get().printEven)
					try {
						localFlag.get().wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				if (i % 2 != 0) {
					System.out.println(Thread.currentThread().getName() + " " + i);
					localFlag.get().setPrintEven(true);
					localFlag.get().notify();
				}
			}
		}

	}
}

class EvenPrinterThreadLocal implements Runnable {

	ThreadLocal<SharedFlagThreadLocal> localFlag = new ThreadLocal<SharedFlagThreadLocal>();

	EvenPrinterThreadLocal(SharedFlagThreadLocal flag) {
		localFlag.set(flag);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (localFlag.get()) {
				while (!localFlag.get().printEven)
					try {
						localFlag.get().wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				if (i % 2 == 0) {
					System.out.println(Thread.currentThread().getName() + " " + i);
					localFlag.get().setPrintEven(false);
					localFlag.get().notify();
				}
			}
		}
	}
}

class SharedFlagThreadLocal {
	boolean printEven;

	SharedFlagThreadLocal(boolean f) {
		printEven = f;
	}

	public boolean isPrintEven() {
		return printEven;
	}

	public void setPrintEven(boolean printEven) {
		this.printEven = printEven;
	}

}
