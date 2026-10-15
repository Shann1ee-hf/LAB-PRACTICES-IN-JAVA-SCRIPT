package LAB_10;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // new ArrayList<>(...) makes a list that can be changed
        List<Integer> nums = new ArrayList<>(List.of(3, 8, 12, 7, 20, 5, 6, 9));
        System.out.println("Before: " + nums);

        Predicate<Integer> isEven = n -> n % 2 == 0;

        nums.removeIf(isEven);      // removes every element the predicate accepts
        System.out.println("After removing even numbers: " + nums);
    }
}
