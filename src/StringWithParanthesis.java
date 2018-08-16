
public class StringWithParanthesis {

	String str = "(s+@(d(3)+D(d)))";
	int count = 0;

	private void count() {
		int i = 0;
		while (i < str.length()) {
			if (str.charAt(i) == '(') {
				count += 1;
			} else if (str.charAt(i) == ')') {
				count -= 1;
			}
			i++;
		}

	}

	public static void main(String[] args) {
		StringWithParanthesis obj = new StringWithParanthesis();
		obj.count();
		if (obj.count != 0) {
			System.out.println("parantheses unbalanced");
		} else {
			System.out.println("parantheses balanced");
		}

	}

}
