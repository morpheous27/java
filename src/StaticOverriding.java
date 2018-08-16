class A {
	int i = 2;

	public static void print() {
		System.out.println("A");
	}
}

public class StaticOverriding extends A {

	int i = 3;

	public static void main(String ags[]) {
		A obj = new StaticOverriding();
		obj.print();
		System.out.println(obj.i);
		int i = 0;
		// StaticOverriding.print();
	}

	public static void print() {
		int i;
		System.out.println("B");
	}

	public void display() {
		// static int a=0;
	}
}
