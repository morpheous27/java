
public class ThreadExampleOne {
	static int temp = 0;

	public static void main(String ags[]) throws InterruptedException {
		T obj = new T();
		// int i =0;
		// i=i+1;
		// System.out.println(i);
		// i=i+1;
		// System.out.println(i);
		// obj.sleep(1000);
		T obj2 = new T();
		// obj.sleep(5000);
		obj.start();
		obj2.start();
		// obj.display();
		// obj2.display();

	}
}

class T extends Thread {
	static int i = 0;

	public void run() {
		i++;
		System.out.println("i:" + Thread.currentThread().getName() + i);
	}

	public void display() {

		System.out.println("this is counter" + ThreadExampleOne.temp++);
	}

}
