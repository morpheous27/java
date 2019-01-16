public class TestOverriding {

	private String bill = "small bill";

	public StaticOverriding test() {
		return null;
	}

	Number printme() {
		return 0;
	}

}

class TestOveridingSub extends TestOverriding {
	protected String bill = "small bill";

	Integer printme() throws RuntimeException{
		return 1;
	}

}

class MainImpl {
	public static void main(String ags[]) {
		TestOveridingSub obj1 = new TestOveridingSub();
		TestOveridingSub obj2 = obj1;
		TestOverriding obj3 = new TestOverriding();
		System.out.println(obj1.bill);
		System.out.println(obj2.bill);
		// System.out.println(obj3.bill); this will throws error cz bill is not
		// visbible with parent class reference.

	}
}
