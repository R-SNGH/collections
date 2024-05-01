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

    }
}
