import java.util.ArrayList;

public class Inserting {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Red");
        colors.add("Grey");
        colors.add("White");

        colors.addFirst("Black");
        System.out.println(colors.get(0));
    }
}
