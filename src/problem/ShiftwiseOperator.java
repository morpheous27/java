package problem;

public class ShiftwiseOperator {

    public static void main(String[] args) {
        int a = 8;
        System.out.println(-52 >> 1);
        System.out.println(1 & 1);
        //System.out.println(toBinaryString(8));
        System.out.println(count("1001"));


    }

    private static String toBinaryString(int a){
        if(a == 1){
            return "1";
        }
        if(a == 0){
            return "";
        }
        return toBinaryString(a/2)+ a%2;
    }

    private static int count(String b){
        if(b.length() <=0 || b == ""){
            return 0;
        }
        if(b.length() == 1 && b.charAt(b.length()-1) == '1'){
            return 1;
        }
        if(b.length() == 1 && b.charAt(b.length()-1) == '0'){
            return 0;
        }


        if(b.charAt(b.length()-1) == '1'){
            return count(b.substring(0,b.length()-1)) + 1;
        }else{
            return count(b.substring(0,b.length()-1));
        }

    }


}
