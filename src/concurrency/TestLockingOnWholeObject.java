package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLockingOnWholeObject {

	public static void main(String[] args) {
		TestLockingOnWholeObject obj = new TestLockingOnWholeObject();
		SharedObject so = new SharedObject();
		Thread t1 = new Thread(new LockingThread1(so), "Thread1");
		Thread t2 = new Thread(new LockingThread2(so), "Thread2");
		t1.start();
		t2.start();

	}

}

class LockingThread1 implements Runnable {
	SharedObject so;

	LockingThread1(SharedObject s) {

		so = s;
	}

	public void run() {
		so.printA();

	}
}

class LockingThread2 implements Runnable {
	SharedObject so;

	LockingThread2(SharedObject s) {

		so = s;
	}

	public void run() {
		so.printB();

	}
}

class SharedObject {

	Lock lock = new ReentrantLock();

	void printA() {
		// lock.lock();
		try {
			// Thread.sleep(10000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 100; i++)
			System.out.println("this is printed unblocked A");
		// lock.unlock();
	}

	void printB() {
		lock.lock();
		try {
			// Thread.sleep(10000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 100; i++)
			System.out.println("This is blocked B");
		lock.unlock();
	}

}
