import java.util.Scanner;

public class prime {

	public static void main(String[] args) {

		boolean flag = false;
		System.out.println("enter num");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		l1: for (int i = 2; i < num; i++) {
			int j = 2;
			for (; j < i; j++) {
				if (i % j == 0) {
					continue l1;
				}

			}
			if (j == i) {
				System.out.println(i);
			}
		}

	}

}
