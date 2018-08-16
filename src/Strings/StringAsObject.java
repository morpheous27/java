package Strings;

public class StringAsObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String a = "a";
		String b = "a";
		String c = new String("a");
		StringBuffer sb = new StringBuffer("a");
		if (a == b)
			System.err.println("step1");
		if (a == c.intern())
			System.err.println("step2");
		if (a.equals(b))
			System.err.println("step3");
		if (a.equals(c))
			System.err.println("step4");
		if (a.equals(sb.toString()))
			System.err.println("step5");
		if (a instanceof Object)
			System.err.println("step6");
		if (null instanceof Object)
			System.err.println("step7");
		if (null instanceof String)
			System.err.println("step8");
	}

}
