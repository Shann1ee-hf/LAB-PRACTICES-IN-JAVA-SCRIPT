package LAB_5;

public abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    // every kind of employee works out its own monthly pay
    abstract double monthlyPay();
}