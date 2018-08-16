package java8;

import java.io.File;
import java.io.FileFilter;

public class LambdaDemo {

	public static void main(String[] args) {
		FileFilter filefilter = new FileFilter() {

			public boolean accept(File pathname) {

				return pathname.getName().endsWith("txt");
			}

		};

		FileFilter fileFilterLambda = pathName -> pathName.getName().endsWith("txt");

		File dir = new File("e:\\");
		File[] files = dir.listFiles(fileFilterLambda);
		System.out.println(files);

	}
}
