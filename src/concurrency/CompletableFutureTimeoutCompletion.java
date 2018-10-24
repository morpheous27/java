package concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * This class test {@link CompletableFuture} with forceful completion after timeout.
 * Use case - When we rely on external source for latest data but that api takes longer than expected, we can send the previous 
 * response or a hardcoded response instead of blocking the call.
 * 
 * @author nitin
 *
 */
public class CompletableFutureTimeoutCompletion {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<String> completeableFuture = CompletableFuture.supplyAsync(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i++ + "Work in progress");
				try {
					TimeUnit.MILLISECONDS.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return "TaskDone";

		});

		System.out.println("Now requesting for the data from external source....");
		String response = "no data";
		try {
			response = completeableFuture.get(5, TimeUnit.SECONDS);
		} catch (TimeoutException ex) {
			System.out.println("timed out!!");
			CompletableFuture<String> cachedResponse = CompletableFuture.completedFuture("Values picked up from cache");
			response = cachedResponse.get();
		}

		/*
		 * System.out.println("If you want to cancel the transaction enter 1"); Scanner
		 * scanner = new Scanner(new InputStreamReader(System.in)); int i =
		 * scanner.nextInt(); if(1 == i) {
		 * completeableFuture.complete("completed forcefully"); } scanner.close();
		 */
		finally {

			System.out.println(response);
		}

	}

}
