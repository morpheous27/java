package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class ExternizableTest implements Externalizable {
	int i;
	String s;

	public ExternizableTest() {
		System.out.println("Data default constructor");
	}

	public ExternizableTest(String x, int a) {
		System.out.println("Second constructor");
		s = x;
		i = a;
	}

	public String toString() {
		return s + i;
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		// out.writeInt(i);
	}

	public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException {
		s = (String) in.readObject();
		// i = in.readInt();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ExternizableTest d = new ExternizableTest("String value", 1514);
		System.out.println(d);
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("data.out"));
		o.writeObject(d);
		o.close();

		// Now deserialize
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.out"));
		d = (ExternizableTest) in.readObject();
		System.out.println(d);
	}
}