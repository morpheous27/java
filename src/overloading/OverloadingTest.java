package overloading;

public class OverloadingTest {

	public void print(Object o) {
		System.out.println("Object");
	}

	public void print(Integer i) {
		System.out.println("Integer");
	}

	public void print(String s) {
		System.out.println("String");
	}

	public void print(Exception o) {
		System.out.println("Exception");
	}

	public void print(NullPointerException o) {
		System.out.println("NullPointerException");
	}

	public static void main(String[] args) {

		OverloadingTest obj = new OverloadingTest();
		obj.print("");
	}

}
