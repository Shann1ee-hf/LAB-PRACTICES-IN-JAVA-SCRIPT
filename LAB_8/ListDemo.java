package LAB_8;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        int[] start = {12, 45, 7, 33, 21, 89, 4, 56, 18, 27};
        for (int n : start) {
            nums.add(n);
        }

        int sum = 0;
        int max = nums.get(0);      // assume the first is the biggest
        for (int n : nums) {
            sum += n;
            if (n > max) {
                max = n;
            }
        }

        System.out.println("List: " + nums);
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);

        // walk the list from the last index back to 0
        System.out.print("Reverse: [");
        for (int i = nums.size() - 1; i >= 0; i--) {
            System.out.print(nums.get(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}