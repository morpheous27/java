package singleton;

public class SingletonEnum {

	public static void main(String[] args) {

		Singleton obj = Singleton.INSTANCE;
		obj.setAB(1, 2);
		System.out.println(obj.getProduct());
		Singleton obj2 = Singleton.INSTANCE;
		System.out.println(obj2.getProduct());
	}

}

enum Singleton {

	INSTANCE;

	private int a;
	private int b;

	public void setAB(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getProduct() {
		return a * b;
	}

}
