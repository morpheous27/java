
public class MatrixTransposeMultiplication {

	int s, m, n;

	int[][] matrixMultiply(int s, int m, int n) {
		int a[][] = new int[m][n];
		int b[][] = new int[n][m];

		int value = s;
		for (int i = 0; i < m; i++) {
			for (int j = 0; i < n; j++) {
				a[i][j] = value++;
			}

		}
		value = s;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; i < m; j++) {
				b[i][j] = value;
				value += m;
			}
			value = s + i;

		}

		// for(int i=0;;)
		{
		}

		// int[] resArr[] = new int[m][m];
		int[] resArr[] = { { 1, 2 }, { 2, 3 } };
		int i[] = new int[2];

		return resArr;
	}

	public static void main(String[] args) {

		MatrixTransposeMultiplication obj = new MatrixTransposeMultiplication();
		int res[][] = obj.matrixMultiply(1, 2, 3);

	}

}
