package LAB_5;

public class Payroll {

    static double totalPayroll(Employee[] staff) {
        double total = 0;
        for (Employee e : staff) {
            System.out.printf("%s (%s): %.2f%n",
                    e.name, e.getClass().getSimpleName(), e.monthlyPay());
            total += e.monthlyPay();
        }
        return total;
    }
}