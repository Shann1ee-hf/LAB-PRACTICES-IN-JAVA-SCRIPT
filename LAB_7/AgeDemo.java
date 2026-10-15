package LAB_7;

public class AgeDemo {

    // "throws" tells callers they must deal with this exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age " + age + " is outside the range 0 to 120");
        }
        System.out.println("Age " + age + " is valid");
    }

    public static void main(String[] args) {
        int[] ages = {25, 0, 120, -3, 150};

        for (int a : ages) {
            try {
                validateAge(a);
            } catch (InvalidAgeException e) {
                System.out.println("Rejected: " + e.getMessage());
            }
        }
    }
}