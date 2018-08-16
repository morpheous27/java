package concurrency;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new ConcurrentHashMap<String, String>();
		map.put("one", "one");
		map.put("two", "two");
		map.put("three", "three");
		map.put("four", "four");
		map.put("four", "four");

		for (String s : map.keySet())
			System.out.println(map.get(s));
	}

}
