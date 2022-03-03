package problem.arrays;

public class KthSmallestAndLargest<T extends Integer> {


    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        MergeSortWithCopyingIntoSameArray mergeSortWithCopyingIntoSameArray = new MergeSortWithCopyingIntoSameArray();
        mergeSortWithCopyingIntoSameArray.mergeSort(arr);
        for (int i : arr
        ) {
            System.out.println(i);
        }
        System.out.println(kThLargest(3, arr));
        System.out.println(kThSmallest(3, arr));

    }

    private static int kThLargest(int k, int[] a) {
        int i = a.length - 1;
        for (; i >= k; i--) {
        }
        i++;
        return a[i];
    }

    private static int kThSmallest(int k, int[] a) {
        int i = 0;
        for (; i < k; i++) {
        }
        i--;
        return a[i];
    }
}
