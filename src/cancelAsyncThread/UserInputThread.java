package cancelAsyncThread;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class UserInputThread implements Runnable {

	private CompletableFuture<String> ref;

	UserInputThread(CompletableFuture<String> ref) {
		this.ref = ref;
	}

	@Override
	public void run() {

		System.out.println("If you want to cancel the transaction enter 1");
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		int i = scanner.nextInt();
		if (1 == i) {

			cancelCurrentThread();
			scanner.close();
		} // TODO Auto-generated method stub

	}
	
	/**
	 * This method demonstrates the behavious where we cancel the current thread 
	 * by interrupting.
	 */
	private void cancelCurrentThread()
	{
		ref.cancel(true);
	}
	
	/**
	 * This method demonstrates the behavior where we simply set the response of the future object 
	 * which is yet to get the expected reponse. This however should not stop the running thread.
	 */
	private void setResultToThisThread()
	{
		ref.complete("completed forcefully. Data returned from cache");
	}

}
