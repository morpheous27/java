package problem;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class CountCharNdPrintInSequence {

    public static void main(String[] args) {
        System.out.println(countAndPrint("helloWorld!!This is nitin Saxena"));
    }

    private static String countAndPrint(String input) {
        NavigableMap<Character, Integer> countMap = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (countMap.containsKey(input.charAt(i))) {
                countMap.put(input.charAt(i), countMap.get(input.charAt(i)) + 1);
            } else {
                countMap.put(input.charAt(i), 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            sb.append(entry.getKey()).append("-").append(entry.getValue()).append(" ");
        }
        return sb.toString();
    }
}
