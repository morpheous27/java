package concurrency;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureWithCompletion {
	
	public static void main(String[] args) {
		
		CompletableFuture<Void> completeableFuture = CompletableFuture.runAsync(() -> {
			
			int i = 0;
			while(true)
			{
				System.out.println(i++ + "Work in progress");
			  try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			
		});
		
		System.out.println("If you want to cancel the transaction enter 1");
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		int i = scanner.nextInt();
		if(1 == i)
		{
			//completeableFuture.completedFuture("Transaction has been completed successfully");
		}
		scanner.close();
		
		
		
	}

}


