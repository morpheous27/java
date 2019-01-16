package generics;

import java.util.List;

public class NonGenericCollectionTest {

	
	
	public static void insert(List list)
	{
		list.add(1); // primitive can also be inserted into a generic list
		list.add("");
	}
	
	public static void insertIntoIntegerList(List<Integer> list)
	{
		list.add(1); // primitive can also be inserted into a specific data type list
		//list.add("");  // error as string is not allowed for Integer container
	}
	
	
	public static void print(List list)
	{
		//for(Number n : list) // jvm will not cast the value but user has to explicitly cast
		for(Object o : list)
			System.out.println(o);
	}
	
	public static void checkSuperType(List<? super Number> list)
	{
		//for(Number n : list) // jvm will not cast the value but user has to explicitly cast
		for(Number o : list)
			System.out.println(o);
	}
	
	
}
