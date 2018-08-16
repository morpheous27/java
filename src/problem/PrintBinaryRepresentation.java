package problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintBinaryRepresentation {

	public static void main(String[] args) {
		try {
			// byte b = (byte) System.in.read();
			// InputStreamReader isr = new InputStreamReader(System.in);
			// int stream = isr.read();
			InputStreamReader isr2 = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr2);
			int buffer = br.read();
			// System.out.println("stream" + stream);
			System.out.println("buffer" + (char) buffer);

			// an int.
			// System.out.println(b);
		} catch (Exception e) {

		}
	}
}
