package LAB_4;
import java.util.ArrayList;

// BadStack IS-A ArrayList, so it inherits every ArrayList method
public class BadStack extends ArrayList<String> {

    void push(String item) {
        add(item);
    }

    String pop() {
        return remove(size() - 1);
    }

    String peek() {
        return get(size() - 1);
    }
}