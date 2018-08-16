package dsAlgo;

import java.io.IOException;
import java.io.InputStreamReader;

public class DoublyLinkedListUse {

	public static void main(String[] args) throws IOException {
		DoublyLinkedList dl = new DoublyLinkedList();
		int arr[] = { 3, 4, 56, 723, 56, 22 };
		for (int i : arr) {
			DoublyLinkedList.Node node = dl.new Node(i);
			dl.add(node, 's');
		}
		// /ll.display();
		dl.display();
		System.out.println("where do u wat to enter the node(s/n)?");
		InputStreamReader isr = new InputStreamReader(System.in);
		char ch = (char) isr.read();
		DoublyLinkedList.Node node = dl.new Node(55);
		dl.add(node, ch);
		dl.display();
		System.out.println("where do u want to remove the node(s/n)?");
		InputStreamReader isr2 = new InputStreamReader(System.in);
		ch = (char) isr2.read();

		dl.remove(ch);
		dl.display();

	}
}
