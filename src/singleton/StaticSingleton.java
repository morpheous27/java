package singleton;

public class StaticSingleton {

	public static void main(String[] args) {
		System.out.println(SingletonUsingStatic.number);
	}

}

class SingletonUsingStatic {

	SingletonUsingStatic() {

		System.out.println("constructor called.");
	}

	static {

		System.out.println("called on class load");

	}
	public static SingletonUsingStatic instance = new SingletonUsingStatic();

	public static int number = 12;

}
