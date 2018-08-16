package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetWithUserTypeObjects {

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>();
		Employee emp1 = new Employee(1, "test");
		Employee emp2 = new Employee(1, "test1");
		set.add(emp1);
		set.add(emp2);
		Iterator<Employee> itr = set.iterator();
		while (itr.hasNext()) {
			emp1 = itr.next();
			System.out.println(emp1.id);
			System.out.println(emp1.name);
		}
	}
}

class Employee {
	int id;
	String name;

	Employee(int i, String n) {
		id = i;
		name = n;
	}

	@Override
	public int hashCode() {
		int result;
		result = id;
		return id;
	}

	@Override
	public boolean equals(Object o) {
		Employee e = (Employee) o;
		if (this.id == e.id) {
			return true;
		} else {
			return false;
		}

	}
}
