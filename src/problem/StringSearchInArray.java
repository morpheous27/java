package problem;

public class StringSearchInArray {
	public static int word_count(int input1, String[] input2, String input3) {

		char cArr[][] = new char[input1][input1];
		for (int i = 0; i < input1; i++) {
			cArr[i] = input2[i].toCharArray();
		}

		int k = 0, l = 0, count = 0;
		for (int i = 0; i < input1; i++) {
			l = 0;
			String t = "";
			for (int j = 0; j < input1; j++) {

				if (cArr[i][j] != '#')
					t = t + cArr[i][j];

			}
			if (t.contains(input3))
				count++;

		}
		for (int i = 0; i < input1; i++) {
			l = 0;
			String t = "";
			for (int j = 0; j < input1; j++) {

				if (cArr[j][i] != '#')
					t = t + cArr[i][j];

			}
			if (t.contains(input3))
				count++;

		}
		for (int i = input1 - 1; i >= 0; i--) {

			String t = "";
			for (int j = input1; j >= 0; j--) {

				if (cArr[j][i] != '#')
					t = t + cArr[i][j];

			}
			if (t.contains(input3))
				count++;

		}

		return count;

	}

	public static void main(String[] args) {
		String str[] = { "E#D#E#E#E", "D#I#S#K#T", "E#S#E#E#E", "E#C#E#E#E", "E#E#E#E#E" };
		int count = StringSearchInArray.word_count(5, str, "DISK");
		System.out.println(count);

	}
}