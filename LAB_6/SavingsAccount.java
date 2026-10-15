package LAB_6;
public class SavingsAccount extends Account {
    SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }

    // no fee when the balance is 500 or more, otherwise 5
    @Override
    double monthlyFee() {
        return balance >= 500 ? 0 : 5;
    }
}