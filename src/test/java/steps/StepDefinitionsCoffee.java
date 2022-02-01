package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsCoffee {
    @Then("^I should be served a coffee$")
    public void iShouldBeServedACoffee(){
        System.out.println("I should  be served a coffee");
    }

    @Given("^there (\\d+) coffees left in machine$")
    public void thereCoffeesLeftInMachine(int arg0){
        System.out.println(String.format("there %d coffees left in machine", arg0));
    }

    @When("^I deposit a (\\d+) dollar$")
    public void iDepositeADolar(int arg0){
        System.out.println(String.format("I deposit a %d dollar", arg0));
    }

    @And("^I press the coffee button$")
    public void iPressTheCoffeeButton() throws Throwable {
        System.out.println("I press the coffee button");
    }
}



