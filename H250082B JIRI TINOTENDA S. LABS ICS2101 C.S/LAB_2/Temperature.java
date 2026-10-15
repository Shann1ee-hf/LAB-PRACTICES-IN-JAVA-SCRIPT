package LAB_2;
public class Temperature {
    private double celsius;   // always stored in Celsius

    // private, so nobody outside can call new Temperature(...)
    private Temperature(double celsius) {
        this.celsius = celsius;
    }

    static Temperature fromCelsius(double c) {
        return new Temperature(c);
    }

    static Temperature fromFahrenheit(double f) {
        double c = (f - 32) * 5 / 9;
        return new Temperature(c);
    }

    double getCelsius() {
        return celsius;
    }

    double getFahrenheit() {
        return celsius * 9 / 5 + 32;
    }
}