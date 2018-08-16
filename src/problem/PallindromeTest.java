package problem;

public class PallindromeTest {
	public String palindrome(String s) {

		char[] input = s.toCharArray();

		int start = 0;
		int end = input.length - 1;

		if (isPalindrome(input, start, end))
			return "";
		else {
			start++;
			while (start < end) {
				if (isPalindrome(input, start, end)) {
					break;
				}
				start++;

			}
			char[] toReturn = new char[start];
			for (int i = 0; i < toReturn.length; i++) {
				toReturn[i] = input[--start];
				// start--;
			}
			return new String(toReturn);

		}

	}

	public boolean isPalindrome(char[] input, int start, int end) {
		boolean isPalindrome = true;
		while (start < end) {
			if (input[start] != input[end]) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		return isPalindrome;

	}

	public static void main(String[] args) {

		PallindromeTest test = new PallindromeTest();
		System.out.println(test.palindrome("NITI"));
		System.out.println(test.palindrome("aaab"));
		System.out.println(test.palindrome("abb"));
		System.out.println(test.palindrome("abc"));
		System.out.println(test.palindrome("abcde"));
		System.out.println(test.palindrome("abcaba"));
		System.out.println(test.palindrome("system"));

	}
}