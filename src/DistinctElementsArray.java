public class DistinctElementsArray {

	int a[] = { 9, 7, 34, 55, 67 };
	int b[] = { 4, 7, 34, 9, 22 };

	public void checkDistinct(int[] arr1, int[] arr2) {
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {

			while (j < (arr2.length) && (arr1[i] != arr2[j])) {
				j++;
			}
			if (j == arr2.length) {
				System.out.println(arr1[i]);
				j = 0;
			} else if (arr1[i] == arr2[j]) {
				j = 0;
				continue;
			}

		}
	}

	public static void main(String[] args) {

		DistinctElementsArray obj = new DistinctElementsArray();
		System.out.println("List of Distinct elements is:");
		obj.checkDistinct(obj.a, obj.b);
		obj.checkDistinct(obj.b, obj.a);
	}

}
