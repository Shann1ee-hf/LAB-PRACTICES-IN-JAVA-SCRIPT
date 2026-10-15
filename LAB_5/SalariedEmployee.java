package LAB_5;

public class SalariedEmployee extends Employee {
    double salary;

    SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    double monthlyPay() {
        return salary;
    }
}