
public class SameNameStaticNonStaticMethod implements ParentInterface1 {

	void printMeStatic() {

		System.out.println("static method interface 1");
	}

	public static void main(String[] args) {
		SameNameStaticNonStaticMethod obj = new SameNameStaticNonStaticMethod();
		obj.printMeStatic();
	}

}

interface ParentInterface1 {

	static void printMeStatic() {

		System.out.println("static method interface 1");
	}
}
