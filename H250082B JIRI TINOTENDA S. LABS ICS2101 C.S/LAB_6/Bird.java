package LAB_6;
public class Bird implements Flyable {
    String species;

    Bird(String species) {
        this.species = species;
    }

    @Override
    public void fly() {
        System.out.println(species + " flaps its wings and flies");
    }
}