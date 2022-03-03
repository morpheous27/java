	package dsAlgo;

public class LinkedList {

	public Node head;
	public Node tail;

	public void add(Node pnode) {
		if (head == null) {
			head = pnode;
			tail = pnode;
			return;
		}
		Node node = head;
		while (node.next != null) {
			node = node.next;
		}
		node.next = pnode;
		tail = node.next;
	}

	// remove from head
	public Node remove() {
		if (head == null) {
			System.out.println("list is emty");
			return null;
		} else {
			Node rnode = head;
			head = head.next;
			return rnode;
		}

	}

	// remove specific node
	public void remove(Node pnode) {
		if (head == null) {
			System.out.println("list is emty");
			return;
		} else if (head.data == pnode.data) {
			head = head.next;

		} else {
			Node tnode = head;
			while (tnode.next.data != pnode.data) {
				if (tnode.next.data == tail.data)
					break;
				tnode = tnode.next;
			}
			if (tnode.data == tail.data)
				System.out.println("element not present in the linked list");
			else if (tnode.next.data == pnode.data) {
				tnode.next = tnode.next.next;
			}
		}
	}

	public void display() {
		Node tnode = head;

		while (tnode != tail) {
			System.out.print(tnode.data + " --> ");
			tnode = tnode.next;
		}
		System.out.print(tnode.data);
	}

	class Node<T> {
		T data;
		Node next;

		Node() {
		}

		Node(T d) {
			data = d;
			next = null;
		}

		Node(T d, Node n) {
			data = d;
			next = n;

		}

	}

}
