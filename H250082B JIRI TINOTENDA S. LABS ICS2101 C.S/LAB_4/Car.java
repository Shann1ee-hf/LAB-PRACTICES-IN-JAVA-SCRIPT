package LAB_4;

public class Car extends Vehicle {
    int doors;

    Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
        System.out.println("2. Car constructor ran (doors = " + doors + ")");
    }
}