package problem;

import java.io.IOException;

/**
 * 
 * @author nsax11
 *
 */
public class MathPowTest {

	public static void main(String[] args) throws IOException, ZeroNumberException, NegativeNumberException {

		System.out.println("Enter base value-");
		int base = System.in.read();
		System.out.println("Enter power value-");
		int pow = System.in.read();

		if (base == 0 || pow == 0) {
			throw new ZeroNumberException("Number is zero");
		}

		if (base < 0 || pow < 0) {
			throw new NegativeNumberException("Number is zero");
		}

		double output = Math.pow(base, pow);
		System.out.println(output);

	}

}

class ZeroNumberException extends Exception {

	public ZeroNumberException() {
		// TODO Auto-generated constructor stub
	}

	ZeroNumberException(String msg) {
		super(msg);
	}

}

class NegativeNumberException extends Exception {

	public NegativeNumberException() {
		// TODO Auto-generated constructor stub
	}

	NegativeNumberException(String msg) {
		super(msg);
	}

}
