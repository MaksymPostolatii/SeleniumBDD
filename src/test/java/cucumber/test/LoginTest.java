package cucumber.test;

import bo.HomePageBO;
import bo.LoginPageBO;
import bo.ProfilePageBO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static driver.DriverManager.removeDriver;
import static java.lang.String.*;
import static util.Constants.WEBSITE_PATH;

public class LoginTest {

    private LoginPageBO loginPageBO;
    private HomePageBO homePageBO;
    private ProfilePageBO profilePageBO;

//    @BeforeTest
//    public void setup() {
//        loginPageBO = new LoginPageBO();
//        homePageBO = new HomePageBO();
//        profilePageBO = new ProfilePageBO();
//    }

    @Given("^user is on home page$")
    public void verifyHomePage() {
        loginPageBO = new LoginPageBO();
        homePageBO = new HomePageBO();
        profilePageBO = new ProfilePageBO();
        Assert.assertTrue(homePageBO.getCurrentURL().equals(WEBSITE_PATH),
                format("Expected URL: %s\nActual URL: %s", WEBSITE_PATH, homePageBO.getCurrentURL()));
    }

    @When("^user navigates to the sign in page$")
    public void navigateToSignInPage() {
        homePageBO.clickLogInTab();
    }


    @And("^user provides the login as ([^\"]*)$")
    public void fillLogin(String login) {
        loginPageBO.fillUsername(login);
    }


    @And("^user provides the password as ([^\"]*)$")
    public void fillPassword(String password) {
        loginPageBO.fillPassword(password);
    }

    @And("^user clicks sign in button$")
    public void clickSignIn() {
        loginPageBO.clickLogIn();
    }

    @Then("^user should be logged in to the web site$")
    public void verifyLoggedIn() {
        Assert.assertTrue(profilePageBO.isProfileButtonDisplayed());
    }

//    @AfterTest
//    public void tearDown() {
//        removeDriver();
//    }


}
