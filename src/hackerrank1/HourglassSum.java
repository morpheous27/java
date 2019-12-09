package hackerrank1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HourglassSum {

	public static void main(String[] args) throws IOException {

		Map<Integer, int[][]> map = new HashMap<Integer, int[][]>();

		int array[][] = new int[6][6];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//mmbr.rea
		for (int i = 0; i < 6; i++) {

			String line = br.readLine();
			String tokens[] = line.split(" ");
			for (int j = 0; j < 6; j++)
				array[i][j] = new Integer(tokens[j]);

		}

		int start = 0, end = start = +2, rStart = 0, cStart = -1;
		
		while(true)
		{
		if(cStart+2<=5)
		{
			cStart ++;
		}
		else
		{
			cStart =0;
			rStart++;
			if(rStart+2>5)
			{
				break;
			}
		}
		int a[][] = new int[3][3];
		int sum = 0, rcount = 0;

		for (int i = rStart; i <= rStart + 2; i++) {
			rcount++;
			for (int j = cStart; j <= cStart + 2; j++) {
				if (rcount == 2) {
					if (i == j) {
						a[i][j] = array[i][j];
						sum += array[i][j];
					}
				} else {
					a[i][j] = array[i][j];
					sum += array[i][j];
				}

			}
		}
		
		map.put(sum,a);
		//cStart++;
		}
	}

}
