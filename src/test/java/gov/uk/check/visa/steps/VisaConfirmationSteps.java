package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaConfirmationSteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {
    }

    @When("I accept additional cookies")
    public void iAcceptAdditionalCookies() {
        new StartPage().clickOnAcceptAdditionalCookiesButton();
    }

    @When("Click on start button")
    public void clickOnStartButton() {
        new StartPage().clickOnStart();
    }

    @Then("Select a Nationality {string}")
    public void selectANationalityAustralia(String nationality) {
        new SelectNationalityPage().selectNationalityName(nationality);
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        new SelectNationalityPage().clickOnContinue();
    }

    @And("Select reason {string}")
    public void selectReasonTourism(String reason) throws InterruptedException {
        new ReasonForTravelPage().selectReason(reason);
    }

    @And("verify result {string}")
    public void verifyResultYouWillNotNeedAVisaToComeToTheUK() {
        new ReasonForTravelPage().verifyText();
    }

    @And("Select intended to stay for {string}")
    public void selectIntendedToStayForLongerThanMonths(int month) throws InterruptedException {
        new DurationOfStayPage().selectIntentionToStay();
    }

    @And("Select have planning to work for {string}")
    public void selectHavePlanningToWorkForHealthAndCareProfessional() {
        new WorkTypePage().selectPlanningToWork();
    }

    @And("Select state My partner of family member have uk immigration status {string}")
    public void selectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes() {
        new FamilyImmigrationStatusPage().verifyFamilyImmigrationStatus("Yes");
    }
}