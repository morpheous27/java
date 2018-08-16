import java.util.ArrayList;
import java.util.List;

class PassByValue {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		int[] intA = new int[10];
		arr.add(3);
		int x = 3;
		System.out.println("Value of x before calling increment() is " + arr.get(0));
		increment(arr.get(0));
		System.out.println("Value of x after calling increment() is " + arr.get(0));
		addToList(arr);

		System.out.println("value of list after insertion in caller" + arr);
		changeToIntArray(intA);
		System.out.println("value of int array in caller" + intA[0]);
	}

	public static void increment(int a) {
		System.out.println("Value of a before incrementing is " + a);
		a = a + 1;
		System.out.println("Value of a after incrementing is " + a);
	}

	public static void addToList(List a) {
		System.out.println("Value of a before insertion is " + a);
		// a.add(4);
		a = new ArrayList<String>();
		a.add("nitin");
		System.out.println("Value of a after insertion is " + a);
	}

	public static void changeToIntArray(int[] a) {
		System.out.println("Value of a before changing int array " + a[0]);
		a[0] = 10;
		System.out.println("Value of a after changing int array " + a[0]);
	}
}