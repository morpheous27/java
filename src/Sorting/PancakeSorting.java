package Sorting;

public class PancakeSorting {
	int arr[] = { 9, 7, 2, 5, 0, 3, 1 };

	private void flip(int s, int e) {
		int j = e, temp;
		for (int i = 0; i <= Math.floor((s + e) / 2); i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
	}

	private int maxElementIndex(int s, int e) {
		int max = 0, i = 1;
		while (i <= e) {
			if (arr[i] > arr[max]) {
				max = i;
				i++;
			} else {
				i++;
				continue;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		PancakeSorting ps = new PancakeSorting();
		System.out.println("Array before sorting is: ");
		for (int i = 0; i < ps.arr.length; i++)
			System.out.println(ps.arr[i]);

		for (int i = 1; i < ps.arr.length; i++) {
			ps.flip(0, ps.maxElementIndex(0, ps.arr.length - i));
			ps.flip(0, ps.arr.length - i);
		}

		System.out.println("Array after sorting is: ");
		for (int i = 0; i < ps.arr.length; i++)
			System.out.println(ps.arr[i]);
	}
}
