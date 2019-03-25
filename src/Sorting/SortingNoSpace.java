package Sorting;

/**
 * Merge two sorted arrays into one without using extra space.
 * 
 * @author nitin
 *
 */
public class SortingNoSpace {

	public static void main(String[] args) {

		int a1[] = new int[] { 1, 3, 5, 7 };
		int a2[] = new int[] { 2, 4, 6, 8 };
		sort(a1, a2);
		System.out.println("after merge array 1 - "+ a1);
		System.out.println("after merge array 2 - "+ a2);

	}

	private static void sort(int[] a, int[] b) {

		int sizeB = b.length;

		for (int i = 0; i < sizeB; i++) {
			int n = sizeB - 1;
			while (a[n] > b[i]) {
				n--;
			}
			if (n > -1) {
				n = swap(a, b, n, i);
			}
		}
		
	}

	private static int swap(int[] a, int[] b, int n, int i) {
		int temp = a[n++];
		a[n] = b[i];
		b[i] = temp;
		return n;
	}

}
