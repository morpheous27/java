package sortMovieList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class SortWatchedMoviesList {

	private String path = "D:\\notepad stuff\\";
	private String fileName = "Watched.txt";
	private Set<String> set = new TreeSet<String>();

	private void readFile() {
		File file = new File(path + fileName);
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String fs = br.readLine();
			while (fs != null) {
				set.add(fs);
				fs = br.readLine();
			}
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void writeFile() {
		FileWriter fw = null;
		try {
			fw = new FileWriter(new File(path + fileName));
			for (String movie : set) {
				fw.write(movie + "\n");

			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		SortWatchedMoviesList sortWatchedMoviesList = new SortWatchedMoviesList();
		sortWatchedMoviesList.readFile();
		sortWatchedMoviesList.writeFile();
		System.out.println("Hello " + args[0]);
	}

}
