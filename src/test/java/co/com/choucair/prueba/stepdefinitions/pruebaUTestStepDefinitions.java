package co.com.choucair.prueba.stepdefinitions;

import co.com.choucair.prueba.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class pruebaUTestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Danilo wants develop a test$")
    public void thanDaniloWantsDevelopATest() {
        OnStage.theActorCalled("Danilo").wasAbleTo(OpenUp.thePage(), (Register.onThePage()));
    }
    @When("^He find the page to register in different steps$")
    public void heFindThePageToRegisterInDifferentSteps() {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterData.inThePage(), (EnterData2.inThePage2()),
                (EnterData3.inThePage3()));
    }

    @Then("^Will register and have practiced$")
    public void willRegisterAndHavePracticed() {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterData4.inThePage4());

    }

}
