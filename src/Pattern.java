import java.util.Scanner;

public class Pattern {

	void pattern(int n) {
		int j = 1, count = 0, k = 1;

		while (count < 4) {
			if (count == 1)
				k = k + n;
			if (count == 3)
				k = n + 1;

			for (int i = 1; i <= 2 * n - 1; i++) {
				if (i % 2 == 0)
					System.out.print(" * ");
				else
					System.out.print(k++);
			}
			System.out.println();
			count++;
		}
	}

	public static void main(String[] args) {
		Pattern obj = new Pattern();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements in one row: ");
		int num = sc.nextInt();
		System.out.println("Pattern is ");
		obj.pattern(num);
	}
}
