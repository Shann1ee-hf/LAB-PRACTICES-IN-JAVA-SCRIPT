package LAB_5;

public class Cow extends Animal {
    Cow(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says Moo");
    }
}