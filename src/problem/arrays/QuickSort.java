package problem.arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = new int[]{13, 5, 2, 4, 9, 31,
                1, 7, 3, 11, 12, 12};
        quicksort(a);
        for(int i : a){
            System.out.println(i);
        }
    }

    private static void quicksort(int a[]){
        if(a == null || a.length == 0)
            return;

        int l = 0;
        int h = a.length -1;
        partition(a,l,h);
    }

    private static void partition(int a[], int l, int h){
        int i=l, j=h;
        int m = (l+h)/2;
        int p = a[m];

        while(i <= j){
            while(p > a[i]){
                i++;
            }

            while(p < a[j]){
                j--;
            }

            if(i <= j){
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
                i++; j--;
            }
        }

        if(l < j){
            partition(a,l,j);
        }
        if(i < h){
            partition(a,i,h);
        }
    }
}
