package LAB_5;
public class BankTransferPayment extends Payment {
    String accountNo;

    BankTransferPayment(double amount, String accountNo) {
        super(amount);
        this.accountNo = accountNo;
    }

    @Override
    String process() {
        return String.format("Bank transfer: moving %.2f to account %s", amount, accountNo);
    }
}