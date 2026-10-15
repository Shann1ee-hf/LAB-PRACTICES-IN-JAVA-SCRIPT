package LAB_6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Tendai", 72));
        list.add(new Student("Farai", 55));
        list.add(new Student("Chipo", 88));
        list.add(new Student("Rudo", 64));

        Collections.sort(list);                 // uses compareTo
        System.out.println("By name:  " + list);

        list.sort(Student.BY_MARKS);            // uses the Comparator
        System.out.println("By marks: " + list);
    }
}