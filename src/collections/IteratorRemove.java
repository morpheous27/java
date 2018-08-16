package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRemove {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");

		Iterator itr = list.iterator();

		for (String s : list)
			System.out.println(s);
		while (itr.hasNext()) {
			String i = (String) itr.next();
			list.add("five");// you can remove element using iterator but not
								// explicitly

		}

		for (String s : list)
			System.out.println(s);

	}

}
