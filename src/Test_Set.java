import java.util.HashSet;
import java.util.Set;

public class Test_Set {

	// static Set<Student> set = new HashSet<Student>();
	static Set<Student> set = new HashSet<Student>();

	public static void main(String[] args) {
		set.add(new Student("nitin", 101));
		set.add(new Student("nitin", 101));
		set.add(new Student("nitin", 101));
		System.out.println("size os set: " + set.size());
		System.out.println(set);
		Object[] obj = set.toArray();
		for (int i = 0; i < set.size(); i++)
			System.out.println(obj[i].toString());
	}

}

class Student implements Comparable<Student> {
	String name;
	int id;

	Student(String n, int i) {
		name = n;
		id = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int compareTo(Student arg0) {
		return this.id - arg0.id;

	}

}
