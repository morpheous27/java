package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumerChaining {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a", "b", "c");
		List<String> list2 = new ArrayList();

		list.stream().forEach((p) -> {
			list2.add(p);
			System.out.println(p);
		});

		System.out.println(list2);

	}

}
