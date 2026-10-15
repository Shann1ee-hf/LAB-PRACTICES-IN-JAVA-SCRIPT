package LAB_3;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String owner;
    private double balance;
    private List<String> history = new ArrayList<>();

    BankAccount(String owner, double openingBalance) {
        this.owner = owner;
        this.balance = openingBalance;
        history.add(String.format("Opened account with %.2f", openingBalance));
    }

    void deposit(double amount) {
        if (amount <= 0) {
            history.add(String.format("Rejected deposit of %.2f", amount));
            return;
        }
        balance += amount;
        history.add(String.format("Deposited %.2f", amount));
    }

    void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            history.add(String.format("Rejected withdrawal of %.2f", amount));
            return;
        }
        balance -= amount;
        history.add(String.format("Withdrew %.2f", amount));
    }

    double getBalance() {
        return balance;
    }

    // gives back a copy that nobody can change
    List<String> getHistory() {
        return List.copyOf(history);
    }
}
