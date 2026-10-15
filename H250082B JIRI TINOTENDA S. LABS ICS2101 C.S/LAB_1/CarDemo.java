package LAB_1;

public class CarDemo {
    public static void main(String[] args) {
        Car first = new Car("Toyota Corolla", 2018, 84500);
        Car second = new Car("Peugeot 404", 1972, 212300);
        Car third = new Car("Honda Fit", 2003, 156800);

        Car[] garage = {first, second, third};

        for (Car c : garage) {
            c.display();
            System.out.println("Antique? " + c.isAntique());
            System.out.println();
        }
    }
}

