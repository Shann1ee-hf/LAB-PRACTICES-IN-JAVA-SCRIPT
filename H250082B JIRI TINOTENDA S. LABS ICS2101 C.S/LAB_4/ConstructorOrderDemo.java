package LAB_4;

public class ConstructorOrderDemo {
    public static void main(String[] args) {
        System.out.println("Creating an ElectricCar...");
        ElectricCar ev = new ElectricCar("Nissan Leaf", 5, 40);

        System.out.println();
        System.out.println("Finished object: " + ev.brand + ", "
                + ev.doors + " doors, " + ev.batteryKwh + " kWh");
    }
}