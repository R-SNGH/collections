import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.List;

public class SortHMByValues {
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> map){

        List<Map.Entry<String, Integer>> items =new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(items, new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> i1, Map.Entry<String, Integer> i2){
                return (i1.getValue().compareTo(i2.getValue()));
            }
        });

        // put data from sorted list to hashmap 
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> i : items) {
            temp.put(i.getKey(), i.getValue());
        }
        return temp;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rachita", 111);
        map.put("Ananya", 0);
        map.put("Maya", 16);
        map.put("Manavi", 90);

        HashMap<String, Integer> sortedByVals = sortByValue(map);
        for(Map.Entry<String, Integer> e: sortedByVals.entrySet()){
            System.out.println("Key: "+e.getKey()+ " -- Value: "+e.getValue());
        }
    }
}
