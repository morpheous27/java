package amazon;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

interface i1{
     public void print(int i);
}
interface i2{
    public void print(int i);
}
abstract  class a1{

}

abstract  class a2{

}
public class Test {
    static int print1(){
        System.out.println();
        return 0;
    }

    int print1(int d){
        System.out.println();
        return 0;
    }
    public static void main(String[] args) {
        String a = "string";
        String b = new String("string");
        String c = a;
        int vc;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b.equals(c));
        System.out.println(vc);

        String da = "2020-01-05";
        LocalDate d = new Local(da);
        LocalDate.parse(da).format();
    }
}
