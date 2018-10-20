import java.util.Arrays;
import java.util.Comparator;

public class Compares {

	int a;

	public static void main(String[] args) {

		String a[] = { "nitin", "saxena" };
		MySort m = new MySort();
		Arrays.sort(a, m);
		System.out.println(Arrays.binarySearch(a, "saxena"));

	}

	static class MySort implements Comparator<String> {
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			int a = 1;
			return o1.compareTo(o2);
		}
	}

}
