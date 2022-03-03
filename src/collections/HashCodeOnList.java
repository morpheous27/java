package collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class HashCodeOnList {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.add(2);

        l2.add(3);
        l2.add(1);
        l1.add(1);
        if(l1.hashCode() == l2.hashCode()){
            System.out.println("True");
        }else
        System.out.println(false);




    }
}
