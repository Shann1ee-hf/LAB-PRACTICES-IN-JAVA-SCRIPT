package LAB_7;
public class InsufficientFundsException extends Exception {
    private final double shortfall;

    InsufficientFundsException(double balance, double requested) {
        super(String.format("Insufficient funds: balance %.2f, requested %.2f",
                balance, requested));
        this.shortfall = requested - balance;
    }

    double getShortfall() {
        return shortfall;
    }
}
