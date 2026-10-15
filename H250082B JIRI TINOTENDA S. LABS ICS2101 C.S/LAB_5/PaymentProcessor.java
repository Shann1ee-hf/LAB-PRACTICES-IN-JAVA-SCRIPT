package LAB_5;
public class PaymentProcessor {

    void pay(Payment p) {
        if (p instanceof CardPayment c) {
            String last4 = c.cardNumber.substring(c.cardNumber.length() - 4);
            System.out.printf("Card: charging %.2f to card ending %s%n", c.amount, last4);
        } else if (p instanceof MobileMoneyPayment m) {
            System.out.printf("Mobile money: sending %.2f request to %s%n", m.amount, m.phone);
        } else {
            System.out.println("Unknown payment type, cannot process");
        }
    }
}