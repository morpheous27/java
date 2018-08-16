package ConstructorTest;

public class Constructor {

	int x;

	public Constructor() {
		x = 0;
	}

	public Constructor(int x) {
		this.x = x;
	}

	public void change() {

		new Constructor(); // this will create a new object and existing oject
							// will be untouched.
		x += 1;
	}

	public static void main(String[] args) {

		Constructor obj = new Constructor(10);
		obj.change();
		System.out.println(obj.x);
	}

}
