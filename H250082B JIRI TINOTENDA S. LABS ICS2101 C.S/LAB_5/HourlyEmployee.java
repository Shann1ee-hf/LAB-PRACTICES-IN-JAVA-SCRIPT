package LAB_5;

public class HourlyEmployee extends Employee {
    double rate;
    int hours;

    HourlyEmployee(String name, double rate, int hours) {
        super(name);
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    double monthlyPay() {
        return rate * hours;
    }
}
