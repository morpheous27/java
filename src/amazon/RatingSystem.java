package amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RatingSystem {
    public static void main(String[] aArgs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            int n =Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String[] inputLine = br.readLine().trim().split(" ");
            for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(inputLine[i]);
            }
            int res = solve(a);
            System.out.println(res);
        }


    }


    private static int solve(int[] r){
        int n=r.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            solve(res,new ArrayList<>(), r,i,Integer.MAX_VALUE);
        }
        return res.size();
    }
    private static void solve(List<List<Integer>> res,List<Integer> list,int[] r, int idx, int p){
        if(idx >= r.length || r[idx]>p){
            return;
        }
        if(r[idx]<p){
            list.add(r[idx]);
            res.add(new ArrayList<>(list));
        }
        solve(res,list,r,idx+1,r[idx]);
    }
}
