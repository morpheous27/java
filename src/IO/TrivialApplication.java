package IO;

import java.io.IOException;

public class TrivialApplication {
	public TrivialApplication() throws IOException {
		int ch, i = 0;
		while (true) {

			ch = System.in.read(); // reads one byte as an integer from the
									// system window
			// System.out.print(Integer.toBinaryString(ch));
			System.out.println(ch);
		}
		// System.out.println(Integer.toString(ch, 2)); // converts the int to a
		// charater value
		// not converting the value would give the character value as an integer
	}; // constructor

	public static void main(String args[]) throws IOException {
		new TrivialApplication();
	};
}
