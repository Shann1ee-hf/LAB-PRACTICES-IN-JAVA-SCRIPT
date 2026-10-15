package LAB_2;

public class TemperatureDemo {
    public static void main(String[] args) {
        Temperature t1 = Temperature.fromCelsius(25);
        Temperature t2 = Temperature.fromFahrenheit(212);

        System.out.printf("t1: %.1f C = %.1f F%n", t1.getCelsius(), t1.getFahrenheit());
        System.out.printf("t2: %.1f C = %.1f F%n", t2.getCelsius(), t2.getFahrenheit());

        // Temperature t3 = new Temperature(30);   // error: constructor is private
    }
}