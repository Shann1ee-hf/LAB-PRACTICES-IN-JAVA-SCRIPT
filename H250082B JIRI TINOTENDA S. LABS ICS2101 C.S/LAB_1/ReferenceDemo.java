package LAB_1;

public class ReferenceDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 6);
        System.out.println("r1.width at the start: " + r1.width);

        Rectangle r2 = r1;      // r2 now points to the SAME object as r1
        r2.width = 10;          // change made through r2

        System.out.println("r1.width after changing r2.width: " + r1.width);
        System.out.println("Are r1 and r2 the same object? " + (r1 == r2));

        // for comparison: a real copy is a brand new object
        Rectangle r3 = new Rectangle(r1.width, r1.height);
        r3.width = 99;
        System.out.println("r1.width after changing the real copy r3: " + r1.width);
        System.out.println("""
                            Rectangle is a class, so r1 doesn’t hold the rectangle itself. It holds a reference (a kind of address) to an object on the heap.
                            The line Rectangle r2 = r1; copies that address, not the object, so only one Rectangle exists and both variables point to it.
                            When r2.width is set to 10, the shared object changes, so r1.width also reads 10.0. The == check returned true because both variables refer to the same object.
                            r3 was created with new, so it is a separate object and changing it did not affect r1. This differs from primitive types like int, where b = a copies the actual value.
                             """);
    }
}
