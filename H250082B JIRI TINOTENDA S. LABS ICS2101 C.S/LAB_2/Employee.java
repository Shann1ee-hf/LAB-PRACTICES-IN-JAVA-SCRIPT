package LAB_2;

public class Employee {
    private static int nextId = 1001;   // the next ID to hand out
    private static int total = 0;

    int employeeId;
    String name;
    String department;
    double salary;

    // constructor 1: name only
    Employee(String name) {
        this(name, "General", 500.0);
    }

    // constructor 2: name and department
    Employee(String name, String department) {
        this(name, department, 500.0);
    }

    // constructor 3: everything (the ID is given out here)
    Employee(String name, String department, double salary) {
        this.employeeId = nextId;
        nextId++;
        total++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // copy constructor: copies the details but gets its own new ID
    Employee(Employee other) {
        this(other.name, other.department, other.salary);
    }

    void display() {
        System.out.printf("ID: %d | Name: %s | Dept: %s | Salary: %.2f%n",
                employeeId, name, department, salary);
    }

    static int getTotal() {
        return total;
    }
}
