package LAB_5;
public class PaymentProcessorPoly {

    void pay(Payment p) {
        System.out.println(p.process());    // no type checks needed
    }
}