import java.util.HashMap;
import java.util.Map;

public class ImmutableObjectDemo {

	public static void main(String[] args) {

		ImmutableObject obj = new ImmutableObject("nitin", 1);

	}

}

final class ImmutableObject {
	private final String name;
	private int i;
	final private Map<String, String> map = new HashMap<>(); // map contain
																// reference to
																// hashmap k
																// object @1234

	public static void main(String[] args) {

		ImmutableObject obj = new ImmutableObject("", 1);
		obj.map.put("", "");
		// obj.map = new HashMap<>();

	}

	public ImmutableObject(String n, int i) {

		name = n;
		this.i = i;
	}

	public String getName() {
		return name;
	}

	public int getI() {
		return i;
	}

}
