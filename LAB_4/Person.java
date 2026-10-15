package LAB_4;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // written once here, inherited by every subclass
    void display() {
        System.out.println("Name: " + name + " | Age: " + age);
    }
}
