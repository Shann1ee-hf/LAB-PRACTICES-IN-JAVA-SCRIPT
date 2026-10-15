package LAB_5;
public class PayrollDemo {
    public static void main(String[] args) {
        Employee[] staff = {
                new SalariedEmployee("Tendai", 1500),
                new HourlyEmployee("Rudo", 8.5, 160),
                new Intern("Farai", 300),
                new SalariedEmployee("Chipo", 2200)
        };

        double total = Payroll.totalPayroll(staff);
        System.out.printf("Total payroll: %.2f%n", total);
    }
}
