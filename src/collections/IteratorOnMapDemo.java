package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

public class IteratorOnMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("two", 2);
		Iterator itr = map.keySet().iterator();

		/*
		 * while(itr.hasNext()) { map.remove("two"); System.out.println(
		 * "size = "+map.size()); }
		 */

		ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();

		queue.add("one");
		itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println("incoming" + queue.poll()); // this will go into
															// infinite loop as
															// polling an object
															// will not affect
															// the existing
															// collection
		}

	}
}
