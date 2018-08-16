package overloading;

class OverloadingHierarchyTest {

	public static void main(String[] args) {

		ChildClass obj = new ChildClass(); // Lizkov substitution

	}

}

/**
 * CDocumentation comments This is parent. What is signature for overloading -
 * 1) Name of methods should be same 2) number of parameters different 3) type
 * of parameters should be different 4) order of parameters.
 * 
 * @author nsax11
 *
 */
class ParentClass {

	void print() {
		System.out.println("nothing");
	}

	int print(int a) {
		System.out.println(a);
		return 0;
	}

	int print(long b) {
		System.out.println(b);
		return 0;
	}

	int print(long b, int c) {
		System.out.println(b + "-" + c);
		return 0;
	}

	int print(int b, long c) {
		System.out.println(b + "-" + c);
		return 0;
	}
}

/**
 * This class is a child class which will be used to demostrate the feature of
 * overloading. {@link ParentClass}}
 * 
 * @author nsax11
 *
 */
class ChildClass extends ParentClass {
	int print(int b, long c) {
		System.out.println(b + "-" + c);
		return 0;
	}

	void childMethod() {
	}
}
