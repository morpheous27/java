
public class ReverseSentence {

	String sent = "Today is a very good day";
	String revSent = "";

	private void reverse() {

		int sentleng = sent.length(), i = 0, j = 0, count = 0;

		while (i < sentleng) {
			if (sent.charAt(i++) == ' ')
				count++;
		}
		i = 0;
		String arr[] = new String[count + 1];
		while (i < count) {
			arr[i++] = " ";
		}
		arr[i] = "";

		i = 0;
		while (i < sentleng) {
			if (sent.charAt(i) == ' ') {
				j++;
			} else {
				arr[j] = arr[j] + sent.charAt(i);
			}
			i++;
		}
		i = arr.length - 1;
		while (i >= 0) {
			revSent = revSent + arr[i--];
		}
	}

	public static void main(String[] args) {
		ReverseSentence rs = new ReverseSentence();
		rs.reverse();
		System.out.println("reverse string is : ");
		System.out.println(rs.revSent);
	}

}
