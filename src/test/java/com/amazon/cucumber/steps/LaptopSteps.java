package com.amazon.cucumber.steps;

import com.amazon.pages.LoptopPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LaptopSteps {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
    }

    @When("^I enter \"([^\"]*)\" in search bar$")
    public void iEnterInSearchBar(String arg0)  {
      new LoptopPage().searchForLaptop("Laptop");
    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        new LoptopPage().clickOnSerchButton();
    }



    @And("^I click on second page$")
    public void iClickOnSecondPage() throws InterruptedException {
        new LoptopPage().clickOnSecondPage();
    }

    @And("^I click on third page$")
    public void iClickOnThirdPage() throws InterruptedException {
        new LoptopPage().clickOnThirdPage();
    }

    @And("^I click on Next page$")
    public void iClickOnNextPage() throws InterruptedException {
        new LoptopPage().clickOnNext();
    }

    @When("^I select laptop$")
    public void iSelectLaptop() {
        new LoptopPage().selectLenovoLaptop();
    }

    @And("^I Select quantity \"([^\"]*)\"$")
    public void iSelectQuantity(String value)  {
        new LoptopPage().clickOnQuantityDropDownList(value);
    }

    @And("^I click on Add to cart button$")
    public void iClickOnAddToCartButton() {
        new LoptopPage().clickOnAddToCartButton();
    }

    @Then("^I see the product is added to cart Successfully$")
    public void iSeeTheProductIsAddedToCartSuccessfully() {
        new LoptopPage().verifyAddedToCartText();
    }



    @Then("^I see list of laptop$")
    public void iSeeListOfLaptop() {
        new LoptopPage().verifyLaptopList();
    }
}
