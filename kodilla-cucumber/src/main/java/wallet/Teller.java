package wallet;

public class Teller {
    private static final String OK_NOTIFICATION = "Success!!!";
    private static final String ERROR_NOTIFICATION = "I have insufficient funds in my account";
    private CashSlot cashSlot;
    private String notification;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public String display() {
        return notification;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount <= wallet.getBalance()) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
            notification = OK_NOTIFICATION;
        } else {
            notification = ERROR_NOTIFICATION;
        }
    }
}

