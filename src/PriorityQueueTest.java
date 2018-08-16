import java.util.HashMap;
import java.util.Map;

/**
 * Java Program to show How to use PriorityQueue in Java. This example also
 * demonstrate that PriorityQueue doesn't allow null elements and how
 * PriorityQueue keeps elements i.e. ordering.
 *
 * @author
 */
public class PriorityQueueTest {

	public static void main(String args[]) {

		// Queue<Item> items = new PriorityQueue<Item>();
		// items.add(new Item("IPone", 900));
		// items.add(new Item("IPad", 1200));
		// items.add(new Item("Xbox", 300));
		// items.add(new Item("Watch", 200));
		//
		// System.out.println("Order of items in PriorityQueue");
		// System.out.println(items);
		//
		// System.out.println("Element consumed from head of the PriorityQueue :
		// "
		// + items.poll());
		// System.out.println(items);
		//
		// System.out.println("Element consumed from head of the PriorityQueue :
		// "
		// + items.poll());
		// System.out.println(items);
		//
		// System.out.println("Element consumed from head of the PriorityQueue :
		// "
		// + items.poll());
		// System.out.println(items);

		// items.add(null); // null elements not allowed in PriorityQueue -
		// NullPointerException
		// Queue<Integer> items = new LinkedList<Integer>();
		// items.add(new Integer(100));
		// items.add(new Integer(122));
		// items.add(new Integer(99));
		// items.add(new Integer(100));
		// items.add(new Integer(122));
		// items.add(new Integer(2));
		// items.add(null);

		Map set = new HashMap();
		set.put(new Integer(1), null);
		set.put("1", null);
		// set.put(null, null);
		System.out.println(set);
		// System.out.println(items);

	}

	private static class Item implements Comparable<Item> {

		private String name;
		private int price;

		public Item(String name, int price) {
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public int getPrice() {
			return price;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			final Item other = (Item) obj;
			if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
				return false;
			}
			if (this.price != other.price) {
				return false;
			}
			return true;
		}

		public int compareTo(Item i) {
			if (this.price == i.price) {
				return this.name.compareTo(i.name);
			}

			return this.price - i.price;
		}

		public String toString() {
			return String.format("%s: $%d", name, price);
		}

	}
}
