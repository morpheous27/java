import java.io.IOException;
import java.util.Scanner;

public class DigitsAddToOne {
	int step = 1;

	public void AddDigits(int num) {
		int rem = 0;
		if (num < 10) {
			return;
		} else {
			while (num > 0) {
				rem = rem + (num % 10);
				num = num / 10;
			}
		}
		System.out.println("After step " + step + ":" + rem);
		step++;
		AddDigits(rem);
	}

	public static void main(String[] args) throws IOException {

		DigitsAddToOne obj = new DigitsAddToOne();
		// BufferedReader bf = new BufferedReader(new
		// InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		obj.AddDigits(num);

	}

}
