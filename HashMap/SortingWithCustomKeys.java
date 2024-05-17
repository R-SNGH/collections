import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortingWithCustomKeys {
    public static void main(String[] args) {
        HashMap<Student, Integer> students = new HashMap<>();
        students.put(new Student("Rachita", 25), 1);
        students.put(new Student("Zane", 21), 101);
        students.put(new Student("Meera", 88), 5);

        students.entrySet().stream()
                            .sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName)))
                            .forEach(System.out::println);

        students.entrySet().stream()
                            .sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getAge)))
                            .forEach(System.out::println);
        
        students.entrySet().stream()
                            .sorted(Map.Entry.comparingByValue())
                            .forEach(System.out::println);
        //collecting in another Map: 
        //Map<Employee, Integer> result=map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getAge).reversed())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        //result.entrySet().stream().forEach(System.out::println);

        //collecting in a new Linked HM: 
        //The part (x, y) -> y is because of mergeFunction when find duplicate keys, it returns value of second key which found. 
        //the forth part is mapFactory which a supplier providing a new empty Map into which the results will be inserted.
        Map<Student, Integer> sortedByAgeReversed=map.entrySet().stream()
                                                             .sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getAge).reversed()))
                                                             .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> y, LinkedHashMap::new));
        sortedByAgeReversed.entrySet().forEach(System.out::println);

        //sorting by VALUES in Reverse Order; storing result in a Linked HashMap to preserve order:
        Map<Student, Integer> sortedByValuesResult= map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x,y)->y, LinkedHashMap::new));
        System.out.println(sortedByValuesResult);

    }
}
