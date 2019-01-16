package overloading;

public class OverloadingVsOverriding {
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.print(null);
	}

}


class Child extends Parent
{
	public void print(String obj)
	{
		System.out.println("null is string");
	}

}

class Parent
{
	
	public void print(Object obj)
	{
		System.out.println("null is object");
	}
}
