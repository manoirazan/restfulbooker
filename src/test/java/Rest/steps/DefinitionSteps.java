package Rest.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import Rest.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @When("I click create a single Entry")
    public void whenICreateSingleEntry() {
        endUser.createSingleEntry();
    }

    @Given("I have logged into Hotel Management page")
    public void givenIhaveLoggedIn() {
        endUser.logoutIsPresent();
    }
    @When("I click create multiple Entry")
    public void whenICreateMultipleEntry() {
        endUser.createMultipleEntry();
    }

    @Then("I verify single entry data")
    public void thenVerifySingleEntryData() {
        endUser.verifySingleEntry();
    }

}
