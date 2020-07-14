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
            Assert.assertEquals("Incorrect wallet balance", balance, wallet.getBalance());
        });


        Given("my wallet has been credited with $100", () -> {
            wallet.deposit(100);
        });

        When("I withdraw $200", () -> {
            teller.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertTrue(wallet.getBalance() == 100);
        });

        Then("I should be told that I have insufficient funds in my account", () -> {
            Assert.assertEquals("I have insufficient funds in my account", teller.notification()); // to jest złe
        });

        Given("my account has been credited with $100", () -> {
            wallet.deposit(100);
        });

        When("I check my balance", () -> {
            wallet.getBalance();
        });

        Then("I should see that my balance is $100", () -> {
            Assert.assertTrue(wallet.getBalance() == 100);
        });



    }
}