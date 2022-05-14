package Strings;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    static List<String> res = new ArrayList<>();
    public static void main(String[] args) {
        String in = "ABC";
        helper(in,new StringBuilder(),new int[in.length()]);
        System.out.println(res);
    }

    private static void helper(String s, StringBuilder sb,int[] v){
        if(sb.length()==s.length()){
            res.add(sb.toString());
            return;
        }
        for(int i=0;i<s.length();i++){
            if(v[i] == 1){
                continue;
            }
            sb.append(s.charAt(i));
            v[i] = 1;
            helper(s,sb,v);
            v[i] = 0;
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
