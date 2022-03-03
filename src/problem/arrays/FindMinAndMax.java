package problem.arrays;

public class FindMinAndMax {

    public static void main(String[] args) {
        int arr[] = {3, 2, 1,0, 56, 10000, 1000001, 167};
        Pair pair = findMinAndMax(arr);
        System.out.println(pair);
    }

    static Pair findMinAndMax(int arr[]) {
        int max = arr[0], min = arr[0], size = arr.length;

        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        Pair pair = new Pair(min, max);
        return pair;
    }

}

class Pair {
    long first, second;

    public Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString(){
        return first + " "+ second;
    }
}

