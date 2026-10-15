package LAB_5;

public class Intern extends Employee {
    double stipend;

    Intern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    @Override
    double monthlyPay() {
        return stipend;
    }
}