package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String args[]) {
		int count[] = { 34, 22, 10, 60, 30, 22 };
		Set<ListObject> set = new HashSet<ListObject>();
		try {

			/*set.add(new ListObject(2, new StringBuilder("two"), 200));
			set.add(new ListObject(1, new StringBuilder("one"), 100));
			set.add(new ListObject(3, new StringBuilder("three"), 300));// 1
			set.add(new ListObject(3, new StringBuilder("three"), 300));*/// 2

			System.out.println(set);

			StringBuilder s1 = new StringBuilder("one");
			StringBuilder s2 = new StringBuilder("one");
			if (s1.toString().equals(s2.toString())) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}

			/*
			 * TreeSet sortedSet = new TreeSet<Integer>(set);
			 * System.out.println("The sorted list is:");
			 * System.out.println(sortedSet); System.out.println(set);
			 * 
			 * System.out.println("The First element of the set is: " +
			 * (Integer) sortedSet.first()); System.out.println(
			 * "The last element of the set is: " + (Integer) sortedSet.last());
			 * 
			 * ListIterator li = (ListIterator) sortedSet.iterator(); while
			 * (li.hasNext()) { System.out.println("hello" + li.next()); }
			 */
		} catch (Exception e) {
		}
	}
}
