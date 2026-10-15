package LAB_6;
public abstract class Account {
    String owner;
    double balance;

    Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // concrete: the same for every account type
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // abstract: each account type decides its own fee
    abstract double monthlyFee();
}
