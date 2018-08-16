public class testdistinct {

	int arr3[] = new int[10];

	public void distinctCalculate(int[] a, int[] b) {
		l1: for (int i = 0; i < a.length; i++) {
			int j = 0;
			for (; j < b.length; j++) {
				if (a[i] == b[j]) {
					continue l1;
				} else {

				}
				if (j == b.length - 1) {
					System.out.println(a[i]);
				}
			}

		}
	}

	public static void main(String[] args) {
		testdistinct t = new testdistinct();
		int arr1[] = { 13, 45, 67 };
		int arr2[] = { 13, 34, 21 };
		t.distinctCalculate(arr1, arr2);
		t.distinctCalculate(arr2, arr1);
	}
}
