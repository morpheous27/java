package problem.arrays;

import java.util.stream.Stream;

public class ArrayMergeSort {


    private static void mergeSort(int a[], int l, int m, int r) {

        int t[] = new int[r-l+1];

        int i = l, j=m+1, k = 0;
        while (i <=m  && j <=r) {
            if (a[i] <= a[j]) {
                t[k] = a[i];
                i++; k++;
            } else {
                t[k] = a[j];
                j++; k++;
            }
        }

        while (i <=m) {
            t[k] = a[i];
            i++; k++;
        }

        while (j <= r) {
                t[k] = a[j];
                j++; k++;
        }

        for(i = l; i <= r; i += 1) {
            a[i] = t[i - l];
        }

    }

    private static void mergeSort(int a[]) {
        //setp 1 - finding the middle element
        int l = 0, r = a.length - 1;
        split(a, l, r);
    }

    ;

    private static void split(int a[], int l, int r) {
        if (l < r) {
            int m = (r + l)/2;
            split(a, l, m);
            split(a, m + 1, r);
            mergeSort(a, l, m, r);
        }
    }

    public static void main(String[] args) {

        int a[] = new int[]{3, 5, 2, 4, 9, 3,
                1, 7, 3, 11, 12, 3};
        mergeSort(a);
        for(int i : a)
            System.out.println(i);
    }
}
