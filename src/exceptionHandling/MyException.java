package exceptionHandling;

/**
 * Created by Nitin on 1/3/2017.
 */
class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
	}
}

public class MyException {
	static void validate(int age) throws InvalidAgeException {

		if (age < 10) {
			throw new InvalidAgeException("not a valid age");
		} else

		{
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String args[]) {
		try {
			validate(13);
		} catch (Exception e) {
			System.out.println("Exceptio occured" + e);
		}
	}

}
