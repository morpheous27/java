import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class IteratorDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		/*
		 * map.put("1", 1); map.put("2", 2); Iterator itr =
		 * map.keySet().iterator(); while(itr.hasNext()) { map.put("3",3);
		 * System.out.println(itr.next()); }
		 */
		/*
		 * List<String> list = new ArrayList<String>(); list.add("one");
		 */

		List<String> list = new LinkedList<String>();
		Iterator itr = list.iterator(); // instance locked
		// list.remove("one");
		System.out.println(list.size());

		Collections.sort(list);
		while (itr.hasNext()) {

			System.out.println(itr.next());
			// itr.remove();
			list.remove("one");
			list.add("two");
			// System.out.println(itr.next());

		}
		System.out.println(list.size());

	}

}
