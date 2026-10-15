package LAB_9;

public class LevelDemo {

    static void advice(Level level) {
        switch (level) {
            case LOW -> System.out.println("LOW: all is calm, keep going as normal.");
            case MEDIUM -> System.out.println("MEDIUM: stay alert and check things regularly.");
            case HIGH -> System.out.println("HIGH: act now and fix the problem first.");
        }
    }

    public static void main(String[] args) {
        for (Level l : Level.values()) {
            advice(l);
        }
    }
}