
public class StaticOverride {

	public static void main(String[] args) {
		ParentStatic p = new ChildStatic();
		p.method();
	}

}

class ParentStatic {

	public static void method() {
		System.out.println("parent");
	}
}

class ChildStatic extends ParentStatic {
	public static void method() {
		System.out.println("parent");
	}
}
