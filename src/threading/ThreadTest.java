package threading;

import java.util.HashSet;
import java.util.Set;

public class ThreadTest {
	Set<Integer> set = new HashSet<Integer>();

	void print(int i) {

		synchronized (ThreadTest.class) {
			if (!set.contains(i)) {
				System.out.println(i);
				set.add(i);
			}
		}

	}

	public static void main(String[] args) {
		final ThreadTest tt = new ThreadTest();
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++)
					tt.print(i);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++)
					tt.print(i);
			}
		};

		t1.start();
		t2.start();
	}
}
