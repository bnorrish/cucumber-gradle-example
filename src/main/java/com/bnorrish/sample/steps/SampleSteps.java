package com.bnorrish.sample.steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SampleSteps {

    @Given("^I have navigated to the Sign In page$")
    public void navigateToSignInPage() throws Throwable {

    }

    @And("^I enter valid credentials$")
    public void enterValidCredentials() throws Throwable {

    }

    @And("^I enter invalid credentials$")
    public void enterInvalidCredentials() throws Throwable {


    }

    @Then("^I have successfully signed in$")
    public void verifySuccessfulSignIn() throws Throwable {

    }

    @And("^I log in with (\\S+) and (\\S+)$")
    public void signInWithCredentials(String userName, String password) throws Throwable {

    }

    @Then("^I am successfully signed in$")
    public void verifySignIn() throws Throwable {

    }

    @And("^I enter the username (\\S+)$")
    public void enterUserName(String username) throws Throwable {

    }

    @And("^I enter the password (\\S+)$")
    public void enterPassword(String password) throws Throwable {

    }

    @And("^I click the submit button$")
    public void clickSubmit() throws Throwable {

    }

    @Given("^the following accounts have been created$")
    public void setupAccount(DataTable table) throws Throwable {

    }

    @Then("^I should get an incorrect password page$")
    public void verifyIncorrectPassword() throws Throwable {

    }
}
