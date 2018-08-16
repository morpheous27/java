package concurrency;

public class Race {

	private static String winner = null;

	public synchronized static void finished() {
		if (winner == null)
			winner = Thread.currentThread().getName();
	}

	public static void main(String[] args) throws InterruptedException {
		Thread a1 = new Thread(new Athelete(), "Ronaldo");
		Thread a2 = new Thread(new Athelete(), "Messi");
		a1.start();
		a2.start();
		a1.join();
		a2.join();
		if (null != winner) {
			System.out.println(winner + "is the winner");
		}
	}

}

class Athelete implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " is running.");
		}

		Race.finished();

	}

}
