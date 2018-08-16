package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashTableDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put(null, "one");
		map.put(null, "two");

		Map<String, String> hashTable = new Hashtable<String, String>();
		Map<String, String> cm = new ConcurrentHashMap<String, String>();
		// hashTable.put("1",null);

		for (String s : map.keySet())
			System.out.println(map.get(s));

		System.out.println(map.get(null));

		for (String s : hashTable.keySet())
			System.out.println(hashTable.get(s));
		System.out.println(hashTable.get("2"));
	}

}
