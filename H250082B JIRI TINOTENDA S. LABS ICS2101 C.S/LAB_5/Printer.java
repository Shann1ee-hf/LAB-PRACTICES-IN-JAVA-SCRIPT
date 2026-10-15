package LAB_5;
import java.util.Arrays;

public class Printer {

    // same method name, four different parameter types
    void print(int n) {
        System.out.println("int: " + n);
    }

    void print(double d) {
        System.out.println("double: " + d);
    }

    void print(String s) {
        System.out.println("String: " + s);
    }

    void print(int[] arr) {
        System.out.println("int array: " + Arrays.toString(arr));
    }
}