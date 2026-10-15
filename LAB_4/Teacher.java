package LAB_4;

// ---- Task 2: a second subclass that reuses the same Person code ----
public class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void showSubject() {
        System.out.println(name + " teaches " + subject);
    }
}