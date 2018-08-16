
public class StringSwap {

	public static void main(String[] args) {

		String one = "one";
		String two = "two";

		one = one + two;
		two = one.replace(two, "");
		one = one.replace(two, "");

		System.out.println("one is -" + one);
		System.out.println("Two is -" + two);
	}

}
