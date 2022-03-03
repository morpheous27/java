package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOnList {
    public static void main(String[] args) {
        Set<List<Integer>> set  = new HashSet<>();
        set.add(Arrays.asList(1,2,3));
        set.add(Arrays.asList(1,2,3));
        set.stream().forEach(System.out::println);

    }
}
