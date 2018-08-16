public class SingletonSync {

	public static void main(String[] args) {

		try {
			SingletonDemo objtest = SingletonDemo.getinstance();
			System.out.println("ban gya");
		} catch (Exception e) {
			System.out.println("ban gya mm");
			e.printStackTrace();
			System.out.println("ban gya nn");
		}
	}

}

class SingletonDemo {
	private static SingletonDemo obj;

	private SingletonDemo() {

	}

	public static SingletonDemo getinstance() {

		System.out.println("in sychronised");
		synchronized (SingletonDemo.class) {

			if (obj == null) {
				obj = new SingletonDemo();
			}
		}

		return obj;

	}
}
