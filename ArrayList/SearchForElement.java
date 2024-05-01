import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SearchForElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Red");
        colors.add("Grey");
        colors.add("White");
        boolean present=false;
        for(String s: colors){
            if("WHITE".equalsIgnoreCase(s)){
                present=true;
            }
        }
        System.out.println("Item Present: "+present);
        // colors.removeAll(Arrays.asList("Pink","Nude"));
        // System.out.println("Post clear "+colors);
        Collections.sort(colors);
        System.out.println("Sorted list: "+colors);

   }
}
