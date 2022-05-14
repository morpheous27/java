package amazon;

import java.util.Arrays;
import java.util.Stack;

public class NextLessElement {
    public static void main(String[] args) {
        int[] a = {3,1,2,4,7,3,2};
        int[] nle = new int[a.length];

        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!stk.isEmpty() && stk.peek() > a[i]){
                int x = stk.pop();
                nle[x] = i;
            }
            stk.push(i);
        }
        Arrays.stream(nle).forEach(System.out::println);
    }
}
