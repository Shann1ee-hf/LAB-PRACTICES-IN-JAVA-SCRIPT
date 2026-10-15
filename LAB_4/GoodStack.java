package LAB_4;

import java.util.ArrayList;
import java.util.EmptyStackException;

// GoodStack HAS-A list, and only shows the methods a stack should have
public class GoodStack {
    private ArrayList<String> items = new ArrayList<>();

    void push(String item) {
        items.add(item);
    }

    String pop() {
        if (items.isEmpty()) {
            throw new EmptyStackException();
        }
        return items.remove(items.size() - 1);
    }

    String peek() {
        if (items.isEmpty()) {
            throw new EmptyStackException();
        }
        return items.get(items.size() - 1);
    }

    boolean isEmpty() {
        return items.isEmpty();
    }

    int size() {
        return items.size();
    }
}
