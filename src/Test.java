import java.util.*;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        //String input = "aaabbdd";
        String input = "aaabbbcde";
        char[] ca = new char[26];
        char[] result = new char[input.length()];
        int max = 0;
        char maxFChar = 'a';

        for(char c : input.toCharArray()){
            ca[c-'a']++;
            if(max < ca[c-'a']){
                max = ca[c-'a'];
                maxFChar = c;
            }
        }
        for(int i=0;i<input.length() && ca[maxFChar-'a'] > 0;){
            result[i] = maxFChar;
            ca[maxFChar-'a']--;
            i = i+2;
        }

        //handle not possible

        int k=0;
        for(int i=1;i<input.length(); ){
            while(ca[k]==0){
                k++;
            }
            if(ca[k]!=0){
                result[i] = (char)(k + 'a');
                System.out.println(result[i]);
                ca[k]--;
            }
            i = i+2;
        }

        System.out.println(String.valueOf(result));


    }
}



