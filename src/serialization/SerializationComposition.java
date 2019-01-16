package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import dto.HouseExternizable;
import dto.HouseSerializable;
import dto.Wall;

public class SerializationComposition {

	public HouseSerializable house;

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		serializeObject();
		deserializeObject();
	}

	public static void serializeObject() throws IOException {
		HouseSerializable houseSerializable = new HouseSerializable();
		Wall wall = new Wall();
		wall.setWidth(20);
		houseSerializable.setWall(wall);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Test.txt"));
		oos.writeObject(houseSerializable);
		oos.close();
	}

	public static void deserializeObject() throws IOException, ClassNotFoundException {

		ObjectInputStream oos = new ObjectInputStream(new FileInputStream("D:\\Test.txt"));
		HouseSerializable obj = (HouseSerializable) oos.readObject();
		System.out.println("obj - " + obj.getWall().getWidth());

		oos.close();
	}

}
