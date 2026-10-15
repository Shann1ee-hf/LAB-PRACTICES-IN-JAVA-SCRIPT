package LAB_7;

import java.util.Scanner;

public class DivideDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Enter first integer: ");
            int a = Integer.parseInt(in.nextLine().trim());

            System.out.print("Enter second integer: ");
            int b = Integer.parseInt(in.nextLine().trim());

            int result = a / b;     // throws ArithmeticException if b is 0
            System.out.println(a + " / " + b + " = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: please type whole numbers only.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        in.close();
    }
}
