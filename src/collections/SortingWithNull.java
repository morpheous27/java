package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingWithNull {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(null);
		list.add(9);
		list.add(3);
		list.add(5);
		Collections.sort(list);
		System.out.println(list);

	}

}
