package collections;

import java.util.ArrayList;
import java.util.List;

public class QueuesUsingArrays {

	public static void main(String[] args) {
		Queue queue = new Queue();
		String a[] = { "hi", "hello", "gud" };
		System.out.println("enqueue process");
		for (String i : a)
			queue.enqueue(i);
		System.out.println("after enqueue process" + queue.list);
		while (queue.tail != -1) {
			String value = (String) queue.dequeue();
			System.out.println(value);
		}
	}

}

class Queue<T> {
	List<T> list = new ArrayList<T>();
	int head = -1, tail = -1;

	public void enqueue(T data) {
		if (list.isEmpty()) {
			list.add(data);
			head = 0;
			tail = 0;
		} else {
			list.add(data);
			tail += 1;
		}

	}

	public T dequeue() {
		if (list.isEmpty()) {
			throw new RuntimeException("List is empty");
		} else if (head == tail && tail > -1) {
			try {
				return list.get(head);

			} finally {
				head = -1;
				tail = -1;
			}
		} else {
			try {
				return list.get(head);

			} finally {
				head += 1;

			}
		}

	}
}
