import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestAnagramsHash {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("eat","eat");
        map.put("ate","ate");

        map.keySet().stream().forEach(System.out::println);

        System.out.println("abc".hashCode());
        System.out.println("cba".hashCode());
        System.out.println("-"+"".substring(0,0));
        char[] c = "abc".toCharArray();
    }
}
