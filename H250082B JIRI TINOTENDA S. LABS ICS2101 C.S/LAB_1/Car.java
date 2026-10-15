
package LAB_1;

import java.time.LocalDate;

public class Car {
    String brand;
    int year;
    int mileage;

    Car(String brand, int year, int mileage) {
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    void display() {
        System.out.println("Brand: " + brand + " | Year: " + year + " | Mileage: " + mileage + " km");
    }

    // a car counts as antique only if it is MORE than 25 years old
    boolean isAntique() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;
        return age > 25;
    }
}