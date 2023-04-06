package com.viabledatatest.steps;

import com.viabledatatest.browserfactory.ManageBrowser;
import com.viabledatatest.page.LocationPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LocationPageStepdefs {

    @When("^User click on Location link$")
    public void userClickOnLocationLink() {
        new LocationPage().clickOnLocationLink("Locations");
    }

    @Then("^User to verify number of locations$")
    public void userToVerifyNumberOfLocations() throws InterruptedException {
        new LocationPage().locations();
    }

    //    @Then("^User to check number of Team Office seats available$")
//    public void userToCheckNumberOfTeamOfficeSeatsAvailable(String tex) throws InterruptedException {
//        Assert.assertEquals(tex,new LocationPage().numberOfTeamOfficeSeats(tex));
//    }
    @And("^User select Schoen, Rau and Windler Square office based on requirements$")
    public void userSelectSchoenRauAndWindlerSquareOfficeBasedOnRequirements() {
        new LocationPage().clickonOfficeName1();
    }


//    @Then("^User should verify following details$")
//    public void user_should_verify_following_details() {
//        boolean a = new LocationPage().selectPublicOffice1();
//        System.out.println("Is checked" +a);
//
//    }


    @And("^User select Sipes Group Complex office based on requirements$")
    public void userSelectSipesGroupComplexOfficeBasedOnRequirements() {
        new LocationPage().clickonOfficeName2();
    }

    @And("^User select Turcotte, Carroll and Hermiston Square office based on requirements$")
    public void userSelectTurcotteCarrollAndHermistonSquareOfficeBasedOnRequirements() {
        new LocationPage().clickonOfficeName3();
    }

    @And("^User should check public access is available$")
    public void userShouldCheckPublicAccessIsAvailable() {
        new LocationPage().selectPublicOffices();
    }

    @And("^User should check no parking is set$")
    public void userShouldCheckNoParkingIsSet() {
        new LocationPage().noParkingSet();

    }

    @Then("^User to check number of Team Office seats available$")
    public void userToCheckNumberOfTeamOfficeSeatsAvailable() throws InterruptedException {
        new LocationPage().numberOfTeamOfficeSeats();

    }

    @Then("^User to verify number of images present for existing locations$")
    public void userToVerifyNumberOfImagesPresentForExistingLocations() throws InterruptedException {
        new LocationPage().numberofImagePresent();
    }
}
