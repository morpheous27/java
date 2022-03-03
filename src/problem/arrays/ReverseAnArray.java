package problem.arrays;

import java.util.stream.Stream;

public class ReverseAnArray {

    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 2, 4, 9, 3,
                1, 7, 3, 11, 12, 3};

        int[] reversedArr =  reverseArray(arr);
        for(int i=0;i<reversedArr.length; i++)
            System.out.println(reversedArr[i]);

        Stream.of(reversedArr).forEach(System.out::println);
    }

    static int[] reverseArray(int arr[]){
        int[] reversedArray = new int[arr.length];
        int j=0;

        for(int i= arr.length-1;i>=0;i--){
            reversedArray[j++] = arr[i];
        }

        return reversedArray;
    }

}
