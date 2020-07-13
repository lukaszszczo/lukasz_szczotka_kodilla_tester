package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Teller teller = new Teller(cashSlot);

    public WalletSteps() {


        Given("I have deposited {int} in my wallet", (Integer deposit) -> {
            wallet.deposit(deposit);

        });

        When("I request {int}", (Integer withdraw) -> {

            teller.withdraw(wallet, withdraw);
        });

        Then("{int} should be dispensed", (Integer withdraw) -> {
            Assert.assertEquals(withdraw, cashSlot.getContents());
        });
        Then("the balance of my wallet should be {int}", (Integer balance) -> {
            Assert.assertEquals("Incorrect wallet balance", balance, wallet.getBalance());;
        });





    }
}