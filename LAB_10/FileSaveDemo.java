package LAB_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSaveDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Line " + i + ": ");
            lines.add(in.nextLine());
        }
        in.close();

        Path file = Path.of("notes.txt");

        try {
            Files.write(file, lines);                   // save
            System.out.println("Saved to " + file.toAbsolutePath());

            List<String> back = Files.readAllLines(file);   // read back
            System.out.println();
            System.out.println("Reading the file back:");
            int number = 1;
            for (String line : back) {
                System.out.println(number + ": " + line);
                number++;
            }
        } catch (IOException e) {
            System.out.println("File problem: " + e.getMessage());
        }
    }
}