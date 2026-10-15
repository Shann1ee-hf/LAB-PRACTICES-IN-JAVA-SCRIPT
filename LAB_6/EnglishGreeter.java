package LAB_6;
public interface EnglishGreeter {
    default void hello() {
        System.out.println("Hello from EnglishGreeter");
    }
}
