package concurrency;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Problem Statement: We have a very fast producer that produces tokens and we
 * want to consume those tokens in such a way that if tokens are same then they
 * need to be processed sequentially else Parallely.
 * 
 * @author Nitin
 *
 */
public class ProducerConsumer {

	BlockingQueue<Token> tokenList = new ArrayBlockingQueue<Token>(10);
	Set<Token> set = new HashSet<Token>();

	private void startProcess() {
		ExecutorService producer = Executors.newSingleThreadExecutor();
		final ExecutorService consumerForSeven = Executors.newSingleThreadExecutor();
		final ExecutorService consumerForAll = Executors.newFixedThreadPool(10);
		ExecutorService manager = Executors.newSingleThreadExecutor();

		producer.submit(new Producer(tokenList));

		manager.submit(new Runnable() {

			public void run() {
				try {
					while (true) {
						Token t = tokenList.take();
						System.out.println("consumed- " + t.orderid + " element");

						if (t.orderid % 7 == 0) {

							consumerForSeven.submit(new ConsumerForSeven(t));

						} else {

							consumerForAll.submit(new ConsumerForAll(t));

						}
					}
				}

				catch (InterruptedException e) { // TODO Auto-generated catch
					// block
					e.printStackTrace();
				}

			}
		});
	}

	public static void main(String[] args) {
		ProducerConsumer producerConsumer = new ProducerConsumer();
		producerConsumer.startProcess();
		System.out.println("done 2");
	}

}

class ConsumerForSeven extends Thread {

	Token token;

	public ConsumerForSeven() {
		// TODO Auto-generated constructor stub
	}

	ConsumerForSeven(Token token) {
		this.token = token;
	}

	@Override
	public void run() {
		token.processedBy = Thread.currentThread().getName();
		System.out.println("processed -" + token.orderid);

	}
}

class ConsumerForAll extends Thread {

	Token token;

	public ConsumerForAll() {
		// TODO Auto-generated constructor stub
	}

	ConsumerForAll(Token token) {
		this.token = token;
	}

	@Override
	public void run() {
		token.processedBy = Thread.currentThread().getName();
		System.out.println("processed -" + token.orderid);

	}
}

class Producer extends Thread {

	BlockingQueue<Token> tokenList;

	public Producer() {
		// TODO Auto-generated constructor stub
	}

	Producer(BlockingQueue<Token> tokenList) {
		this.tokenList = tokenList;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 7 == 0) {
				tokenList.offer(new Token(7, "sample1"));
				// notifyAll();
			} else {
				tokenList.offer(new Token(i, "sample2"));
			}
			System.out.println("produced- " + i + "th element");

		}
		System.out.print("done");
	}
}

class Token {
	int orderid;
	String ordervalue;
	String processedBy;

	Token() {

	}

	Token(int a, String b) {
		orderid = a;
		ordervalue = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderid;
		result = prime * result + ((ordervalue == null) ? 0 : ordervalue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Token other = (Token) obj;
		if (orderid != other.orderid)
			return false;
		if (ordervalue == null) {
			if (other.ordervalue != null)
				return false;
		} else if (!ordervalue.equals(other.ordervalue))
			return false;
		return true;
	}

}
