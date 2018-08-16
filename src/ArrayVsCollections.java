import java.util.ArrayList;
import java.util.List;

public class ArrayVsCollections {

	public static void main(String[] args) {
		Object[] objArr = new Object[10];
		objArr[0] = new Integer(1);
		objArr[1] = new String("1");

		System.out.println(objArr.getClass().getName());

		List<String> list = new ArrayList<String>();
		list.add("1");
		System.out.println(list.getClass().getName());
	}
}
