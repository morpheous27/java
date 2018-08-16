public class FinalValueChanges {

	public static void main(String[] args) {

		FinalValueChanges obj = new FinalValueChanges();
		// Test test1 = new Test();
		String test = new String("test");
		final String varFinal = test;
		System.out.println("before=" + varFinal);
		test = new String("test2");
		System.out.println("before=" + varFinal);

		final A1 a1 = new A1();
		a1.size = 10;
		System.out.println(a1.size);
		tempMethod(a1);
		System.out.println(a1.size);

	}

	private static void tempMethod(A1 a) {
		A1 b = new A1();
		b.size = 12;
		a = b;
		System.out.println(a.size);
	}
}

class A1 {
	int size;

}
