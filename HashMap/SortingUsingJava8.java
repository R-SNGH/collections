import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

//https://www.youtube.com/watch?v=aiWP9OaMT-c&ab_channel=JavaTechie
public class SortingUsingJava8 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rachita", 111);
        map.put("Ananya", 0);
        map.put("Hussein", 16);
        map.put("Manavi", 90);
        map.put("Zane", 99);
        map.put("Yeman", 95);
        map.put("Green", 905);

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
