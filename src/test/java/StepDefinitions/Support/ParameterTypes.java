package StepDefinitions.Support;

import Pages.Person;
import io.cucumber.java.ParameterType;

public class ParameterTypes {

    @ParameterType("Lucy|Sean")
    public Person person(String name) {
        return new Person(name);
    }
}



// We’re going to create a person method, which takes the name of a person
// as a string, and returns an instance of our Person class with that name.

/*
When you define your own custom parameter types, it allows you to
transform the text captured from the Gherkin into any object you
like before it’s passed into your step definition.

For example, let’s define our own {person} custom parameter type
that will convert the string Lucy into an instance of Person automatically.
But we have to define the {person} parameter type first.

Let’s create a new Java class called ParameterTypes in the support package

The name of a custom Parameter Type is defined by the name of the method that is decorated with the `@ParameterType` annotation.
@ParameterType("activated")
public Status state(String activationState) {
    return new Status(activationState);
}
==> {state}
*/