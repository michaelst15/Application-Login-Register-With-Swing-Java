import java.util.*;
public class Project3 {
    public static void main(String[] args) {
        Set<String> planets = new HashSet<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("bumi");
        planets.add("mars");

        System.out.println("list planet awal : ");
        for(String name : planets) {
            System.out.println("index " + name);
        }

        planets.remove("mars");

        for(Iterator iterator = planets.iterator(); iterator.hasNext();) {
            System.out.println("index " + iterator.hasNext());
        }
    }
}
