package hackerrank1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOFElement {

	public static void main(String[] args) throws IOException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		String line = br.readLine();
		String tokens[] = line.split(" ");
		Long sum = 0l;
		for (int i = 0; i < tokens.length; i++) {
			System.out.print(sum);

			sum += new Long(tokens[i]);
		}

		System.out.print(sum);

	}
}