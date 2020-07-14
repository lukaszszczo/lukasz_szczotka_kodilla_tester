package wallet;

public class Teller {
    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public String notification() {
        return "I have insufficient funds in my account";
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount <= wallet.getBalance()) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        } else {
            notification();
        }
    }
}

