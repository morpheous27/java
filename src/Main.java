import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

	private final String[] tens = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	private final String[] nums = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

	private Main() {
	}

	private String LessThanOneThousand(int number) {
		String upTo;

		if (number % 100 < 20) {
			upTo = nums[number % 100];
			number /= 100;
		} else {
			upTo = nums[number % 10];
			number /= 10;

			upTo = tens[number % 10] + upTo;
			number /= 10;
		}
		if (number == 0)
			return upTo;
		return nums[number] + "Hundred" + upTo;
	}

	public String convert(long number) {
		// 0 to 999 999 999 999
		if (number == 0) {
			return "Zero";
		}

		String snumber = Long.toString(number);

		// pad with "0"
		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		snumber = df.format(number);

		int billions = Integer.parseInt(snumber.substring(0, 3));
		int millions = Integer.parseInt(snumber.substring(3, 6));
		int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
		int thousands = Integer.parseInt(snumber.substring(9, 12));

		String inBillions;
		switch (billions) {
		case 0:
			inBillions = "";
			break;
		case 1:
			inBillions = LessThanOneThousand(billions) + "Billion";
			break;
		default:
			inBillions = LessThanOneThousand(billions) + "Billion";
		}
		String result = inBillions;

		String inMillions;
		switch (millions) {
		case 0:
			inMillions = "";
			break;
		case 1:
			inMillions = LessThanOneThousand(millions) + "Million";
			break;
		default:
			inMillions = LessThanOneThousand(millions) + "Million";
		}
		result = result + inMillions;

		String inHundredThousands;
		switch (hundredThousands) {
		case 0:
			inHundredThousands = "";
			break;
		case 1:
			inHundredThousands = "OneThousand";
			break;
		default:
			inHundredThousands = LessThanOneThousand(hundredThousands) + "Thousand";
		}
		result = result + inHundredThousands;

		String inThousands;
		inThousands = LessThanOneThousand(thousands);
		result = result + inThousands;
		return result;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s;
		Main object = new Main();
		while ((s = in.readLine()) != null) {
			;
			System.out.println((object.convert(Long.parseLong(s))).trim() + "Dollars");
		}
	}
}
