package amazon;

import java.util.*;
import java.util.stream.Collectors;

public class TopNCompetitors {
    public static void main(String[] args) {
        List<String> reviews = new ArrayList(
                Arrays.asList("newshop is providing good services in the city; everyone should use newshop",
                        "best services by newshop", "fashionbeats has great services in the city",
                        "I am proud to have fashionbeats", "mymarket has awesome services",
                        "Thanks Newshop for the quick delivery"));

        List<String> competitors = new ArrayList<String>(
                Arrays.asList("newshop", "shopnow", "afashion", "fashionbeats", "mymarket", "tcellular"));

        System.out.println(topNumCompetitors(6, 2, competitors, 6, reviews));
    }


    private static List<String> topNumCompetitors(int numCompetitors, int topNCompetitors, List<String> competitors,
                                   int numReviews, List<String> reviews){
        Map<String,Integer> countMap = new HashMap<>();
        reviews.stream().forEach(s -> populateMap(s.split(" "),countMap));
        List<Map.Entry<String,Integer>> sortedList = countMap.entrySet().stream().filter(e -> competitors.contains(e.getKey())).sorted(new CompareMapByValues().reversed()).collect(Collectors.toList());
        return Arrays.asList(sortedList.get(0).getKey(),sortedList.get(1).getKey());
    }

    private static void populateMap(String[] tokens,Map<String,Integer> map){
        for(int i=0;i<tokens.length;i++){
            Integer count = map.get(tokens[i]);
            if(count==null){
                map.put(tokens[i],1);
            }else{
                map.put(tokens[i],++count);
            }
        }
    }

    static class CompareMapByValues implements Comparator<Map.Entry<String,Integer>>{
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return o1.getValue().compareTo(o2.getValue());
        }
    }
}
