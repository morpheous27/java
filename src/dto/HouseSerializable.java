package dto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class HouseSerializable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int area;
	private String name;
	private Wall wall;

	public Wall getWall() {
		return wall;
	}

	public void setWall(Wall wall) {
		this.wall = wall;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeInt(area);
		out.writeObject(name);
		out.writeInt(wall.getWidth());

	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {

		this.area = in.readInt();
		this.name = (String) in.readObject();
		this.wall = new Wall();
		wall.setWidth(in.readInt());

	}

}
