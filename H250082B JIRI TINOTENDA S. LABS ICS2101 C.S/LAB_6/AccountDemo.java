package LAB_6;
public class AccountDemo {
    public static void main(String[] args) {
        Account[] accounts = {
                new SavingsAccount("Tendai", 1000),
                new CurrentAccount("Rudo", 200),
                new SavingsAccount("Chipo", 100)
        };

        accounts[0].deposit(500);
        accounts[1].deposit(100);

        for (Account a : accounts) {
            System.out.printf("%s (%s) balance: %.2f, monthly fee: %.2f%n",
                    a.owner, a.getClass().getSimpleName(), a.balance, a.monthlyFee());
        }
    }
}