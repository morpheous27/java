
public class InterfaceTest {

	public static void main(String[] args) {

		ParentInterface obj = new ParentInterface() {

			public void interfaceMethod1() {
				System.out.println("this has been implemented 1");

			}

			public void interfaceMethod2() {
				System.out.println("this is second method");
			}

		};

		obj.interfaceMethod2();

		ParentAbsClass objc = new ParentAbsClass() {

			int i = 5;
		};

		System.out.println("Object class value" + objc.i);

	}

}

interface ParentInterface {
	public void interfaceMethod1();
}

abstract class ParentAbsClass {

}
