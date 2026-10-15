package LAB_4;

public class PersonDemo {
    public static void main(String[] args) {

        //>Task 1<
        System.out.println("--- Task 1: Inherited display() ---");
        Person p = new Person("Tendai", 45);
        Student s = new Student("Rudo", 20, "Computer Science");

        p.display();
        s.display();            // display() is not in Student, it is inherited
        s.showCourse();

        //> Task 2<
        System.out.println();
        System.out.println("--- Task 2: Student and Teacher share Person ---");
        Teacher t = new Teacher("Farai", 38, "Mathematics");

        s.display();
        t.display();            // the same display() method again
        t.showSubject();

        System.out.println("Student is a Person? " + (s instanceof Person));
        System.out.println("Teacher is a Person? " + (t instanceof Person));
    }
}
