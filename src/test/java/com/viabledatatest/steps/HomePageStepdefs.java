package com.viabledatatest.steps;

import com.viabledatatest.page.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class HomePageStepdefs {
    @Given("^User is on Homepage$")
    public void userIsOnHomepage() {

    }

    @Then("^User to verify \"([^\"]*)\" text$")
    public void userToVerifyText(String text) {
        Assert.assertEquals(text, new HomePage().verifyText(text));

    }


}
