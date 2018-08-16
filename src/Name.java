
public class Name {

	public static void main(String[] args) {

		char c = 'a';
		System.out.println(c & c);
		String i = null, s = ""; // we cannot say what i points to.

		Name n = new Name();
		n.print(null);

		if (null instanceof String) {
			System.out.println("instance of String");
		}
		if (null instanceof Object) {
			System.out.println("instance of Object");
		}
		if (i instanceof Object) {
			System.out.println("i instance of Object");
		}
		if (s instanceof Object) {
			System.out.println("s instance of Object");
		}
		if (s instanceof String) {
			System.out.println("s instance of String");
		}

		if ("".equals(null)) {
			System.out.println("empty is null");
		}

		if ("" == null) { // reference check
			System.out.println("empty is null by memory comparison");
		}

	}

	void print(Object o) {
		System.out.println("object");
	}

	void print(String s) {
		System.out.println("String");
	}

}
