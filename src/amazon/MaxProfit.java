package amazon;

// "static void main" must be defined in a public class.
public class MaxProfit {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] a = new int[]{1, 5, 1, 3, 7, -3};

        int ans = max_profit(a,3);
        System.out.println(ans);
    }

    private static int max_profit(int[] a, int k){
        int n = a.length, max = Integer.MIN_VALUE;
        for(int i=0; i<=n/2-1; i++){
            int sum=0, j=i, e=0;
            while(e<k){
                int o = j+n/2;
                if(o >= a.length){
                    o= o % a.length;
                }
                sum += a[j] + a[o];
                j++;
                e++;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}
