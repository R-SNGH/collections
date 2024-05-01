import java.util.ArrayList;

public class UpdatingAL {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Red");
        colors.add("Grey");
        colors.add("White");
        System.out.println(colors.get(0));
        colors.add(0,"Magenta");
        System.out.println(colors.get(0));
        System.out.println(colors);
        colors.set(0, "Mango");
        System.out.println(colors);
        //remove 3rd element:
        colors.remove(2);
        System.out.println("List post removal of third element: "+colors);

    }
}
