import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Patient {
	private String name;
	private int criticality;

	public Patient(String n, int c) {
		name = n;
		criticality = c;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCriticality() {
		return criticality;
	}

	public void setCriticality(int criticality) {
		this.criticality = criticality;
	}

}

class SchedulePatient implements Comparator<Patient> {

	public int compare(Patient p1, Patient p2) {
		if (p1.getCriticality() > p2.getCriticality())
			return 1;
		else if (p1.getCriticality() < p2.getCriticality())
			return -1;
		else
			return 0;
	}

}

public class PriorityQueueHospital {

	public static void main(String[] args) {

		Queue<Patient> pq = new PriorityQueue<Patient>(10, new SchedulePatient());
		// Queue<Patient> pq = new PriorityQueue<Patient>();
		Scanner sc = new Scanner(System.in);
		pq.add(new Patient("p5", 21));
		pq.add(new Patient("p1", 23));
		pq.add(new Patient("p2", 3));
		pq.add(new Patient("p3", 5));
		pq.add(new Patient("p4", 22));
		pq.add(new Patient("p6", 7));
		for (Patient p : pq)
			System.out.println(p.getName() + " " + p.getCriticality());

		while (pq.size() > 0) {
			// System.out.println(pq.peek().getName()+"peek "
			// +pq.peek().getCriticality());

			System.out.println(pq.poll().getCriticality());
		}
		// System.out.println(p.getName() +" "+ p.getCriticality());

		// char ch[] = {'y'};
		// do
		// {
		//
		//// if(ch[0]!='Y' || ch[0]!='y')
		//// {
		//// break;
		//// }
		//
		// System.out.println("Enter the patient name");
		// String pname = sc.next();
		// System.out.println("Enter the patient criticality");
		// int pc = sc.nextInt();
		// pq.add(new Patient(pname, pc));
		// System.out.println("Element after insertion are :");
		// for(Patient p : pq)
		// System.out.println(p.getName() +" "+ p.getCriticality());
		// System.out.println("type Y to continue");
		// ch= (sc.next().toCharArray());
		//
		// }while(ch[0] == 'Y' || ch[0] == 'y');

	}

}
