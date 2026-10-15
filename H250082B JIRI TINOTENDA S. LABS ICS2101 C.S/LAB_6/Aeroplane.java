package LAB_6;
public class Aeroplane implements Flyable {
    String model;

    Aeroplane(String model) {
        this.model = model;
    }

    @Override
    public void fly() {
        System.out.println(model + " takes off using jet engines");
    }
}