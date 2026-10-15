package LAB_9;
public class RecordDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Tendai", 20);
        Student s2 = new Student("Tendai", 20);
        Student s3 = new Student("Rudo", 22);

        System.out.println("Print: " + s1);
        System.out.println("Name component: " + s1.name());
        System.out.println("Age component: " + s1.age());

        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
    }
}