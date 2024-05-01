import java.util.*;
import java.util.Map.Entry;

public class SortHMByKeys {
    public static HashMap<String, Integer> sortByKeys(HashMap<String, Integer> map){
        List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (i1, i2)-> i1.getKey().compareTo(i2.getKey()));
       
        LinkedHashMap<String, Integer> temp = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry : entries){
            temp.put(entry.getKey(), entry.getValue());
        }
        return temp;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rachita", 111);
        map.put("Ananya", 0);
        map.put("Maya", 16);
        map.put("Manavi", 90);
        map.put("Zane", 99);
        map.put("Yeman", 95);
        map.put("Green", 905);

       HashMap<String, Integer> sortedByKeys = sortByKeys(map);
       
        for(Map.Entry<String, Integer> e: sortedByKeys.entrySet()){
            System.out.println("Key: "+e.getKey()+ " -- Value: "+e.getValue());
        }
    }

}
