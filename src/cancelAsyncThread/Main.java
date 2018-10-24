package cancelAsyncThread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String ags[]) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		CompletableFuture<String> future = CompletableFuture.supplyAsync(new SupplierThread(), executor);
		
		CompletableFuture<Void> finalFuture = CompletableFuture.runAsync(new UserInputThread(future), executor);
		
		String response = future.get();
		System.out.println(response);
		
		executor.shutdown();
		//future.join();
		
		
	}
}
