package singleton;

/**
 * 
 * @author nitin-windows 1) object in heap 2) properties initializae with
 *         default
 */
public class SingletonDCL {

	private static volatile SingletonDCL instance;
	int i;
	String l;

	private SingletonDCL() {
	}

	SingletonDCL(int i) {
		this.i = i;
	}

	public static SingletonDCL getInstance() {
		if (instance == null) {
			synchronized (SingletonDCL.class) {
				if (instance == null) {
					instance = new SingletonDCL(3); // 1) creating object, 2)
													// calling contructor
				}
			}
		}
		return instance;
	}
}
