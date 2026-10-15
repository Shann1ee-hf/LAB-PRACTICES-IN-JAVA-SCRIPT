package LAB_8;

public class StackDemo {
    public static void main(String[] args) {

        // a stack of Integers
        Stack<Integer> numbers = new Stack<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        System.out.println("Peek: " + numbers.peek());
        System.out.println("Pop: " + numbers.pop());
        System.out.println("Pop: " + numbers.pop());
        System.out.println("Empty? " + numbers.isEmpty());
        System.out.println("Pop: " + numbers.pop());
        System.out.println("Empty? " + numbers.isEmpty());

        try {
            numbers.pop();
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // the same class, now holding Strings
        Stack<String> words = new Stack<>();
        words.push("first");
        words.push("second");
        System.out.println("Top word: " + words.peek());

        // numbers.push("hello");   // error: a Stack<Integer> only accepts Integer
    }
}