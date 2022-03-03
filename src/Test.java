import java.util.*;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> forestSpecies = new HashMap<>();

        forestSpecies.put("Amazon", 30000);
        forestSpecies.put("Congo", 10000);
        forestSpecies.put("Daintree", 15000);
        forestSpecies.put("Amazon", 40000);
        System.out.println(2/4);
        int a = 1;
        int b = 0;
        //int c = a/b;
        //System.out.print(c);

        int forestCount = forestSpecies.size();
        Money money = new Money();
        Money iMoney = new IMoney();
        System.out.println(money instanceof Money);
        System.out.println(iMoney instanceof Money);
        System.out.println(iMoney instanceof Object);

        Function<Integer,Integer> f = (x) -> x * x;
    }


    static class Money{

    }

    static class IMoney extends Money{

    }
}
