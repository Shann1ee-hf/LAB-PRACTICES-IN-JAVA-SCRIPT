package LAB_5;

public class Child extends Parent {
    String label = "Child field";       // hides the Parent field, does not replace it

    @Override
    void who() {
        System.out.println("Child method");
    }
}
