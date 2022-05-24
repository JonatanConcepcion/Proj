package stepdefinitions;

import model.DataStartSharp;
import questions.Answer;
import tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StartSharpBusinessUnitAndMeetingSteps {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }


    @Given("^than Jonatan wants to create an Business Units and then create a meeting$")
    public void thanJamesWantsToCreateAnBusinessUnitsAndThenCreateABussni() {
        theActorCalled("Jonatan").wasAbleTo(OpenUp.thePage());
    }

    @Given("^he go to login with his credentials$")
    public void heGoToLoginWithHisCredentials(List<DataStartSharp> data) {
        theActorInTheSpotlight().attemptsTo(Login.onThePageWith(data));
    }


    @Given("^he go to the section (.*)$")
    public void heGoToTheSectionBusinessUnits(String businessunit) {
        theActorInTheSpotlight().attemptsTo(GoSection.aboutOf(businessunit));
    }

    @When("^he is on the Star Sharp platform he will create a new Unit  filling all fields$")
    public void heIsOnTheStarSharpPlatformHeWillCreateANewUnitFillingAllFields(List<DataStartSharp> businessunit_data){
        theActorInTheSpotlight().attemptsTo(CreateBusinessUnit.withTheFollowingInformation(businessunit_data));
    }

    @Then("^he see the new (.*) on the tree$")
    public void heSeeTheNewBusinessUnitOnTheTree(String theNew_businessunit_data) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.AfterSearching(theNew_businessunit_data)));
    }


    @Given("^now he go to the section (.*)")
    public void nowHeGoToTheSectionMeeting(String meetings) {
        theActorInTheSpotlight().attemptsTo(GoSection.aboutOf(meetings));
    }

    @When("^he will to create a new Meeting$")
    public void heWillToCreateANewMeeting(List<DataStartSharp> meetings_data) {
        theActorInTheSpotlight().attemptsTo(CreateMeeting.withTheFollowingInformation(meetings_data));
    }

    @Then("^he can see the new (.*) on the tree$")
    public void heCanSeeTheNewMeetingJohnVOnTheTree(String theNew_meetings_data) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.AfterSearching(theNew_meetings_data)));
    }


}
