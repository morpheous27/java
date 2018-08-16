package concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEvenOddDemo {

	volatile boolean flag = false;
	Lock monitor = new ReentrantLock();
	Condition printEven = monitor.newCondition();
	Condition printOdd = monitor.newCondition();

	public static void main(String ags[]) {

		LockEvenOddDemo obj = new LockEvenOddDemo();
		FlagObject fo = new FlagObject();
		Thread ot = new Thread(new OddPrinterUsingLock(obj.monitor, obj.printEven, obj.printOdd, fo), "ODDTHREAD");
		Thread et = new Thread(new EvenPrinterUsingLock(obj.monitor, obj.printEven, obj.printOdd, fo), "EVENTHREAD");
		ot.start();
		et.start();

	}

}

class EvenPrinterUsingLock implements Runnable {

	Lock monitor;
	Condition printEven;
	Condition printOdd;
	boolean printEvenFlag;
	boolean printOddFlag;
	FlagObject flag;

	public EvenPrinterUsingLock(Lock monitor, Condition printEven, Condition printOdd, FlagObject flag) {

		this.monitor = monitor;
		this.printEven = printEven;
		this.printOdd = printOdd;
		this.flag = flag;
	}

	public void run() {

		try {
			monitor.lock();

			for (int i = 0; i < 10; i++) {
				if (i % 2 == 0) {
					while (flag.isFlag()) {
						printEven.await();
					}
					System.out.println(Thread.currentThread().getName() + " " + i);
					printOddFlag = true;
					printEvenFlag = false;
					flag.setFlag(true);
					printOdd.signalAll();
				}
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			monitor.unlock();

		}

	}
}

class OddPrinterUsingLock implements Runnable {

	Lock monitor;
	Condition printEven;
	Condition printOdd;
	boolean printEvenFlag;
	boolean printOddFlag;
	FlagObject flag;

	public OddPrinterUsingLock(Lock monitor, Condition printEven, Condition printOdd, FlagObject flag) {
		this.monitor = monitor;
		this.printEven = printEven;
		this.printOdd = printOdd;
		this.flag = flag;
	}

	public void run() {

		try {
			monitor.lock();

			for (int i = 0; i < 10; i++) {
				if (i % 2 != 0) {
					while (!flag.isFlag()) {
						printOdd.await();
					}
					System.out.println(Thread.currentThread().getName() + " " + i);
					printOddFlag = false;
					printEvenFlag = true;
					flag.setFlag(false);
					printEven.signalAll();
				}
			}

		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			monitor.unlock();

		}
	}

}

class FlagObject {
	boolean flag;

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}