
/**
 * Author : Nitin Saxena
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileModifier {

	public static void main(String[] args) {

		File file = new File("D:\\File1.txt");
		BufferedReader br = null;
		String fileContent = "";

		try {

			String sCurrentLine;
			br = new BufferedReader(new FileReader(file));
			FileWriter writer = new FileWriter("D:\\File2.txt");
			String content = null;
			boolean flag = false, checknow = false;
			int counter = 0;

			while ((sCurrentLine = br.readLine()) != null) {
				content = sCurrentLine;
				if (flag) {
					if (content.contains("/table"))
						counter--;
					else if (content.contains("<table"))
						counter++;

				} else {
					if (sCurrentLine.contains("id=\"mainbox\"")) {
						content = "";
						counter++;
						checknow = true;
						flag = true;
					}
				}
				if (checknow) {
					if (counter == 0) {
						content = "";
						flag = false;
						checknow = false;
					}
				}
				writer.write(content);
				writer.write("\n");

			}
			writer.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
