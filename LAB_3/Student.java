package LAB_3;

public class Student {
    private String name;
    private int marks;

    Student(String name, int marks) {
        this.name = name;
        setMarks(marks);        // reuse the setter so the check also applies here
    }

    String getName() {
        return name;
    }

    int getMarks() {
        return marks;
    }

    // ---- Task 1: setter that rejects marks outside 0 to 100 ----
    boolean setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            return false;       // rejected, the old value is kept
        }
        this.marks = marks;
        return true;
    }

    // ---- Task 2: grade worked out from marks, not stored in a field ----
    String getGrade() {
        if (marks >= 70) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}
