package Strings;

public class NullStringOrObject {
	public static void main(String ags[])
	{
		NullStringOrObject obj = new NullStringOrObject();
		obj.print(null);
	}
	private void print(String str)
	{
		System.out.println("null is a string");
	}
	
	private void print(Object obj)
	{
		System.out.println("null is an object");
	}
}


