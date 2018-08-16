import java.util.ArrayList;
import java.util.List;

// immutable class
public class ImmutableCollection {

	public static void main(String[] args) {

		final List<String> gender = new ArrayList<String>(); // @123
		gender.add("male");
		gender.add("female");
		
		ImmutableList obj = new ImmutableList(gender); //@123
		
		gender.add("transgender");
		
		System.out.println(obj.getList());
		
		List<String> list2 = obj.getList();
		System.out.println(list2);
		
		list2.add("transgender");
		
		System.out.println(obj.getList());
		
	}

}

final class ImmutableList {

	//reference 
	private final List<String> list; 

	public ImmutableList(List<String> list) {
		
		this.list = new ArrayList<String>(list); 
	}

	public List<String> getList() {
		// reference
		
		return new ArrayList<String>(list);  
	}

}
