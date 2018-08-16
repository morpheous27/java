public class AlternateSort {

	int arr[] = { 4, 56, 7, 23, 32, 13, 21 };

	public static void main(String[] args) {
		AlternateSort obj = new AlternateSort();
		obj.sortByConventional(obj.arr);
		// Arrays.sort(obj.arr);
		// System.out.println("sorted array");
		// for(int i=0;i< obj.arr.length;i++)
		// {
		// System.out.println(obj.arr[i]);
		// }
		// System.out.println("alternate sorted");
		// for(int i=0;i< obj.arr.length;i=i+2)
		// {
		// System.out.println(obj.arr[i]);
		// }
	}

	public void sortByConventional(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
				if (arr[i] > arr[j]) {
					swap(i, j);
				}
		display();
	}

	public void swap(int a, int b) {
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public void display() {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

}
