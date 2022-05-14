package problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaximumVacations {
    public static void main(String[] args) {
        Set<Integer> obligations = new HashSet<>(Arrays.asList(6,9,3,2,7));
        //Set<Integer> obligations = new HashSet<>(Arrays.asList(2,5,7));
        int n = 10, k = 2, left=0, right=0;
        int result = 0;
        int[] days = new int[n];
        for(int i=0;i<n;i++){
            days[i] = i+1;
        }
        while(right < n){
            if(obligations.contains(days[right])){
                if(k==0){
                    result = Math.max(result,right-left);
                    while(k==0){
                        if(obligations.contains(days[left])){
                            k++;
                        }
                        left++;
                    }
                }
                k--;
            }
            right++;
        }
        result = Math.max(right-left, result);
        System.out.println(result);
    }
}
