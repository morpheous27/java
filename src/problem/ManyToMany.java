package problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManyToMany {

	Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
	Map<Integer, Course> courseMap = new HashMap<Integer, Course>();
	Map<Integer, Integer> s2cMap = new HashMap<Integer, Integer>();
	Map<Integer, Integer> c2sMap = new HashMap<Integer, Integer>();
	int assArray[][] = new int[studentMap.size()][courseMap.size()];
	{
		studentMap.put(11, new Student(1, "amar"));
		studentMap.put(21, new Student(2, "akbar"));
		studentMap.put(31, new Student(3, "anthony"));

		courseMap.put(10, new Course(1, "science"));
		courseMap.put(20, new Course(2, "social"));
		courseMap.put(30, new Course(3, "maths"));
		courseMap.put(40, new Course(4, "english"));

		String test = "test";

		assArray[0][0] = 0;
		assArray[0][1] = 10;
		assArray[0][2] = 20;
		assArray[0][3] = 30;
		assArray[0][4] = 40;

		assArray[1][0] = 11;
		assArray[2][0] = 21;
		assArray[3][0] = 31;

		assArray[1][1] = 1;
		assArray[1][2] = 1;
		assArray[1][3] = 0;
		assArray[0][1] = 10;
		assArray[0][1] = 10;
		assArray[0][1] = 10;

		// s2cMap.put(1, 1);
		// s2cMap.put(1, 2);
		// s2cMap.put(2, 4);
		// s2cMap.put(3, 3);
		// s2cMap.put(3, 4);
		//
		// c2sMap.put(1, 1);

	}

	List<Student> getStudentList(Integer Courseid) {

		return null;

	}
}

class Student {
	Integer studentId;
	String fname;
	List<Course> list = new ArrayList<Course>();

	Student(Integer id, String name) {
		studentId = id;
		fname = name;
	}

}

class Course {
	Integer courseId;
	String courcename;
	List<Student> list = new ArrayList<Student>();

	Course(Integer id, String name) {
		courseId = id;
		courcename = name;

	}
}