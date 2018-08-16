package collections;

import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List list = new LinkedList<String>();// or arrayList
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");

		System.out.println(list);

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
