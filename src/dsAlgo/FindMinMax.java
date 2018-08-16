package dsAlgo;

/*
 * Program to find min and max element from an array of integer.
 */
public class FindMinMax {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 5, 1, 2, 6, 9, 2, 10, 11 };
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i * 2] > max) {
				max = arr[i * 2];
			}
			if (arr[i * 2 + 1] < min) {
				min = arr[i * 2 + 1];
			}
			if (arr[i * 2] < min) {
				min = arr[i * 2];
			}
			if (arr[i * 2 + 1] > max) {
				max = arr[i * 2 + 1];
			}
		}
		if (arr.length % 2 != 0) {
			if (arr[arr.length] > max) {
				max = arr[arr.length];
			}
			if (arr[arr.length] < min) {
				min = arr[arr.length];
			}
		}

		System.out.println("min : " + min);

		System.out.println("max : " + max);
	}
}