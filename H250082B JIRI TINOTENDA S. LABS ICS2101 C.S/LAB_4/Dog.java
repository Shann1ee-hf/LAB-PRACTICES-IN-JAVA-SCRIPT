package LAB_4;

public class Dog extends Animal {

    // the fix: call the Animal constructor ourselves and pass the name up
    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " says Woof");
    }
}