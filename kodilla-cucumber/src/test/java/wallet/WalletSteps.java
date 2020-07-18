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
            Assert.assertEquals("Incorrect wallet balance", balance, Integer.valueOf(wallet.getBalance()));
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

        Then("I should be told that {string}", (String n) -> {
            Assert.assertEquals(n, teller.display());
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

        Given("I have deposited 200$ in my wallet", () -> {
            wallet.deposit(200);
        });

        When("I requested 0$", () -> {
            teller.withdraw(wallet,0);
        });

        Then("the balance of my wallet should be exacly 200$", () -> {
            Assert.assertTrue(wallet.getBalance() == 200);
        });

        Then("I should be told that Wrong amount ", () -> {
            Assert.assertEquals("Wrong amount", teller.display());
        });


    }
}