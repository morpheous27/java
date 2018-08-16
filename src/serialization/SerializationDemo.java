package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Person p = new Person("nitin", 121);

		/*
		 * File f = new File("D:\\test.txt"); FileOutputStream fos = new
		 * FileOutputStream(f); ObjectOutputStream oos = new
		 * ObjectOutputStream(fos); oos.writeObject(p); fos.close();
		 * oos.close();
		 */

		File f = new File("D:\\test.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee pd = (Employee) ois.readObject();
		fis.close();
		ois.close();
		// System.out.println(pd.id);
		// /System.out.println(pd.name);

	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException {
		try {

			ois.defaultReadObject();
			// ois.readInt();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void writeObject(ObjectOutputStream oos) {
		try {
			oos.defaultWriteObject();
			// oos.writeInt(intValue);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1234L;

	public String name;
	public int id;

	Person() {
	}

	Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

}

class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -123L;

}
