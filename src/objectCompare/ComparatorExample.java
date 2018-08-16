package objectCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import objectCompare.Players.ComparatorNameAndScore;

/**
 * 1) Alphabetically and then score
 * 
 * 
 * @author nsax11
 *
 */
public class ComparatorExample {

	public static void main(String[] args) {

		Players p1 = new Players("nitin", 10, "saxena");
		Players p2 = new Players("nidhi", 11, "sharma");
		Players p3 = new Players("nish", 12, "sharma");
		Players p4 = new Players("nidhi", 13, "vashisht");

		List<Players> list = new ArrayList<Players>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		Players p = new Players("name", 1, "surname");
		Players.ComparatorNameAndScore comp = new ComparatorNameAndScore();

		Collections.sort(list, comp);
		System.out.println(list);

	}

}

class Players {

	private String name;
	private int score;
	private String surname;

	Players(String n, int s, String sn) {
		name = n;
		score = s;
		surname = sn;
	}

	@Override
	public String toString() {
		return name + " " + score + " " + surname;

	}

	static class ComparatorNameAndScore implements Comparator<Players> {

		@Override
		public int compare(Players o1, Players o2) {
			if (o1.name.equals(o2.name)) {
				return o2.score - o1.score;
			} else {
				return o1.name.compareTo(o2.name);
			}
		}

	}

}
