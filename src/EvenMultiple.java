
public class EvenMultiple {

	int number = 27;

	private int checkEven() {
		int count = 0;
		while (number >= 3) {
			number = number / 3;
			count++;

		}
		return count;
	}

	public static void main(String[] args) {
		EvenMultiple obj = new EvenMultiple();
		int count = obj.checkEven();

		if (count % 2 == 0) {
			System.out.println("even mulitple");
		} else {
			System.out.println("odd mulitple");
		}

	}

}
