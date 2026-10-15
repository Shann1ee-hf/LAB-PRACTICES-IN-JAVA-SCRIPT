package LAB_3;

import java.util.List;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Rudo", 100);
        acc.deposit(50);
        acc.withdraw(30);
        acc.withdraw(500);      // more than the balance, so rejected

        List<String> h = acc.getHistory();
        System.out.println("Transaction history:");
        for (String line : h) {
            System.out.println("  " + line);
        }
        System.out.printf("Balance: %.2f%n", acc.getBalance());

        // try to tamper with the copy
        try {
            h.add("Deposited 1000000.00");
        } catch (UnsupportedOperationException e) {
            System.out.println("Blocked: the history copy cannot be changed");
        }
        System.out.println("Transactions recorded: " + acc.getHistory().size());
    }
}