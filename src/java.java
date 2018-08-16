import java.util.Scanner;

public class java {
	public static void main(String[] args) {
		System.out.println("3 random numbers are being generated!");
		int max = 10;
		int min = 1;
		int number1 = (int) (Math.random() * max + min);
		int number2 = (int) (Math.random() * max + min);
		int number3 = (int) (Math.random() * max + min);
		System.out.println("what is the sum?");
		Scanner kb = new Scanner(System.in);
		int sum = number1 + number2 + number3;
		int entered = kb.nextInt();
		int i = 1;
		while (sum != entered) {
			i++;
			System.out.println("please try again");
			entered = kb.nextInt();
		}
	}
}