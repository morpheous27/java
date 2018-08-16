package problem;

import java.util.HashSet;
import java.util.Set;

public class FindMissingCharInString {

	public static void main(String[] args) {
		String string = "Bcdfh";
		String stringInLower = string.toLowerCase();
		int min = 999, max = 0;
		Set<Character> rangeCharacters = new HashSet<Character>();

		for (int i = 0; i < string.length(); i++) {
			if (min > stringInLower.charAt(i)) {
				min = stringInLower.charAt(i);
				if (max == 0) {
					max = min;
				}
			}
			if (max < stringInLower.charAt(i))
				max = stringInLower.charAt(i);
		}
		System.out.println(min + " " + max);
		String str = "";
		for (int i = min; i <= max; i++) {
			str = str + ((char) i);
		}
		for (int i = 0; i < string.length(); i++) {
			rangeCharacters.add(stringInLower.charAt(i));
		}
		System.out.println(rangeCharacters + " " + stringInLower);
		char missingLetter = ' ';
		for (int i = 0; i < str.length(); i++) {
			if (!rangeCharacters.contains(str.charAt(i))) {
				System.out.println("missing" + str.charAt(i));
				missingLetter = str.charAt(i);
			}
		}
		// for (int i = 0; i < string.length(); i++) {
		// if (rangeCharacters.!='c') {
		// System.out.println("missing");
		// missingLetter = string.charAt(i);
		// }
		// }
		System.out.println("missing letter is : " + missingLetter);

		/*
		 * int start = 97; char missingLetter = ' '; Set<Character>
		 * rangeCharacters = new HashSet<Character>(); for (int i = 0; i < 26;
		 * i++) { rangeCharacters.add((char) start++); } for (int i = 0; i <
		 * string.length(); i++) { if
		 * (!rangeCharacters.contains(stringInLower.charAt(i))) {
		 * System.out.println("missinh"); missingLetter =
		 * stringInLower.charAt(i); } }
		 * System.out.println(rangeCharacters.size());
		 * System.out.println(missingLetter);
		 */
	}
}
