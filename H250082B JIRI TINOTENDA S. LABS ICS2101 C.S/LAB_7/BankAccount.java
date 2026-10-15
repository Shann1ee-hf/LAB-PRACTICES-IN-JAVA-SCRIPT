package LAB_7;

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
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
        history.add(String.format("Deposited %.2f", amount));
    }

    // changed: throws an exception instead of quietly refusing
    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            history.add(String.format("Rejected withdrawal of %.2f", amount));
            throw new InsufficientFundsException(balance, amount);
        }
        balance -= amount;
        history.add(String.format("Withdrew %.2f", amount));
    }

    double getBalance() {
        return balance;
    }

    List<String> getHistory() {
        return List.copyOf(history);
    }
}