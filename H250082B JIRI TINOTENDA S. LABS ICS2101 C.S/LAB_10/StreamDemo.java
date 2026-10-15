package LAB_10;

import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Tendai", 72),
                new Student("Farai", 55),
                new Student("Chipo", 88),
                new Student("Rudo", 80),
                new Student("Blessing", 91),
                new Student("Nyasha", 40)
        );

        double average = students.stream()
                .mapToInt(Student::marks)
                .average()
                .orElse(0);

        System.out.printf("Class average: %.2f%n", average);
        System.out.println("Above average, A to Z:");

        students.stream()
                .filter(s -> s.marks() > average)
                .map(Student::name)
                .sorted()
                .forEach(name -> System.out.println("  " + name));
    }
}