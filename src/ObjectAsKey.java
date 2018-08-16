import java.util.HashMap;
import java.util.Map;

public class ObjectAsKey {

	public static void main(String[] args) {

		Map<EmployeeKey, String> map = new HashMap<>();

		EmployeeKey e1 = new EmployeeKey(1,"ns"); // e1.id = 0, e1.name = null;
		EmployeeKey e2 = new EmployeeKey(2,"np"); // e1.id = 0, e1.name = null;
		
		map.put(e1, "nitin");
		map.put(e2, "nidhi");
		
		System.out.println(map.get(e1)); // ?

		//e1.setId(1);

		//System.out.println(map.get(e1)); //
		
		
		
		ObjectAsKey obj = new  ObjectAsKey();
		
		String s1 = "nidhi"; // 123
		
		obj.print(s1);
		

	}

	
	public void print(String s)
	{
		s = "nitin";
		
	}
}

/**
 * This class should be immutable
 * 
 * @author nsax11
 *
 */
class EmployeeKey {
	private int id;
	private String name;

	EmployeeKey() {

	}

	EmployeeKey(int id, String name) {

	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeKey other = (EmployeeKey) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
