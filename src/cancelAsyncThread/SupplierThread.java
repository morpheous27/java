package cancelAsyncThread;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class SupplierThread implements Supplier<String> {

	@Override
	public String get() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i++ + "Work in progress");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return "TaskDone !!!";
	}

}
