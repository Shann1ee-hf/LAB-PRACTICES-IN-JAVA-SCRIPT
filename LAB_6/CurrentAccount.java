package LAB_6;
public class CurrentAccount extends Account {
    CurrentAccount(String owner, double balance) {
        super(owner, balance);
    }

    @Override
    double monthlyFee() {
        return 15;
    }
}