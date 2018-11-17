package Strings;

public class ImmutableStringTest {
	
	static public void main(String ags[])
	{
		ImmutableStringTest ob = new ImmutableStringTest();
		String username = "Nitin";
		ob.print(username);
		System.out.println(username);
		//username = "saxena";
		//ob.print(username);
	}
	
	private void print(String username)
	{
		username = "saxena";
		System.out.println(username);
	}
}
