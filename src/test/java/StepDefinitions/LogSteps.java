package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogSteps {
    private static final Logger log = LoggerFactory.getLogger(LogSteps.class);

    @Given("^I login as (admin|manager|practitioner)$")
    public void loginToApp(String profile) {
        LoginPage.login(profile);
    }

    @When("I devide {int} to {int}")
    public void devide(int n1, int n2) {

        try{
            System.out.println(n1/n2);
        }catch(ArithmeticException e){
            log.error(String.format("Error occurred when doing the transaction: %s", e));
            log.error(String.format("Error occurred when doing the transaction: %s", e.getMessage()));
        }

    }
}
