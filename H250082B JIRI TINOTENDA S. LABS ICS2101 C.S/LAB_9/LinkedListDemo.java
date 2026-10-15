package LAB_9;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Tendai");
        names.add("Rudo");
        names.add("Farai");

        System.out.println("Size: " + names.size());
        for (String n : names) {        // works because the list is Iterable
            System.out.println(n);
        }

        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(10);
        nums.add(20);

        int total = 0;
        for (int n : nums) {
            total += n;
        }
        System.out.println("Sum of numbers: " + total);
    }
}
