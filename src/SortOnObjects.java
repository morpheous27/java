import java.util.Set;
import java.util.TreeSet;

public class SortOnObjects {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet();

		set.add(new Integer(4));
		set.add(new Integer(3));
		set.add(new Integer(0));
		set.add(new Integer(1));
		System.out.println(set);
	}
}
