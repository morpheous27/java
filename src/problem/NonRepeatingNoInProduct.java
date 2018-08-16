package problem;

import java.util.ArrayList;
import java.util.List;

public class NonRepeatingNoInProduct {

	public static void main(String[] args) {

		int count = nonRepeatingDigitProductCount(3, 10, 15);
		System.out.println(count);

	}

	static int nonRepeatingDigitProductCount(int x, int y, int z) {

		int count = 0;

		for (int i = y; i <= z; i++) {
			
			Integer product = x * i;

			if (!checkIfContains(getDigitsOfNumber(product), getDigitsOfNumber(i))) {
				count++;
			}

		}
		return count;
	}

	static List<Integer> getDigitsOfNumber(Integer x) {
		
		Integer localX = x;
		List<Integer> digits = new ArrayList<>();

		while (localX > 0) {
			Integer mod = localX % 10;
			digits.add(mod);
			localX = localX / 10;
		}
		return digits;
	}
	
	static boolean checkIfContains(List<Integer> digits1, List<Integer> digits2)
	{
		for(Integer i : digits1)
		{
			if(digits2.contains(i))
			{
				return true;
			}
		}
		return false;
	}

}
