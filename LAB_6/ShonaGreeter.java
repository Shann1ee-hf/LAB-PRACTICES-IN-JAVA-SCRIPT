package LAB_6;
public interface ShonaGreeter {
    default void hello() {
        System.out.println("Mhoro from ShonaGreeter");
    }
}