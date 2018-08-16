package problem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class MovieListSoter {

	Set<String> movieList = new TreeSet<String>();

	void insertIntoSet() {
		try {
			FileReader fr = new FileReader(new File("D:\\notepad stuff\\watched.txt"));

			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			do {

				movieList.add(line);
				line = br.readLine();
			} while (line != null);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	void printSet() {
		System.out.println("size : " + movieList.size());
		for (String i : movieList) {
			System.out.println(i);
		}
	}

	public void writeToFile() {
		try {
			FileWriter fw = new FileWriter(new File("D:\\notepad stuff\\wachted.txt"));
			for (String s : movieList) {
				fw.write(s);
				fw.write("\n");
				fw.flush();
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		MovieListSoter obj = new MovieListSoter();
		obj.insertIntoSet();
		obj.printSet();
		obj.writeToFile();
	}
}
