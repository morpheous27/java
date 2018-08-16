package problem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReadFileByteVise {

	public static void main(String[] args) {
		try {
			ReadFileByteVise obj = new ReadFileByteVise();

			FileInputStream fis = new FileInputStream(new File("D:\\Text.txt"));
			InputStreamReader isr = new InputStreamReader(fis);

			FileOutputStream fos = new FileOutputStream(new File("D:\\Text2.txt"));
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			int a = 0, i = 1, count = 0, tempcount = 0;
			while ((a = isr.read()) != -1) {
				if (i % 5 == 0) {
					System.out.println((char) a);

					count++;
					tempcount = 1;
					while (tempcount > 0) {
						isr.skip(1);
						i++;
						tempcount--;
					}
				}
				osw.write(a);
				i++;

			}
			File of = new File("D:\\Test");
			of.delete();
			File nf = new File("D:\\Test2.txt");
			nf.renameTo(of);
			isr.close();
			osw.close();
		} catch (Exception e) {

		}

	}

	void Shiftchar(int sc) {

	}
}
