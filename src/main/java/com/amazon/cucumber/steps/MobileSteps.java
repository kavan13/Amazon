package com.amazon.cucumber.steps;

import com.amazon.pages.MobilePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MobileSteps {
    @Then("^I see list of mobile$")
    public void iSeeListOfMobile() {
        new MobilePage().verifyMobileList();
    }

    @When("^I select mobile$")
    public void iSelectMobile() {
        new MobilePage().selectNokiaPhone();
    }
}
