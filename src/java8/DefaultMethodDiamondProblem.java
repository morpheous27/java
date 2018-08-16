package java8;

public class DefaultMethodDiamondProblem implements Interface1, Interface2 {

	public static void main(String[] args) {

		DefaultMethodDiamondProblem obj = new DefaultMethodDiamondProblem();
		obj.printMe();

		Interface1.printMeStatic();
	}

	@Override
	public void printMe() {
		// TODO Auto-generated method stub
		Interface1.super.printMe();
	}

}

interface Interface1 {
	default void printMe() {

		System.out.println("default method interface 1");
	}

	static void printMeStatic() {

		System.out.println("static method interface 1");
	}

}

interface Interface2 {
	default void printMe() {

		System.out.println("default method interface 2");
	}

	static void printMeStatic() {

		System.out.println("static method interface 2");
	}
}
