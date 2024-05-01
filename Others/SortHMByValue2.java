import java.util.HashMap;
import java.util.Map;

public class SortHMByValue2 {
    public static HashMap<String, Integer> sortMapByValue(HashMap<String, Integer> map){
        
        return map;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rachita", 10);
        map.put("Emma", 0);
        map.put("Abel", 101);
        map.put("Fana", 50);
        map.put("Tigor", 11);

        HashMap<String, Integer> sortedmap = sortMapByValue(map);
        for(Map.Entry<String, Integer> item : sortedmap.entrySet()){
            System.out.println("key: "+ item.getKey()+ " ; "+ "value: "+ item.getValue());
        }
    }
}
