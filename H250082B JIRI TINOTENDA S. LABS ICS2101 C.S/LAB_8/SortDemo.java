package LAB_8;
import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 9, 1, 7};
        String[] fruits = {"mango", "apple", "cherry", "banana"};

        System.out.println("Integers before: " + Arrays.toString(numbers));
        SortUtil.bubbleSort(numbers);
        System.out.println("Integers after:  " + Arrays.toString(numbers));

        System.out.println();
        System.out.println("Strings before: " + Arrays.toString(fruits));
        SortUtil.bubbleSort(fruits);
        System.out.println("Strings after:  " + Arrays.toString(fruits));

        // int[] plain = {5, 2, 9};
        // SortUtil.bubbleSort(plain);     // error: does not compile
        System.out.println("""
                Why int[] will not work:
                A generic type parameter such as T can only stand for a reference type (a class), never a primitive. int is a primitive, so T can’t be int.
                An int[] is not a T[] for any T. An Integer[] is an array of objects, but an int[] is an array of raw values, so the compiler can’t match them. If you uncomment the last two lines of SortDemo, IntelliJ shows an error that bubbleSort can’t be applied to int[].
                int also has no compareTo method, and the bound T extends Comparable<T> needs one. Integer does have it, because it is the object version of int.
                Use Integer[] instead. If you must keep an int[], you can sort it with Arrays.sort(plain), or write a separate non-generic bubbleSort(int[] arr) method.
                """);
    }
}