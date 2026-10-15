package LAB_3;

import java.util.ArrayList;
import java.util.List;

public class ImmutableDemo {
    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("chess");
        hobbies.add("football");

        ImmutablePerson p = new ImmutablePerson("Tendai", 20, hobbies);
        hobbies.add("swimming");        // changing the original list afterwards

        System.out.println("Person: " + p);

        ImmutablePerson older = p.withAge(21);
        System.out.println("Older version: " + older);
        System.out.println("Original is unchanged: " + p);

        try {
            p.getHobbies().add("cooking");
        } catch (UnsupportedOperationException e) {
            System.out.println("Blocked: hobbies cannot be changed");
        }
    }
}