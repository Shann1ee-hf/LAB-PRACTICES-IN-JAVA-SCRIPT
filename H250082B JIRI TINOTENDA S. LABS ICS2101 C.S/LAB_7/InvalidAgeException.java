package LAB_7;

// extends Exception (not RuntimeException), so it is a CHECKED exception
public class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
