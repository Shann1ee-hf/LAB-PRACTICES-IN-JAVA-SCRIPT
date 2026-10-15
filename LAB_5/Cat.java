package LAB_5;

public class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says Meow");
    }
}