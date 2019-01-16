
public class OverloadingTest {
	
	public static void main(String[] args) {
		
		Child p = new Child();
		p.act("name", 1.1f);
	}

	static class Parent {
		public int act(String name, float f) {
			System.out.println("act in parent");
			return 0;
		}
	}
	
	static class Child extends Parent
	{
		public void act(String name, int a)
		{
			System.out.println("act i n child");
		}
	}
}
