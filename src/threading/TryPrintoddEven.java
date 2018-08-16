package threading;

public class TryPrintoddEven {

	public static void main(String args[]) {
		SharedVariable sharedFlag = new SharedVariable(true);
		Thread evenThread = new Thread(new PrintOddThread(sharedFlag));
		Thread oddThread = new Thread(new PrintEvenThread(sharedFlag));
		evenThread.start();
		oddThread.start();

	}
}

class PrintOddThread implements Runnable {
	SharedVariable flag;

	PrintOddThread(SharedVariable flag) {
		this.flag = flag;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (flag) {
				while (!flag.flag) {
					try {
						flag.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				if (i % 2 != 0) {
					System.out.println(" i ==== " + i);
					flag.setflag(false);
					flag.notify();
				}
			}
		}
	}

}

class PrintEvenThread implements Runnable {
	SharedVariable flag;

	PrintEvenThread(SharedVariable flag) {
		this.flag = flag;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (flag) {
				while (flag.flag) {
					try {
						flag.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (i % 2 == 0) {
						System.out.println(" i ==== " + i);
						flag.setflag(true);
						flag.notify();
					}
				}
			}
		}
	}
}

class SharedVariable {
	boolean flag;

	SharedVariable(boolean value) {
		flag = value;
	}

	public boolean flagStatus() {
		return flag;
	}

	public void setflag(boolean flagvalue) {
		flag = flagvalue;
	}
}