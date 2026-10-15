package LAB_8;
import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> items = new ArrayList<>();

    void push(T item) {
        items.add(item);
    }

    T pop() {
        if (items.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return items.remove(items.size() - 1);
    }

    T peek() {
        if (items.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return items.get(items.size() - 1);
    }

    boolean isEmpty() {
        return items.isEmpty();
    }
}