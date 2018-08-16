package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class HierarchySerialization extends SubSuper {

	int e;
	String f;

	// ComponentClass cc;

	public HierarchySerialization() {
		System.out.println("Hierarchy class");
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		HierarchySerialization obj = new HierarchySerialization();

		// cc.g = 11;
		// cc.h = "eleven";
		// obj.cc = new ComponentClass();
		obj.e = 10;
		obj.f = new String("ten");
		obj.a = 8;
		obj.b = "eight";
		obj.c = 9;
		obj.d = "nine";
		SerializeObject.saveMe(obj);

		HierarchySerialization go = (HierarchySerialization) DSerializeObject.getMe();
		System.out.println(go);

	}

	public String toString() {
		return a + " " + b + " " + c + " " + d + " " + e + " " + f;
	}

}

class Super implements Serializable {
	int a;
	String b;

	Super() {
		System.out.println("super class");
	}

	public String toString() {
		return a + " " + b;
	}
}

class SubSuper extends Super {
	int c;
	String d;

	SubSuper() {
		System.out.println("Subsuper class ");
	}

	public String toString() {
		return c + " " + d;
	}
}

class ComponentClass {
	int g;
	String h;

	public ComponentClass() {
		System.out.println("component class");
	}
}

class SerializeObject {
	static boolean saveMe(HierarchySerialization obj) throws FileNotFoundException, IOException {

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File("D:\\Test.txt")));
		os.writeObject(obj);
		// os.writeInt(obj.a);
		// os.writeInt(obj.c);
		// os.writeChars(obj.b);
		// os.writeChars(obj.d);

		os.close();

		return true;
	}
}

class DSerializeObject {
	static Object getMe() throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream is = new ObjectInputStream(new FileInputStream(new File("D:\\Test.txt")));
		HierarchySerialization obj = (HierarchySerialization) is.readObject();
		// obj.a = is.readInt();
		// obj.c = is.readInt();
		// obj.b = str(is, obj);
		// obj.d = str(is, obj);

		is.close();

		return obj;
	}

	private static String str(ObjectInputStream o, HierarchySerialization h) throws IOException {
		String word = "";
		while (o.read() != -1) {
			word = word + o.readChar();
		}
		return word;

	}
}