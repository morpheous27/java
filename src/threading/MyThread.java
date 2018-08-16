package threading;

public class MyThread {

	public static void main(String[] args) {
		Runnable r = new Runnable1();
		Thread t = new Thread(r);
		t.start();
		Runnable r2 = new Runnable2();
		Thread t2 = new Thread(r2);
		t2.start();
	}
}

class Runnable2 implements Runnable {
	public void run() {

		boolean check = true;
		while (check) {
			for (int i = 0; i < 50; i++) {
				if (i % 2 == 1)
					System.out.println(i);
				check = false;

				notify();

			}
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}

class Runnable1 implements Runnable {
	public void run() {
		boolean check = true;
		while (check) {
			for (int i = 0; i < 50; i++) {
				if (i % 2 == 0)
					System.out.println(i);
				check = false;
				notify();

			}

		}

	}
}
