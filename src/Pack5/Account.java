package Pack5;

import Pack5.Interfaces.Charge;

public class Account implements Charge {
   private int balance;

    public void showBalance() {
        System.out.println("The Balance Is: " + balance);
    }
    public void addToBalance(int deposit){
        balance = balance + deposit;
    }
    public void takeFromBalance(int withdraw){
        balance = balance - withdraw;
    }

    @Override
    public void charge(int amountToCharge) {
        takeFromBalance(amountToCharge);
    }
}
