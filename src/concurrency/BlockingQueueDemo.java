package concurrency;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<String> bQueue = new ArrayBlockingQueue<String>(6);
		bQueue.put("one");
		bQueue.put("two");
		bQueue.put("three");
		bQueue.put("four");
		bQueue.put("five");
		bQueue.put("FIVE");

		Stack<String> stack = new Stack<String>();
		stack.push("1");
		String element = stack.pop();
		System.out.println(element);

		System.out.println(bQueue);
		System.out.println(bQueue);

	}

}
