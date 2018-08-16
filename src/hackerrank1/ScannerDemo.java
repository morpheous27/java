package hackerrank1;

import java.io.*;
import java.util.*;

public class ScannerDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int n1 = new Integer(n);
		String input = br.readLine();
		int array[] = new int[n1];
		System.out.println("input no" + n);
		String tokens[] = input.split(" ");
		for (int i = 0; i < n1; i++)
			array[i] = new Integer(tokens[i]);
		// reversing the array
		for (int i = n1 - 1; i >= 0; i--)
			System.out.print(array[i] + " ");
	}
}