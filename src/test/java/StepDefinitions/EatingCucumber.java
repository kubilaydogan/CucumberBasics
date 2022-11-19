package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EatingCucumber {
    private int cucumbers;

    @Given("there are {int} cucumbers")
    public void there_are_cucumbers(Integer n) {
        cucumbers = n;
    }

    @When("I eat {int} cucumbers")
    public void i_eat_cucumbers(Integer m) {
        cucumbers -=m;
    }

    @Then("I should have {int} cucumbers")
    public void i_should_have_cucumbers(Integer kalan) {
        Assert.assertTrue(cucumbers==kalan);
    }
}
