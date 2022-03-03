package problem.arrays;

public class MergeSortWithCopyingIntoSameArray {
    public static void main(String[] args) {
        int a[] = new int[]{3, 5, 2, 4, 9, 3,
                1, 7, 3, 11, 12, 3};
        mergeSort(a);
        for(int i : a){
            System.out.println(i);
        }
    }

    public static void mergeSort(int[] a){

        int l = 0, r = a.length-1;
        divide(a, l, r);
    }
    private static void divide(int[] a, int l, int r){
     if(l<r){
         int m = (l+r)/2;
         divide(a,l,m);
         divide(a,m+1,r);
         conquer(a,l,m, r);
     }
    }

    private static void conquer(int[] a, int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int j=l, k=m+1;
        int a1[] = new int[n1];
        int a2[] = new int[n2];

        //create temp arrays
        for(int i=0;i<n1;i++, j++){
            a1[i] = a[j];
        }

        for(int i=0;i<n2; i++, k++){
            a2[i] = a[k];
        }
        j=0; k=0;
        int i = l;
        while(j<n1 && k<n2){
            if(a1[j] <= a2[k]){
                a[i] = a1[j];
                i++; j++;
            }else{
                a[i] = a2[k];
                i++; k++;
            }
        }

        while(j<n1){
            a[i] = a1[j];
            i++; j++;
        }

        while(k<n2){
            a[i] = a2[k];
            i++; k++;
        }
    }
}
