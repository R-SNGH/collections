import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHMByValue {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();
        Student rach = new Student("Rachita", 23);
        Student orion = new Student("Orion", 19);
        Student pri = new Student("Priyanka",31 );
        Student abel = new Student("Abel", 27);

        map.put(rach, 10);
        map.put(orion, 7);
        map.put(pri, 20);
        map.put(abel, 1);

        Map<Student, Integer> sortedByValue =
        map.entrySet().stream().sorted((i1,i2)->i1.getValue().compareTo(i2.getValue())).collect(
            Collectors.toMap(
                Map.Entry::getKey, 
                Map.Entry::getValue,
                (e1, e2) -> e1, LinkedHashMap::new)
        );

        for (Map.Entry<Student, Integer> en :
        sortedByValue.entrySet()) {
            System.out.println("Key = " + en.getKey()
                               + ", Value = "
                               + en.getValue());
        }
    }
}
