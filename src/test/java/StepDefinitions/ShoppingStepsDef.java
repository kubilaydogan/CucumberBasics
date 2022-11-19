package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class ShoppingStepsDef {
    private int budget = 0;

    @Given("I have {int} in my wallet")
    public void i_have_in_my_wallet(Integer n) {
        budget = n;
    }

    @When("I buy milk/rice with {int}")
    public void i_buy_milk_with(Integer m) {
        budget -= m;
    }

    @Then("I should have {int} in my wallet")
    public void i_should_have_in_my_wallet(Integer k) {
        assertEquals(budget, (int) k);
    }
}
