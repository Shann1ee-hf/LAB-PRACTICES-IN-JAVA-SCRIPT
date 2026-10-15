package LAB_5;

public class PaymentDemo {
    public static void main(String[] args) {
        Payment[] payments = {
                new CardPayment(45.50, "1234567812344321"),
                new MobileMoneyPayment(20.00, "0771234567"),
                new BankTransferPayment(150.00, "00123456")
        };

        System.out.println("--- Design 1: instanceof ---");
        PaymentProcessor first = new PaymentProcessor();
        for (Payment p : payments) {
            first.pay(p);
        }

        System.out.println();
        System.out.println("--- Design 2: polymorphic process() ---");
        PaymentProcessorPoly second = new PaymentProcessorPoly();
        for (Payment p : payments) {
            second.pay(p);
            System.out.println("""
                    Design 1 (instanceof): The processor checks each payment type with if/else if. 
                    Every new type means editing the processor, and a forgotten type fails at run time.
                    
                    Design 2 (process()): Each payment class processes itself, so a new type needs no change to the processor, 
                    and the compiler forces every subclass to implement it.
                    
                    Conclusion: Design 2 is the better choice here because we own the classes and processing is part of what a payment does. 
                    Design 1 is only worth using when you can’t change the classes, such as ones from a library.
                    """);
        }
    }
}
