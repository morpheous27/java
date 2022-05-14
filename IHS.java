/**
 * rearrange
 * aaabb
 *
 * ababa
 */
public class IHS {
    public static void main(String[] args) {
        String input = "aaabb";
        char[] ca = new char[26];
        char[] result = new char[input.length()];
        int max = 0;
        char maxFChar = '';
        for(char c : input.toCharArray()){
            ca[c-'a']++;
            if(max < ca[c-'a']){
                max = ca[c-'a'];
                maxFChar = c;
            }
        }
        for(int i=0;i<input.length(); i=+2){
            result[i] = maxFChar;
        }

        int k=0;
        for(int i=1;i<input.length(); i=+2){
            if(ca[k]!=0 && (ca[k] + 'a') != maxFChar)
                result[i] = ca[k] + 'a';
            ca[k]--;
        }

        System.out.println(String.valueOf(result));


    }
}
