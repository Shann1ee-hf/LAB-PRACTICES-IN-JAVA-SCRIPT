package LAB_2;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tendai");
        Employee e2 = new Employee("Rudo", "Finance");
        Employee e3 = new Employee("Farai", "IT", 1200.50);
        Employee e4 = new Employee(e3);   // copy of e3

        e1.display();
        e2.display();
        e3.display();
        e4.display();

        System.out.println("Total employees created: " + Employee.getTotal());
    }
}