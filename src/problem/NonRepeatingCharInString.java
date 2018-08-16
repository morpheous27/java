package problem;

public class NonRepeatingCharInString {

	public static void main(String[] args) {
		String main = "aazzzeeeefffmtttdd";

		char carr[] = main.toCharArray();
		char nonRepeatingChar = ' ', temp = ' ';
		for (int i = 0; i < carr.length; i++) {
			if (temp == carr[i]) {
				continue;
			}
			if (carr[i] == carr[i + 1]) {
				temp = carr[i];
				i += 2;
				continue;
			}
			System.out.println("character is : " + carr[i]);
			break;

		}

	}

}
