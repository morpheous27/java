
import java.util.ArrayList;

public class PassByRef {

	public void a() {
		int i = 3;
		++i;
		System.out.println("in method a , the value of i  " + i);
		b(i);
		System.out.println("after calling  , the value of i  " + i);
		ArrayList obj = new ArrayList();
		obj.add("abc1");
		obj.add("abc2");
		System.out.println("before inserting " + obj.size());
		obj.size();
		b(obj);

		System.out.println("After  inserting " + obj.size());
	}

	public void b(ArrayList obj1) {

		obj1.add("abc3");

	}

	public void b(int i) {
		++i;
	}

	public static void main(String[] args) {
		PassByRef cc = new PassByRef();
		cc.a();
	}
}
