package LAB_4;

public class ElectricCar extends Car {
    int batteryKwh;

    ElectricCar(String brand, int doors, int batteryKwh) {
        super(brand, doors);
        this.batteryKwh = batteryKwh;
        System.out.println("3. ElectricCar constructor ran (battery = " + batteryKwh + " kWh)");
    }
}