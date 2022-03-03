import java.util.HashSet;
import java.util.Set;

public class Test_Generics_Inheritence {

	public static void main(String[] args) {
		Set<Child> childSet = new HashSet<>();
		//setSet(childSet);
	}

		static public Double setSet(Set<Child> in) {
			Set<Parent> set = new HashSet<>();
			Set<Child> childSet = new HashSet<>();

			Parent p = new Parent();
			Child c = new Child();
			set.add(c);
			return 0.0d;
		}

	static public String setSet(HashSet<Parent> in) {
		Set<Parent> set = new HashSet<>();
		Set<Child> childSet = new HashSet<>();

		Parent p = new Parent();
		Child c = new Child();
		set.add(c);
		return "";
	}
}

class Parent {
}

class Child extends Parent {
}
