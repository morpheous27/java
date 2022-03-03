package problem.arrays;

public class Sort012 {
    public static void main(String[] args) {
        int a[] = {2, 0, 0, 1, 2, 1, 0};
        int c0 = 0, c1 = 0, c2 = 0;
        int[] sortedArray = new int[a.length];
        for (int i : a) {
            if (i == 0)
                c0++;
            if (i == 1)
                c1++;
            if (i == 2)
                c2++;
        }

        int i = 0;
        while (c0 > 0) {
            sortedArray[i++] = 0;
            c0--;
        }
        while (c1 > 0) {
            sortedArray[i++] = 1;
            c1--;
        }
        while (c2 > 0) {
            sortedArray[i++] = 2;
            c2--;
        }
        for (int j : sortedArray)
            System.out.println(j);

    }


}
