package Strings;

/**
 * Null will be resolved as string instead of Object since string is more specific than Object.
 * @author nitsaxen0
 *
 */
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


