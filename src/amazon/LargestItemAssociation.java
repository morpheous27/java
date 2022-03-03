package amazon;

import java.util.*;
import java.util.stream.Collectors;

public class LargestItemAssociation {
    int groupNo=1;
    public static void main(String[] args) {
        List<PairString> itemAssociation = Arrays.asList(new PairString("Item6","Item2"),new PairString("Item1","Item2"),new PairString("Item3","Item4"),new PairString("Item4","Item5"));
        LargestItemAssociation obj = new LargestItemAssociation();
        obj.LargestItemAssociation(itemAssociation).stream().forEach(System.out::println);
    }
    private List<String> LargestItemAssociation(List<PairString> itemAssociation)
    {
        Map<String,Integer> map = new HashMap<>();
        itemAssociation.stream().forEach(e -> populateMap(map,e));
        Map<Integer,List<String>> reverseMap = new HashMap<>();
        reverseMap(reverseMap,map);
        return reverseMap.entrySet().stream().sorted(new GroupComparator()).collect(Collectors.toList()).get(0).getValue();
    }

    private void populateMap(Map<String,Integer> map,PairString pairString){
        Integer group = map.get(pairString.first);
        Integer group2 = map.get(pairString.second);
        if(group == null && group2 == null){
            groupNo = groupNo+1;
            map.put(pairString.first,groupNo);
            map.put(pairString.second,groupNo);
        }else if(group == null) {
            map.put(pairString.first,group2);
        }else{
            map.put(pairString.second,group);
        }
    }

    private void reverseMap(Map<Integer,List<String>> reverseMap,Map<String,Integer> map){
        for(Map.Entry<String,Integer> e:map.entrySet()){
            List<String> l = reverseMap.get(e.getValue());
            if(l==null) {
                List<String> list = new ArrayList<>();
                list.add(e.getKey());
                reverseMap.put(e.getValue(),list);
            }else {
                l.add(e.getKey());
                reverseMap.put(e.getValue(),l);
            }
        }
    }

}

class GroupComparator implements Comparator<Map.Entry<Integer,List<String>>> {

    @Override
    public int compare(Map.Entry<Integer, List<String>> o1, Map.Entry<Integer, List<String>> o2) {
        List<String> l1 = o1.getValue();
        List<String> l2 = o2.getValue();
        if(l1.size() == l2.size()){
            Collections.sort(l1);
            Collections.sort(l2);
            for(int i=0;i<l2.size();i++){
                int result = l1.get(i).compareTo(l2.get(i));
                if( result==0){
                    continue;
                }else{
                    return result;
                }
            }
        }
        return l1.size() - l2.size();
    }
}

class PairString
{
    String first;
    String second;

    PairString(String first, String second)
    {
        this.first = first;
        this.second = second;
    }
}
