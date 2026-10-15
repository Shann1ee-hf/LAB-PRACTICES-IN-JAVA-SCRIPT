package LAB_8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type a paragraph and press Enter:");
        String text = in.nextLine().toLowerCase();
        in.close();

        // split on anything that is not a letter or an apostrophe
        String[] words = text.split("[^a-z']+");

        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            if (w.isEmpty()) {
                continue;
            }
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        // a HashMap has no order, so copy the entries into a list and sort that
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(freq.entrySet());
        entries.sort((a, b) -> {
            int byCount = Integer.compare(b.getValue(), a.getValue());   // high to low
            if (byCount != 0) {
                return byCount;
            }
            return a.getKey().compareTo(b.getKey());                     // tie: A to Z
        });

        System.out.println();
        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> e : entries) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}