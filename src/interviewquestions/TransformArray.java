package interviewquestions;

public class TransformArray {

    static void transform(int a[],int x){
        if(a[x] == x){
            return;
        }

        int temp = a[x];
        a[x] = x;

    }
}
