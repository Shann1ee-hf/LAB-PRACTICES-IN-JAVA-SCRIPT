package LAB_8;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tendai");
        names.add("Rudo");
        names.add("Farai");
        names.add("Tendai");
        names.add("Chipo");
        names.add("Rudo");
        names.add("Farai");
        names.add("Tendai");

        System.out.println("Original (" + names.size() + "): " + names);

        // a Set refuses duplicates; LinkedHashSet keeps the first-seen order
        Set<String> unique = new LinkedHashSet<>(names);
        System.out.println("Unique, original order (" + unique.size() + "): " + unique);

        // TreeSet also removes duplicates and sorts alphabetically
        Set<String> sorted = new TreeSet<>(names);
        System.out.println("Unique, sorted (" + sorted.size() + "): " + sorted);
    }
}