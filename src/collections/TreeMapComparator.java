package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapComparator {

	public static void main(String[] args) {

		// Map<TreeMapKey, String> map = new TreeMap<TreeMapKey,String>();

		Map<TreeMapKey, String> map = new TreeMap<TreeMapKey, String>(new TreeKeyCustomComparator());

		List<Map.Entry<TreeMapKey, String>> list = new ArrayList<Map.Entry<TreeMapKey, String>>();

		map.put(new TreeMapKey(1, "one"), "one");
		map.put(new TreeMapKey(2, "two"), "two");
		map.put(new TreeMapKey(3, "three"), "three");
		map.put(new TreeMapKey(4, "four"), "four");
		map.put(new TreeMapKey(5, "five"), "five");

		for (Map.Entry<TreeMapKey, String> e : map.entrySet()) {
			list.add(e);
		}

		Collections.sort(list, new Comparator() {

			public int compare(Object o1, Object o2) {
				Map.Entry<TreeMapKey, String> ot1 = (Entry<TreeMapKey, String>) o1;
				Map.Entry<TreeMapKey, String> ot2 = (Entry<TreeMapKey, String>) o2;
				return ot1.getValue().compareTo(ot2.getValue());
			}
		});

		for (Map.Entry<TreeMapKey, String> e : list) {
			System.out.println("key-" + e.getKey().id);
			System.out.println("value-" + e.getValue());
		}

		/*
		 * for (Map.Entry<TreeMapKey, String> e : map.entrySet()) {
		 * System.out.println("key-" + e.getKey().id);
		 * System.out.println("value-" + e.getValue()); }
		 */

	}

}

class TreeMapKey implements Comparable<TreeMapKey> {
	int id;
	String name;

	TreeMapKey(int id, String n) {
		this.id = id;
		name = n;
	}

	@Override
	public boolean equals(Object o) {
		return false;

	}

	@Override
	public int hashCode() {
		return 17 * this.id + 31;
	}

	public int compareTo(TreeMapKey o) {
		return this.name.compareTo(o.name);
	}

}

class TreeKeyCustomComparator implements Comparator<TreeMapKey> {

	public int compare(TreeMapKey o1, TreeMapKey o2) {
		return o1.id - o2.id;
	}
}

class TreeValueComparator implements Comparator<Map.Entry<TreeMapKey, String>> {

	public int compare(Entry<TreeMapKey, String> o1, Entry<TreeMapKey, String> o2) {
		return o1.getValue().compareTo(o2.getValue());
	}
}