package problem;

public class sentenceInReverse {

	public static void main(String[] args) {

		sentenceInReverse obj = new sentenceInReverse();
		String sent = "My name is Nitin Saxena";

		String words[] = sent.split(" ");
		String reverseSent = "";
		System.out.println("words:" + words.length);
		for (int i = words.length - 1; i >= 0; i--) {
			reverseSent = reverseSent + words[i] + " ";
		}
		System.out.println(reverseSent);
	}
}
