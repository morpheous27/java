package dsAlgo;

import java.util.Arrays;

public class Heap<T extends Integer> {
    int DEFAULT_CAPACITY = 10;
    int heap[];
    int size = 0;

    // default constructor
    public Heap(){
        heap = new int[DEFAULT_CAPACITY];
    }

    public Heap(int a[]){
        heap = a;
        size = a.length;
    }

    public static void main(String[] args) {
        driver();
    }

    public void insert(Integer t){
        heap[size++] = t;
        heapifyRecursive(0);
    }

    /**
     * Method for rearranging the items to ensure they are forming a heap.
     * @param s
     */
    public void heapifyRecursive(int s){
        int largest = s;
        int l = (2*s)+1;
        int r = (2*s)+2;

        if(l<size && heap[largest] < heap[l]){
            largest = l;
        }

        if(r<size && heap[largest] < heap[r]){
            largest = r;
        }

        if(s!= largest){
            int t = heap[largest];
            heap[largest] = heap[s];
            heap[s] = t;
            heapifyRecursive(largest);
        }
    }

    public int[] sort(){
        int [] sortedArr = new int[size];
        heapifyRecursive(0);
        for(int i=0;i<size-(i+1);i++){

            int t = heap[i];
            heap[i] = heap[size- (i+1)];
            heap[size - (i+1)] = t;

            heapifyRecursive(0);
            System.out.printf("%d ",sortedArr[i]);
        }
        return heap;
    }

    public Integer delete(int s){
        if(size<=0){
            return -1;
        }
        int removedElement = heap[s];
        heapifyRecursive(s);
        return removedElement;
    }

    public void print(){
        for(int i=0;i<size; i++)
            System.out.println(heap[i]);
    }

    /*---------------*/
    static void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        // if left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // if right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // if largest is not root
        if (largest != i)
        {
            //swap(arr[i], arr[largest]);

            // recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    static void heapSort(int arr[], int n)
    {
        // build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // one by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // move current root to end
            int t = arr[0];
            arr[0] = arr[i];
            arr[i] = t;
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void driver(){
        int arr[] = {121, 10, 130, 57, 36, 17};
        int n = arr.length;

        heapSort(arr, n);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
