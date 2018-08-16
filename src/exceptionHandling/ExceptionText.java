package exceptionHandling;

public class ExceptionText {

	public ErrorManager testMethod(ErrorManager e) throws ArithmeticException {
		int i = 1;
		System.out.println("1");
		e.id = 2;
		// i = 1 / 0;
		try {
			int sum = 1 / 0;
			System.out.println("df");
		} finally {
			System.out.println("3");
		}
		System.out.println("4");
		return e;
	}

	public static void main(String[] args) {
		ExceptionText exceptionText = new ExceptionText();
		ErrorManager em = new ErrorManager();
		try {
			em.id = 3;
			em = exceptionText.testMethod(em);
			System.out.println(em.id);
		} catch (ArithmeticException e) {
			System.out.println("handled in caller as well");
		}
		System.out.println("woo, it came out without any exception in main method");
	}
}

class ErrorManager {

	int id;

}
