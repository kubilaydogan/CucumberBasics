package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator {

    private int sum;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        sum = 0;
    }

    @When("I add {int} and {int}")
    public void i_add_and(int n, int m) {
        sum = n + m;
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int total) {
        assertEquals(sum, total);
    }
}
