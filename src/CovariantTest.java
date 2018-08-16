
public class CovariantTest {

	public static void main(String[] args) {

		ParentClass obj = new ChildClass();
		Integer o = 12 + obj.getSum().intValue(); 
		
		System.out.println(o);
	}

}



class ParentClass {

	public Number getSum() {
		
		return 1;
	}

}

class ChildClass extends ParentClass {
	
	public Float getSum() {
		
		return 1f;
	}
}
