public class fiboTest {
	public static int fibo(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return fibo(n - 1) + fibo(n - 2);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.print(fiboTest.fiboTail(i, 0) + " ");
	}

	public static int fiboTail(int n, int sum) {
		if (n == 0) {
			sum = 0;
			return sum;

		}
		if (n == 1) {
			sum = 1;
			return sum;
		}

		return fiboTail(n - 1, sum + (n));
	}

}
