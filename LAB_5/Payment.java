package LAB_5;
public abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    // Part B (refactor): each payment type describes how it is processed
    abstract String process();
}
