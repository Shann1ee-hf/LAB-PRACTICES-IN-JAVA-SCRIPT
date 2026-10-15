package LAB_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileStats {
    public static void main(String[] args) {
        Path file = Path.of("sample.txt");

        try {
            List<String> lines = Files.readAllLines(file);

            int words = 0;
            int chars = 0;
            for (String line : lines) {
                chars += line.length();
                String trimmed = line.trim();
                if (!trimmed.isEmpty()) {
                    words += trimmed.split("\\s+").length;  // split on any spaces
                }
            }

            System.out.println("File: " + file);
            System.out.println("Lines: " + lines.size());
            System.out.println("Words: " + words);
            System.out.println("Characters (without line breaks): " + chars);
        } catch (IOException e) {
            System.out.println("Could not read the file: " + e.getMessage());
        }
    }
}