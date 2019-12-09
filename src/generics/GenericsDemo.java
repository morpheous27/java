package generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	List<? extends Number> numberList = new ArrayList<Integer>();

	public static void main(String[] args) {

		List<Integer> iList = new ArrayList<Integer>();
		iList.add(1);
		iList.add(2);
		List<Float> fList = new ArrayList<Float>();
		fList.add(1.1f);
		fList.add(2.2f);
		GenericsDemo demo = new GenericsDemo();
		//demo.testSuper(fList); // compile time error
		demo.testSuperUsingInterface(iList);
		demo.testExtends(fList);

	}

	private void testExtends(List<? extends Number> list) {
		System.out.println("extends method");
		for (Number n : list)
			System.out.println(n);				
		//list.add(3); // compile time error
	}

	private void testSuper(List<? super Integer> list) {
		System.out.println("super method");
		for (Object n : list)
			System.out.println(n);
		list.add(3);
	}
	
	private void testSuperUsingInterface(List<? extends Serializable> list) {
		System.out.println("super method");
		for (Object n : list)
			System.out.println(n);
		//list.add(Integer.MAX_VALUE); // compile time error, int is primitive and not serializable
	}

}

