package LAB_5;

public class FieldVsMethodDemo {
    public static void main(String[] args) {
        Parent p = new Child();     // Parent reference, Child object

        System.out.println("p.label (field): " + p.label);
        System.out.print("p.who() (method): ");
        p.who();

        System.out.println("((Child) p).label (field): " + ((Child) p).label);

        Child c = new Child();
        System.out.println("c.label (field): " + c.label);
        System.out.println("""
                Methods are selected at runtime based on the actual object, so `p.who()` runs the `Child` version. 
                Fields are selected at compile time based on the reference type, so `p.label` accesses `Parent`’s field. 
                A `Child` object has two separate `label` fields, and casting to `Child` accesses the child field. 
                Field hiding is discouraged; use private fields with methods instead.
                """);
    }
}