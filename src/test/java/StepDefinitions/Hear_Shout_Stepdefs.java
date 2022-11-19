package StepDefinitions;

import Pages.Person;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class Hear_Shout_Stepdefs {

    private Person lucy;        // right click => refactor => introduce field
    private Person sean;
    private String messageFromSean;


    @Given("{person} is located/standing {int} meter/meters from {person}")
    public void person_is_metres_from_Sean(Person person, Integer distance, Person person2) {
        lucy = new Person();
        sean = new Person();
        lucy.moveTo(distance);
        System.out.println(String.format("Lucy is %d centimeters from Sean", distance * 100));
    }


    @When("Sean shouts {string}")       // we are capturing Sean's message using the {string} pattern
    public void seanShouts(String message) {
        sean.shout(message);
        messageFromSean = message;
    }


    @Then("Lucy should hear Sean’s message")
    public void lucyShouldHearSeanSMessage() {
        assertTrue(lucy.getMessagesHeard().contains(messageFromSean));
    }


}
