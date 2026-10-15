package LAB_3;

public class TemperatureDemo {
    public static void main(String[] args) {
        Temperature boil = new Temperature(373.15);
        System.out.printf("Boiling water: %.2f C = %.2f F%n",
                boil.getCelsius(), boil.getFahrenheit());

        Temperature freeze = Temperature.fromCelsius(0);
        System.out.printf("Freezing: %.2f C = %.2f F%n",
                freeze.getCelsius(), freeze.getFahrenheit());

        try {
            new Temperature(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        try {
            Temperature.fromCelsius(-300);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}
