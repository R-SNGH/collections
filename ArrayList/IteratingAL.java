import java.util.ArrayList;

import java.util.Iterator;

public class IteratingAL {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Red");
        colors.add("Grey");
        colors.add("White");

        System.out.println(colors);
        //iterating
        System.out.println("Method 1:");
        Iterator<String> itr = colors.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("\nMethod 2:");
        for(String s: colors){
            System.out.println("item : "+s);
        }
        System.out.println("Method 3:");
        colors.forEach(System.out::println);
        System.out.println("Method 4:");
    }
}
