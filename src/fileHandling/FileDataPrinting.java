package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class FileDataPrinting {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\notepad stuff\\Test.txt");
		// FileReader fr = new FileReader(file);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = br.readLine();
		TreeMap hm = new TreeMap();
		while (line != null) {
			StringTokenizer st = new StringTokenizer(line);
			line = br.readLine();
			st.nextToken();
			String value = st.nextToken();
			String key = st.nextToken();
			hm.put(key, value);
			System.out.println("test");
		}

		System.out.println(hm);
	}
}