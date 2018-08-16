import java.util.ArrayList;
import java.util.List;

public class DeepCopyTestUsingCopyConstructor {

	public static void main(String[] args) {
		ObjectToDeepClone originalObj = new ObjectToDeepClone();
		System.out.println(originalObj.list);
		
		ObjectToDeepClone duplicateObj = new ObjectToDeepClone(originalObj);
		System.out.println(duplicateObj.list.add("three"));
		
		System.out.println(originalObj);
		System.out.println(duplicateObj);
	}

}

class ObjectToDeepClone {

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

}
