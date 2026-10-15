package LAB_1;

public class PersonDemo {
    public static void main(String[] args) {
        Person withAddress = new Person("Tendai", new Address("12 Samora Machel Ave", "Harare"));
        Person noAddress = new Person("Rudo", null);

        // chained dot expression: person > address > city
        System.out.println(withAddress.name + " lives in " + withAddress.address.city);

        // same chain, but address is null
        try {
            System.out.println(noAddress.name + " lives in " + noAddress.address.city);
        } catch (NullPointerException e) {
            System.out.println("Problem: " + e.getMessage());
        }

        // the safe way: check before going deeper
        if (noAddress.address != null) {
            System.out.println(noAddress.address.city);
        } else {
            System.out.println(noAddress.name + " has no address on record.");
        }
    }
}
