package LAB_3;

public class StudentDemo {
    public static void main(String[] args) {

        // >Task 1<
        System.out.println("--- Task 1: Validation ---");
        Student s = new Student("Tendai", 78);
        System.out.println(s.getName() + " has " + s.getMarks() + " marks");

        boolean ok = s.setMarks(150);
        System.out.println("Set marks to 150 accepted? " + ok);
        ok = s.setMarks(-5);
        System.out.println("Set marks to -5 accepted? " + ok);
        System.out.println("Marks are still: " + s.getMarks());

        // > Task 2 <
        System.out.println();
        System.out.println("--- Task 2: Grades ---");
        int[] tests = {85, 70, 65, 55, 30};
        for (int m : tests) {
            s.setMarks(m);
            System.out.println(m + " -> " + s.getGrade());
        }
    }
}