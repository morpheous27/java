package collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<CustomKey, String> map = new ConcurrentHashMap<CustomKey, String>();
		CustomKey key = new CustomKey(1);
		CustomKey key1 = new CustomKey(2);
		CustomKey key2 = new CustomKey(3);
		CustomKey key3 = new CustomKey(4);
		CustomKey key4 = new CustomKey(5);
		CustomKey key5 = new CustomKey(6);
		CustomKey key6 = new CustomKey(7);
		CustomKey key7 = new CustomKey(8);
		CustomKey key8 = new CustomKey(9);
		map = new Hashtable<CustomKey, String>();
		map.put(key, "onevalue");
		map.put(key1, "twovalue");
		map.put(key2, "onevalue3");
		map.put(key3, "onevalue4");
		map.put(key, "onevalue5");
		map.put(key4, "onevalue6");
		map.put(key5, "onevalue7");
		map.put(key6, "onevalue8");
		map.put(key7, "onevalue9");
		map.put(key8, "onevalue10");
		map.put(key8, "onevalue10");
		map.put(key8, "onevalue10");
		map.put(key8, "onevalue10");
		map.put(key8, "onevalue10");
		map.put(key8, "onevalue10");
		System.out.println(map.size());

	}

	static class CustomKey {
		int id;

		CustomKey(int i) {
			this.id = i;
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return 1;
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			CustomKey o = (CustomKey) obj;
			return this.id == o.id;
		}
	}

}
