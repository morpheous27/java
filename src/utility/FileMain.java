package utility;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		String manipulatedContent = "";
		String finalContent = "";

		File file = new File("D:\\File1.txt");

		String myString = "This this the string";

		TestFile obj = new TestFile(myString);
		obj.setMainText(myString);
		manipulatedContent = obj.readfile(file);
		// System.out.println("manipulated String"+manipulatedContent);
		// obj.SetFinalContent(manipulatedContent);

		// finalContent = obj.removeTags(manipulatedContent);
		// obj.writeFile(manipulatedContent);

		// char delim = (char) 34;
		// System.out.println(delim);

		// Document doc = Jsoup.parse(manipulatedContent);
		// doc.getElementById("dummyId").remove();

		// Element masthead = doc.select("table#mainsection");
		/*
		 * for(Element ele :doc.select("table #mainsection") ){
		 * System.out.println("printing element.."); System.out.println(ele);
		 * 
		 * }
		 */// String jsopsting = doc.toString();

		// Elements elements = doc.select("div");
		// System.out.println("jsoup=====*************************************************************====================================="+jsopsting);

		// obj.writeFile(jsopsting);

	}

}
