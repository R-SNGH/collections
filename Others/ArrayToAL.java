import java.util.*;
import java.util.stream.Collectors;
public class ArrayToAL {
    public static void main(String[] args) {
        int a[]={34,65,7,2,111,79, 79, 80};
        Integer to[]=new Integer[6];
        
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        to =Arrays.stream(a).boxed().toArray(Integer[]::new);
        //list.forEach(System.out::println);
        int num = new Random().nextInt(20);
        System.out.println(num);
    }
}
