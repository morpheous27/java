
public class LizkovSubtitutionTest {

	public static void main(String[] args) {

		Animal a = new Animal();

		Dog d = new Dog();

		LizkovSubtitutionTest obj = new LizkovSubtitutionTest();

		obj.askAnimalToSpeak(d);
	}

	public void askAnimalToSpeak(Dog animal) {
		animal.speak();
	}
}

// parent
class Animal {

	public void speak() {
		System.out.println("speaking");
	}

}

// Child 1
class Dog extends Animal {
}

// child 2
class Cat extends Animal {
}
