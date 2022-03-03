package problem.arrays;


public class KeyInSubSegment {
    private static boolean isKeyPresentInEverySubSegment(int a[], int segmentSize, int key) {
        int n = a.length;
        boolean isPresentInSubSegment = false;
        int segmentStartIndex = segmentSize;

        for (int i = 0; i < n; ) {

            if (a[i] == key) {
                isPresentInSubSegment = true;
                if (segmentStartIndex < n) {
                    i = segmentStartIndex;
                    segmentStartIndex = segmentStartIndex * 2;
                } else {
                   return isPresentInSubSegment;
                }
            } else {
                if (i == segmentStartIndex - 1) {
                    return false;
                }
                isPresentInSubSegment = false;
                i += 1;
            }
        }
        return isPresentInSubSegment;
    }

    public static void main(String[] args) {

        int arr[] = new int[]{3, 5, 2, 4, 9, 3,
                1, 7, 3, 11, 12, 3};
        int segmentSize = 12, key = 3;

        boolean isPresent = isKeyPresentInEverySubSegment(arr, segmentSize, key);
        if (isPresent)
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
