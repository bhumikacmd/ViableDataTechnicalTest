package com.viabledatatest.page;

import com.viabledatatest.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class LocationPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public LocationPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='__next']/main/nav/div/ul/li")
    List<WebElement> locationPage;
    @CacheLookup
    @FindBy(xpath = "//section[@class='container text-white bg-dark py-3']/div/div/div")
    List<WebElement> numberOfLocation;
    @CacheLookup
    @FindBy(xpath = "//h5[text()='Schoen, Rau and Windler Square']")
    WebElement office1;
    @CacheLookup
    @FindBy(xpath = "//div[@id='__next']/main/section/div[1]/div[2]/div/a")
    WebElement learnmore1;
    @CacheLookup
    @FindBy(xpath = "//h5[text()='Sipes Group Complex']")
    WebElement office2;
    @CacheLookup
    @FindBy(xpath = "//div[@id='__next']/main/section/div[3]/div[2]/div/a")
    WebElement learnmore2;
    @CacheLookup
    @FindBy(xpath = "//h5[text()='Turcotte, Carroll and Hermiston Square']")
    WebElement office3;
    @CacheLookup
    @FindBy(xpath = "//div[@id='__next']/main/section/div[4]/div[2]/div/a")
    WebElement learnmore3;
    @CacheLookup
    @FindBy(xpath = "//div[@class='my-2']/div[4]/i[2]")
    WebElement officePublics;
    @CacheLookup
    @FindBy(xpath = "//div[@class='my-2']/div[1]/span[text()='No parking available']")
    WebElement noParking;
    @CacheLookup
    @FindBy(xpath = "//table[@class='table table-bordered table-sm table-striped bg-secondary text-dark']/tbody/tr[3]/td[2]")
    WebElement teamOfficesSeats;
    @CacheLookup
    @FindBy(xpath = "//img[@class='card-img-top']")
    List<WebElement> images;


    public void clickOnLocationLink(String list) {
        for (WebElement l : locationPage) {
            if (l.getText().equalsIgnoreCase(list)) {
                l.click();
                break;
            }
        }
    }

    public void locations() throws InterruptedException {
        Thread.sleep(2000);
        int actualNumberofLocation = numberOfLocation.size();
        int expectedNumbersofLocation = 48;
        if (actualNumberofLocation == expectedNumbersofLocation) {
            System.out.println("Locations page is verified");
        }

    }

    public void clickonOfficeName1() {
        office1.isDisplayed();
        learnmore1.click();

    }

    public void clickonOfficeName2() {
        office2.isDisplayed();
        learnmore2.click();

    }

    public void clickonOfficeName3() {
        office3.isDisplayed();
        learnmore3.click();

    }


    public boolean selectPublicOffices() {
        String s = officePublics.getAttribute("aria-hidden");
        if (s.equals("true")) {
            return true;
        } else {
            return false;
        }


    }

    public void noParkingSet() {
        String expectedText = getTextFromElement(noParking);
        String actualText = "No parking available";
        Assert.assertEquals(expectedText, actualText);


    }

    public boolean numberOfTeamOfficeSeats() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,2400)");
        //js.executeScript("arguments[0].scrollIntoView(true);", teamOfficesSeats);
        int actualseat = Integer.parseInt(getTextFromElement(teamOfficesSeats));
        int expectedseat = 4;
        if (actualseat == expectedseat) {
            return true;
        }
        return false;
    }

    public void numberofImagePresent() throws InterruptedException {
        Thread.sleep(2000);
        int actualNumberofImages = images.size();
        int expectedNumbersofImages = 48;
        if (actualNumberofImages == expectedNumbersofImages) {
            System.out.println("Verification of existing locations having an Image");
        }


    }


}


