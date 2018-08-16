package dsAlgo;

public class LinkedListUse {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		LinkedList.Node node1 = ll.new Node(1);

		ll.add(node1);
		// ll.display();
		LinkedList.Node node2 = ll.new Node(2);
		ll.add(node2);
		LinkedList.Node node3 = ll.new Node(3);
		ll.add(node3);
		ll.display();
		LinkedList.Node node4 = ll.new Node(2);

		ll.remove(node4);
		ll.display();

	}
}
