public class InsufficientFundsException extends Exception {

    double amount;


    InsufficientFundsException(double amountOfShortFall) {
        super("You need more money!");
        amount = amountOfShortFall;
    }

    public double getAmount() {
        return amount;
    }
}
