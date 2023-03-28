import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Collections {
    public static void main(String[] args) {
        String[] heroes = new String[2];
        heroes[0] = "mike";
        heroes[1] = "cool";

        List<String> planets = new ArrayList<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("bumi");
        planets.add("mars");

        System.out.println("daftar planet");

        for(int i = 0; i < planets.size(); i++) {
            System.out.println("index " + i + " = " + planets.get(i));
        }
        planets.remove("mars");

        System.out.println("daftar planet akhir: ");
        for(int i = 0; i < planets.size(); i++) {
            System.out.println("index " + i + " = " + planets.get(i));
        }

        Collection collection;
    }
}
