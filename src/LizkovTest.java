
public class LizkovTest {
	
	public static void main(String[] args) {
		
		
		LizkovTest test = new LizkovTest();
		
				
		Parent obj = test.new Child();
		
		//obj.printChild();
		System.out.println(obj.b);
		
		
	}
	
	

	class Parent
	{
		int a;
		int b=1;
		public void printParent()
		{
			System.out.println("Parent");
			
		}
		public void doSomeStuff()
		{
			System.out.println("Parent");
			
		}
		
	}
	
	
	class Child extends Parent
	{
		int b=2;
		public void printChild()
		{
			System.out.println("Parent");
			
		}
		public void doSomeStuff()
		{
			System.out.println("Parent");
			
		}
		
	}
	
	
	
	
}



