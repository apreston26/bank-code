public class BankAccount {

    int accountNumber;
    double balance;

    BankAccount(int idNumber) {
        accountNumber = idNumber;

    }

    public void deposit(double amount) throws InsufficientFundsException {
        balance += amount;
        if (amount < 0) {
            throw new InsufficientFundsException(amount);
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        balance -= amount;
        if (amount < 0) {
            throw new InsufficientFundsException(amount);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
