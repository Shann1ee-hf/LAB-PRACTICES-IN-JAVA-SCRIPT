package LAB_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ReportDemo {

    // A = 70+, B = 50 to 69, C = below 50
    static String band(int score) {
        if (score >= 70) {
            return "A";
        } else if (score >= 50) {
            return "B";
        }
        return "C";
    }

    public static void main(String[] args) {
        try {
            List<String> rows = Files.readAllLines(Path.of("learners.csv"));
            List<Learner> learners = new ArrayList<>();

            for (int i = 1; i < rows.size(); i++) {         // i = 1 skips the header
                String[] parts = rows.get(i).split(",");
                if (parts.length != 2) {
                    System.out.println("Skipping bad row: " + rows.get(i));
                    continue;
                }
                try {
                    learners.add(new Learner(parts[0].trim(), Integer.parseInt(parts[1].trim())));
                } catch (NumberFormatException e) {
                    System.out.println("Skipping row with bad score: " + rows.get(i));
                }
            }
            System.out.println("Loaded " + learners.size() + " learners");

            // TreeMap::new keeps the bands in order A, B, C
            Map<String, List<Learner>> bands = learners.stream()
                    .collect(Collectors.groupingBy(
                            l -> band(l.score()),
                            TreeMap::new,
                            Collectors.toList()));

            for (Map.Entry<String, List<Learner>> entry : bands.entrySet()) {
                String letter = entry.getKey();
                List<String> report = new ArrayList<>();
                report.add("Grade band " + letter);
                for (Learner l : entry.getValue()) {
                    report.add(l.name() + " - " + l.score());
                }
                report.add("Total: " + entry.getValue().size());

                String fileName = "report_" + letter + ".txt";
                Files.write(Path.of(fileName), report);
                System.out.println("Band " + letter + ": " + entry.getValue().size()
                        + " learners -> " + fileName + " written");
            }
        } catch (IOException e) {
            System.out.println("File problem: " + e.getMessage());
        }
    }
}