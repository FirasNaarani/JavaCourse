package Pack1;

public class Bank {
    private final String customerName;
    private final int accountNumber;
    private int accountBalance = 0;
    public Bank(String customerName, int accountNumber) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }
    public void deposit(int newDeposit){
        accountBalance = accountBalance + newDeposit;
    }
    public void withdraw (int toWithdraw){
        accountBalance = accountBalance - toWithdraw;
    }
    public int getBalance(){
        return accountBalance;
    }
}
