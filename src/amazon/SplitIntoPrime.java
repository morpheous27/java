package amazon;

import java.util.ArrayList;
import java.util.List;

// "static void main" must be defined in a public class.
public class SplitIntoPrime {

    private List<List<String>> res = new ArrayList<>();

    public static void main(String[] args) {
        new SplitIntoPrime().splitIntoPrime();
    }

    private void splitIntoPrime(){
        String s = "31175";
        helper(0,s,new ArrayList<>());
        System.out.println(res.size());
    }

    private void helper(int start,String s,List<String> temp){
        if(start==s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start; i<s.length(); i++){
            String str = s.substring(start,i+1);
            if(isPrime(Integer.parseInt(str))){
                temp.add(str);
                helper(i+1,s,temp);
            }
        }
    }

    private boolean isPrime(int i){
        if(i==1)
            return false;
        for(int j=2; j<i/2; j++){
            if(i%j == 0){
                return false;
            }
        }
        return true;
    }


}
