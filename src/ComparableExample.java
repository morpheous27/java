import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class ComparableExample {
	public static void main(String[] args) {

		TV t1 = new TV(152, "black");

		TV t2 = new TV(152, "black");
		TV t3 = new TV(131, "black1");
		TV t4 = new TV(111, "black23");

		System.out.println("==========" + t2.hashCode());
		// LinkedList<TV> l1 = new LinkedList<TV>();
		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		System.out.println(mp.hashCode());
		mp.put(152, "black");
		mp.put(152, "blacktesmp");
		mp.put(153, "black1");
		mp.put(154, "black23");
		mp.put(155, "black45");
		for (Entry<Integer, String> es : mp.entrySet())
			System.out.println(es.getKey() + " " + es.getValue());

		// l1.add(t1);
		// l1.add(t2);
		// l1.add(t3);
		// l1.add(t4);
		// Collections.sort(l1,new TVComparator());

		// for(TV obj : l1)
		// {
		// System.out.println("color"+ obj.color +"size "+obj.size);
		//
		// }

	}

}

class TVComparator implements Comparator<TV> {
	public int compare(TV obj1, TV obj2) {
		// if( < )
		// return -1;
		// else if(obj1.size > obj2.size)
		// return 1;
		// else
		// return 0;
		return obj1.color.compareTo(obj2.color);

	}
}

class TV {
	int size;
	String color;

	TV(int size, String color) {
		this.size = size;
		this.color = color;
	}

	public int compareTo(Object obj) {
		TV obj2 = (TV) obj;
		if (this.size < obj2.size)
			return -1;
		else if (this.size > obj2.size)
			return 1;
		else
			return 0;

	}

}
