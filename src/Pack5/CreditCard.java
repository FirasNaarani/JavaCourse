package Pack5;

import Pack5.Interfaces.Charge;

public class CreditCard  implements Charge {
    public void paymentConfirmation(){
        System.out.println("Payment Was Successful.");
    }
    @Override
    public void charge(int amountToCharge) {
        paymentConfirmation();
    }
}
