package utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class TestFile {

	private String mainText;
	private File myFile;
	private int totalLine;
	private String FinalContent;
	private StringTokenizer strinTokenizer;

	public TestFile(String myString) {
		super();
		mainText = myString;
		totalLine = 0;

	}

	public String getMainText() {
		return mainText;
	}

	public void setMainText(String mainText) {
		this.mainText = mainText;
	}

	public File getMyFile() {
		return myFile;
	}

	public void setMyFile(File myFile) {
		this.myFile = myFile;
	}

	public void SetFinalContent(String s) {

		this.FinalContent = s;

	}

	public String getFinalContent() {

		return FinalContent;

	}

	public String readfile(File myfile) {

		BufferedReader br = null;
		String fileContent = "";
		String manipulatedContent = "";

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader(myfile));
			FileWriter writer = new FileWriter("D:\\File2.txt");
			String content = null;
			boolean flag = false, checknow = false;
			int counter = 0;

			while ((sCurrentLine = br.readLine()) != null) {
				// System.out.println(sCurrentLine);
				// fileContent += sCurrentLine + "\n";
				content = sCurrentLine;
				if (flag) {
					if (content.contains("/table"))
						counter--;
					else if (content.contains("table"))
						counter++;

				} else {
					if (sCurrentLine.contains("mainbox")) {
						content = "";
						counter++;
						checknow = true;
						flag = true;
					}
				}

				System.out.println("line : " + sCurrentLine);
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

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
					manipulatedContent = manipulateContent(fileContent);
					return (manipulatedContent);

				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return manipulatedContent;

	}

	private String manipulateContent(String fileContent) {
		// TODO Auto-generated method stub
		String str1, str2;
		String manipulatedContent = " ";
		StringTokenizer str = new StringTokenizer(fileContent, "\n");
		System.out.println(" In the manipulate method");
		int F1 = 0, F2 = 0, F3 = 0, F4 = 0, F5 = 0, F6 = 0, F7 = 0, F8 = 0, F9 = 0, F10 = 0, F11 = 0;
		System.out.println("total  lines" + str.countTokens());
		while (str.hasMoreTokens()) {

			str1 = str.nextToken();

			if (F1 == 0) {

				/*
				 * if(str1.contains("mainbox")){
				 * 
				 * str1="";
				 * 
				 * str1=str.nextToken();
				 * 
				 * while(str.hasMoreTokens()) { str2=str.nextToken();
				 * 
				 * if(){
				 * 
				 * 
				 * 
				 * }
				 * 
				 * 
				 * 
				 * 
				 * 
				 * }
				 * 
				 * 
				 * str1=str.nextToken(); F1=1;
				 * 
				 * }
				 */

			} else if (F2 == 0) {

				if (str1.contains("maintable")) {
					// str1="";

					System.out.println("maintable");
					str1 = "						<table class='transactionBox'>";
					System.out.println(str1);
					F2 = 1;

				}
			} else if (F3 == 0) {
				if (str1.contains("maintablerow2")) {
					str1 = "													<tr class='transactionData'>";
					System.out.println(str1);
					F3 = 1;
				}
			} else if (F4 == 0) {
				if (str1.contains("maintablerow2col1")) {
					str1 = "														<td>";
					System.out.println(str1);
					F4 = 1;
				}

			} else if (F5 == 0) {
				if (str1.contains("maintablecontentarea")) {
					str1 = "												<div>";
					System.out.println(str1);
					F5 = 1;
				}
			} else if (F6 == 0) {
				if (str1.contains("disclaimerheader")) {
					str1 = "<table class='footerNote'>";
					System.out.println(str1);
					F6 = 1;
				}
			} else if (F7 == 0) {

				if (str1.contains("disclaimerheaderrow1")) {
					str1 = "<tr>";
					System.out.println(str1);
					F7 = 1;
				}

			} else if (F8 == 0) {
				if (str1.contains("disclaimerheaderrow1col1")) {
					str1 = "<td>";
					System.out.println(str1);
					F8 = 1;
				}
			} else if (F9 == 0) {
				if (str1.contains("disclaimerfooter")) {
					str1 = "												<table class='footerNote'>";
					System.out.println(str1);
					F9 = 1;
				}
			} else if (F10 == 0) {
				if (str1.contains("disclaimerfooterrow1")) {
					str1 = "<tr>";
					System.out.println(str1);
					F10 = 1;
				}
			} else if (F11 == 0) {
				if (str1.contains("disclaimerfooterrow1col1")) {
					str1 = "												        <td>";
					System.out.println(str1);
					F11 = 1;
				}
			}

			if (str1.contains("middlePanel")) {

				String myString = (String) str1;
				String myString2 = myString.replace("middlePanel", "transactionData");
				str1 = myString2;
				System.out.println(str1 + "---------");

			}
			if (str1.contains("middlepanel")) {

				String myString = (String) str1;
				String myString2 = myString.replace("middlepanel", "transactionData");
				str1 = myString2;
				System.out.println(str1 + "---------");

			}
			if (str1.contains("box")) {

				String myString = (String) str1;
				String myString2 = myString.replace("box", "section");
				str1 = myString2;
				System.out.println(str1 + "---------");

			}

			if (str1.contains("infotable")) {

				String myString = (String) str1;
				String myString2 = myString.replace("infotable", "infoNote");
				str1 = myString2;
				System.out.println(str1 + "---------");

			}

			if (str1.contains("errortable")) {

				String myString = (String) str1;
				String myString2 = myString.replace("errortable", "infoNote");
				str1 = myString2;
				System.out.println(str1 + "---------");

			}

			if (str1.contains("topPanel")) {

				String myString = (String) str1;
				String myString2 = myString.replace("topPanel", " ");
				str1 = myString2;
				System.out.println(str1 + "---------");

			}
			if (str1.contains("toppanel")) {

				String myString = (String) str1;
				String myString2 = myString.replace("toppanel", " ");
				str1 = myString2;
				System.out.println(str1 + "---------");

			}

			if (str1.contains("bottomPanel")) {

				String myString = (String) str1;
				String myString2 = myString.replace("bottomPanel", " ");
				str1 = myString2;
				System.out.println(str1 + "---------");

			}
			if (str1.contains("bottompanel")) {

				String myString = (String) str1;
				String myString2 = myString.replace("bottompanel", " ");
				str1 = myString2;
				System.out.println(str1 + "---------");

			}

			/*
			 * if(str1.contains("maintable")){
			 * 
			 * String myString=(String)str1; String
			 * myString2=myString.replace("maintable", "transactionBox");
			 * str1=myString2; System.out.println(str1+"---------");
			 * 
			 * }
			 */

			manipulatedContent += str1 + "\n";

		}

		// System.out.println(copyOfContent);
		return manipulatedContent;

	}

	public void writeFile(String content) {

		/*
		 * Charset charset = Charset.forName("US-ASCII"); String s =
		 * "This is nitins TRON"; try (BufferedWriter writer = new
		 * BufferedWriter(file)){ writer.write(s, 0, s.length()); } catch
		 * (IOException x) { System.err.format("IOException: %s%n", x); }
		 */

		FileWriter writer;
		try {
			writer = new FileWriter("D:\\File2.txt");
			writer.write(content);
			writer.close();
			System.out.println("content written successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public String toString() {
		return "Files [mainText=" + mainText + ", myFile=" + myFile + "]";
	}

	public String removeTags(String content) {

		// FinalContent=content;
		// strinTokenizer=new StringTokenizer(content,"\n");

		String str1, str2, token;
		String manipulatedContent = " ";
		int lineNo = 0;
		StringTokenizer str = new StringTokenizer(content, "\n");

		System.out.println(" In the removetag Method");
		System.out.println("total  lines" + str.countTokens());
		int deleteLine = 9999;

		while (str.hasMoreTokens()) {

			token = str.nextToken();
			lineNo++;

			if (token.contains("mainsection")) {
				System.out.println("calling findTag method");
				deleteLine = findEndTag(lineNo, content, "<table", "</table>");
				System.out.println("End TAg is at  ..DELETE" + deleteLine);

			} else if (token.contains("mainboxrow1")) {
				System.out.println("calling findTag method");
				deleteLine = findEndTag(lineNo, content, "<tr", "</tr>");
				System.out.println("End TAg is at  ..DELETE" + deleteLine);

			}
			if (lineNo == deleteLine) {
				token = "";
			}

			manipulatedContent += token + "\n";

		}

		return manipulatedContent;

	}

	private int findEndTag(int lineNo, String content, String Sart_tag, String end_tag) {

		int COUNTER = 0, localCounter = 0, copyOriginalLineNo = lineNo;
		String token;
		StringTokenizer str2 = new StringTokenizer(content, "\n");
		String appendedContent = "";

		while (str2.hasMoreTokens()) {

			token = str2.nextToken();
			localCounter++;

			if (localCounter < lineNo) {

				continue;
			} else if (token.contains(Sart_tag)) {

				// originalLineNo++;
				copyOriginalLineNo++;
				COUNTER++;
				System.out.println(copyOriginalLineNo + "Sart_tag" + token + "(" + Sart_tag + ")");

			} else if (token.contains(end_tag)) {

				COUNTER--;
				copyOriginalLineNo++;
				System.out.println(copyOriginalLineNo + "end_tag" + token + "(" + end_tag + ")");
				if (COUNTER == 0) {

					// copyOriginalLineNo;
					break;

				}

			}

			copyOriginalLineNo++;
			// appendedContent+=token+"\n";
			appendedContent += "DELETE" + token + "/n";

		}
		// FinalContent=appendedContent;

		return copyOriginalLineNo;

	}

}
