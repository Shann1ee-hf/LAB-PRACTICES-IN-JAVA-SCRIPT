package LAB_3;

public class Temperature {
    private double kelvin;      // internal unit

    Temperature(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException(
                    String.format("Below absolute zero: %.2f K", kelvin));
        }
        this.kelvin = kelvin;
    }

    // lets callers start from Celsius, still checked by the constructor
    static Temperature fromCelsius(double c) {
        return new Temperature(c + 273.15);
    }

    double getKelvin() {
        return kelvin;
    }

    double getCelsius() {
        return kelvin - 273.15;
    }

    double getFahrenheit() {
        return getCelsius() * 9 / 5 + 32;
    }
}
