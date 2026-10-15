package LAB_5;
public class MobileMoneyPayment extends Payment {
    String phone;

    MobileMoneyPayment(double amount, String phone) {
        super(amount);
        this.phone = phone;
    }

    @Override
    String process() {
        return String.format("Mobile money: sending %.2f request to %s", amount, phone);
    }
}