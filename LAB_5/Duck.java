package LAB_5;

public class Duck extends Animal {
    Duck(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says Quack");
    }
}