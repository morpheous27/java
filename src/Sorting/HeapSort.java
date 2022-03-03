package Sorting;

public class HeapSort {

    public static void main(String[] args) {
        int a[] = {7, 10, 4, 3, 20, 15};
        buildHeap(a);

        heapSort(a);

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);

    }

    private static void buildHeap(int a[]) {
        for (int i = (a.length) / 2 -1; i >= 0; i--) {
            heapify(a,a.length, i);
        }
    }


    private static void heapify(int a[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && a[l] > a[largest]) {
            largest = l;
        }

        if (r < n && a[r] > a[largest]) {
            largest = r;
        }

        if (largest != i) {
            int t = a[largest];
            a[largest] = a[i];
            a[i] = t;
            heapify(a, n, largest);
        }
    }

    private static void heapSort(int[] heap) {

        int sizeOfHeap =heap.length-1;
        for (int i = sizeOfHeap; i > 0; i--) {
            int t = heap[0];
            heap[0] = heap[i];
            heap[i] = t;
            sizeOfHeap-=1;
            heapify(heap, i,0);
        }
    }
}
