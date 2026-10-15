package LAB_6;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // natural order: alphabetical by name
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    // extra order: by marks, lowest first
    static final Comparator<Student> BY_MARKS =
            (a, b) -> Integer.compare(a.marks, b.marks);

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}
