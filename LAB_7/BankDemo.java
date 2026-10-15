package LAB_7;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Rudo", 100);

        try {
            acc.deposit(50);
            acc.withdraw(30);
            acc.withdraw(500);      // too much, so it throws
            System.out.println("This line is never reached");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
            System.out.printf("Short by: %.2f%n", e.getShortfall());
        }

        System.out.printf("Balance: %.2f%n", acc.getBalance());
        System.out.println("History:");
        for (String line : acc.getHistory()) {
            System.out.println("  " + line);

        }
        System.out.println("""
                    Advantages
                    
                    A checked exception cannot be ignored — the caller must handle it, unlike a false return value.
                    
                    It carries more information, such as an error message and the shortfall amount.
                    
                    The normal success code stays clean because it is not filled with repeated if (!ok) checks.
                    
                    Disadvantages
                    
                    It requires more code, since callers need try/catch or throws, plus an extra exception class.
                    
                    Exceptions are slower than a simple return value and are best for unusual cases; if withdrawals often fail, returning a value may be better.
                    
                    """);
    }
}