package LAB_3;

public class TemperatureChange {
    private double celsius;     // internal unit CHANGED: Celsius instead of kelvin

    // the public side is exactly the same as before: it still takes kelvin
    TemperatureChange(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException(
                    String.format("Below absolute zero: %.2f K", kelvin));
        }
        this.celsius = kelvin - 273.15;     // converted once, here
    }

    static TemperatureChange fromCelsius(double c) {
        return new TemperatureChange(c + 273.15);
    }

    double getKelvin() {
        return celsius + 273.15;
    }

    double getCelsius() {
        return celsius;
    }

    double getFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {

        //Part 1: the same calls as TemperatureDemo
        System.out.println("--- Part 1: Same caller code, new internal unit ---");
        TemperatureChange boil = new TemperatureChange(373.15);
        System.out.printf("Boiling water: %.2f C = %.2f F%n",
                boil.getCelsius(), boil.getFahrenheit());

        TemperatureChange freeze = TemperatureChange.fromCelsius(0);
        System.out.printf("Freezing: %.2f C = %.2f F%n",
                freeze.getCelsius(), freeze.getFahrenheit());

        try {
            new TemperatureChange(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        try {
            TemperatureChange.fromCelsius(-300);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }

        // Part 2: old version (kelvin) vs new version (Celsius)
        System.out.println();
        System.out.println("--- Part 2: Kelvin version vs Celsius version ---");
        double[] tests = {0, 100, 273.15, 373.15, 500};

        for (double k : tests) {
            Temperature oldOne = new Temperature(k);            // stores kelvin
            TemperatureChange newOne = new TemperatureChange(k); // stores Celsius

            // compare with a tiny tolerance, because decimals can differ in the last digit
            boolean same =
                    Math.abs(oldOne.getKelvin() - newOne.getKelvin()) < 1e-9
                            && Math.abs(oldOne.getCelsius() - newOne.getCelsius()) < 1e-9
                            && Math.abs(oldOne.getFahrenheit() - newOne.getFahrenheit()) < 1e-9;

            System.out.println(k + " K -> same results? " + same);
        }
    }
}