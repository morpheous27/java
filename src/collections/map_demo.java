package collections;

import java.util.HashMap;
import java.util.Map;

class map_demo {
	int i = 0;

	public static void main(String args[]) {

		Map<Employee2, String> hm = new HashMap<Employee2, String>();

		Employee2 e1 = new Employee2("test1");
		Employee2 e2 = new Employee2("test2");
		/*
		 * Employee2 e3 = new Employee2("test3"); Employee2 e4 = new
		 * Employee2("test4"); Employee2 e5 = new Employee2("test5"); Employee2
		 * e6 = new Employee2("test6"); Employee2 e7 = new Employee2("test7");
		 * Employee2 e8 = new Employee2("test8"); Employee2 e9 = new
		 * Employee2("test9"); Employee2 e10 = new Employee2("test10");
		 * Employee2 e11 = new Employee2("test11"); Employee2 e12 = new
		 * Employee2("test12"); Employee2 e13 = new Employee2("test13");
		 * Employee2 e14 = new Employee2("test14"); Employee2 e15 = new
		 * Employee2("test15"); Employee2 e16 = new Employee2("test16");
		 * Employee2 e17 = new Employee2("test17"); Employee2 e18 = new
		 * Employee2("test18"); Employee2 e19 = new Employee2("test19");
		 * hm.put(e1,"value1"); hm.put(e2,"value2"); hm.put(e3,"value3");
		 * hm.put(e4,"value4"); hm.put(e5,"value5"); hm.put(e6,"value6");
		 * hm.put(e7,"value7"); hm.put(e8,"value8"); hm.put(e9,"value9");
		 * hm.put(e10,"value10"); hm.put(e11,"value11"); hm.put(e12,"value12");
		 * hm.put(e13,"value13"); hm.put(e14,"value14"); hm.put(e15,"value15");
		 * hm.put(e16,"value16"); hm.put(e17,"value17"); hm.put(e18,"value18");
		 */
		hm.put(e1, "test1");
		hm.put(e2, "test2");
		hm.size();
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}

class Employee2 {

	static int i = 0;

	String name;

	Employee2(String s) {
		name = s;
	}

	@Override
	public String toString() {
		return name;

	}

	@Override
	public int hashCode() {
		return (Integer) null;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee2))
			return false;
		Employee2 other = (Employee2) obj;
		return other.name == null ? other.name == null : this.name.equals(other.name);
	}

}