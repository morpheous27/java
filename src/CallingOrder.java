public class CallingOrder {

	public static void main(String[] args) {
		System.out.println("main");
		CallingOrder obj = new CallingOrder();
	}

	static {
		System.out.println("static block");
	}

	{
		System.out.println("anonymous block");
	}

	public CallingOrder() {
		System.out.println("constructor");
	}

}
