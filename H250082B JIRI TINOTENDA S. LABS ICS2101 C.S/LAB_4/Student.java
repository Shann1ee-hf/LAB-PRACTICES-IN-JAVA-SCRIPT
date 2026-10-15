package LAB_4;

// ---- Task 1: Student extends Person and adds course ----
public class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);       // hands name and age up to Person
        this.course = course;
    }

    void showCourse() {
        System.out.println(name + " studies " + course);
    }
}