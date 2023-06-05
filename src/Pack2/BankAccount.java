package Pack2;

public class BankAccount {
    String accountNumber;
    double balance = 0;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance)
        {
            throw new InsufficientFundsException("Insufficient funds! Cannot withdraw more than the available balance.");
        }
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }
}
