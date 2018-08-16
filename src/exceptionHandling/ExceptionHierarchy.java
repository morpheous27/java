package exceptionHandling;

public class ExceptionHierarchy {

	public static void main(String[] args) throws Exception {

		exceptionHierarchy();

	}

	public static String exceptionHierarchy() throws Exception {
		System.out.println("1");
		try {

			throw new ClassNotFoundException();
		} catch (ClassNotFoundException e) {
			System.out.println("cnotfound");
			Object nullObj = null;
			nullObj.equals("");
		}

		finally {
			System.out.println("4");
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("exception handled");
			}

		}

		System.out.println("5");
		return null;

		// return null;
	}
}
