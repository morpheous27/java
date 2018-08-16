package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorting {

	public static void main(String ags[]) {
		ListSorting obj = new ListSorting();
		List<ListObject> list = new ArrayList<ListObject>();

		/*
		 * list.add(new ListObject(2, "two", 200)); list.add(new ListObject(1,
		 * "one", 100)); list.add(new ListObject(3, "three", 400)); list.add(new
		 * ListObject(3, "three", 300));
		 */

		System.out.println(list);

		Collections.sort(list, new ListObjectComOnIdAndName());
		System.out.println(list);
	}

}

class ListObject implements Comparable<ListObject>
{

	int id;
	String name;
	int sal;

	public ListObject() {
		// TODO Auto-generated constructor stub
	}

	ListObject(int i, String n, int s) {
		id = i;
		name = n;
		sal = s;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + sal;
	}

	@Override
	public int hashCode() {
		int hc = id + name.length();
		return hc;
	}

	@Override
	public boolean equals(Object obj) {

		ListObject o = (ListObject) obj;
		if (id == o.id && name.toString().equals(o.name.toString()) && sal == o.sal) {
			return true;
		}

		return false;
	}

	@Override
	public int compareTo(ListObject o) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * public int compareTo(ListObject o) { return this.id - o.id; }
	 */

}

/**
 * comparing on id
 * 
 * @author nitin-windows
 *
 */
class ListObjectComOnId implements Comparator<ListObject> {

	public int compare(ListObject o1, ListObject o2) {
		// TODO Auto-generated method stub
		return o1.id - o2.id;
	}
}

class ListObjectComOnName implements Comparator<ListObject> {

	public int compare(ListObject o1, ListObject o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}

class ListObjectComOnIdAndName implements Comparator<ListObject> {

	public int compare(ListObject o1, ListObject o2) {
		if (o1.id == o2.id) {
			return o1.sal - o2.sal;
		}
		return o1.id - o2.id;
	}
}
