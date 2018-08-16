import java.util.ArrayList;
import java.util.List;

public class DeepCopyTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		DeepCopyTest mainObject = new DeepCopyTest();
		
		ObjectToDeepClone obj = mainObject.new ObjectToDeepClone();
		
		ObjectToDeepClone cloneObj = obj.clone();
		
		System.out.println(obj);
		obj.a = 5;
		
		System.out.println(obj.a);
		System.out.println(cloneObj.a);
		
		
		
	}
	
	class ObjectToDeepClone implements Cloneable{

		int a;
		List<String> list;

		public ObjectToDeepClone() {
			a = 1;
			list = new ArrayList<String>();
			list.add("one");
			list.add("two");

		}

		ObjectToDeepClone(ObjectToDeepClone obj) {
			a = obj.a;
			list = obj.list;
		}
		
		public ObjectToDeepClone clone() throws CloneNotSupportedException
		{
			return (ObjectToDeepClone) super.clone();
		}

	}


}
