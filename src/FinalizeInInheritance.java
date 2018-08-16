public class FinalizeInInheritance {

	int a = 0;
	static {
		FinalizeInInheritance obj = new FinalizeInInheritance();
		System.out.println("static mehtod");
		obj.a = 12;
		obj.test();
		System.out.println(obj.a);
	}

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj = null;
	}

	void test() {
		System.out.println("test ethod");
	}

}

class SuperClass {
	protected void finalize() {
		System.out.println("superclass");

	}
}

class SubClass extends SuperClass {

	protected void finalize() {
		System.out.println("subclass");
	}
}