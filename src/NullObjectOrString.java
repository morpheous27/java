
public class NullObjectOrString {

	public static void main(String[] args) {
		NullObjectOrString obj = new NullObjectOrString();
		obj.method(null);
	}

	private void method(Object o) {
		System.out.println("null is Object" + o);
	}

	private void method(String s) {
		System.out.println("null is String" + s);
	}
}
