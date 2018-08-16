package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSortOnValues {

	static class Employee {

		private int id;
		private String name;
		private String group;

		public Employee(int id, String name, String group) {
			super();
			this.id = id;
			this.name = name;
			this.group = group;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getGroup() {
			return group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name + " " + id + " " + group;
		}

	}

	static class EmployeeComparator implements Comparator<Map.Entry<String, Employee>> {

		public int compare(Entry<String, Employee> o1, Entry<String, Employee> o2) {
			// TODO Auto-generated method stub

			return o1.getValue().getName().compareTo(o2.getValue().getName());
		}

	}

	public static void main(String[] args) {

		Map<String, Employee> map = new HashMap<String, Employee>();
		map.put("400", new Employee(400, "nitin", "CIB"));
		map.put("100", new Employee(100, "saxena", "CB"));
		map.put("550", new Employee(500, "ashley", "CCB"));
		map.put("200", new Employee(200, "talon", "PB"));

		System.out.println("Map before sorting on name");
		for (Map.Entry e : map.entrySet())
			System.out.println(e);

		List<Map.Entry<String, Employee>> list = new ArrayList(map.entrySet());
		Collections.sort(list, new MapSortOnValues.EmployeeComparator());

		System.out.println("Map after sorting on name");

		for (Map.Entry e : list)
			System.out.println(e);

	}

}
