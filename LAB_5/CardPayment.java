package LAB_5;
public class CardPayment extends Payment {
    String cardNumber;

    CardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    String process() {
        String last4 = cardNumber.substring(cardNumber.length() - 4);
        return String.format("Card: charging %.2f to card ending %s", amount, last4);
    }
}