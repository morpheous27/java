package problem;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class WriteByteToFile {

	public static void main(String[] args) throws IOException {

		// FileInputStream fis = new FileInputStream(new File("D:\\Text.txt"));
		InputStreamReader isr = new InputStreamReader(System.in);

		FileOutputStream fos = new FileOutputStream(new File("D:\\Text.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		int n = 20;
		while (n > 0) {
			byte in = (byte) isr.read();
			osw.write(in);
			n--;
		}

		isr.close();
		osw.close();
	}

}
