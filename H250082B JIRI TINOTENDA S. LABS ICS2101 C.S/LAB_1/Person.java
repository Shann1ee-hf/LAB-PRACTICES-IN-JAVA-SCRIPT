package LAB_1;

public class Person {
    String name;
    Address address;   // a Person HAS an Address

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
