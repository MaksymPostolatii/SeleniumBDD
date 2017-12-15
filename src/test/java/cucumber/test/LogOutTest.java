package cucumber.test;

import bo.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import static util.Constants.*;

public class LogOutTest {

    private HomePageBO homePageBO;
    private LoginPageBO loginPageBO;
    private UserHomePageBO userHomePageBO;
    private ProfilePageBO profilePageBO;
    private OptionsPageBO optionsPageBO;

    @Before
    public void beforeScenario() {
        homePageBO = new HomePageBO();
        loginPageBO = new LoginPageBO();
        userHomePageBO = new UserHomePageBO();
        profilePageBO = new ProfilePageBO();
        optionsPageBO = new OptionsPageBO();

        homePageBO.clickLogInTab();
        loginPageBO.fillUsername(FIRST_LOGIN);
        loginPageBO.fillPassword(PASSWORD);
        loginPageBO.clickLogIn();
        loginPageBO.waitForUrl(INSTAGRAM_REACTIVATED);
        loginPageBO.loadPage(WEBSITE_PATH);
    }

    @Given("^user successfully logged in$")
    public void verifyLoggedIn() {
        Assert.assertTrue(userHomePageBO.isProfileButtonDisplayed());
    }

    @When("^user navigates to the profile page$")
    public void openToProfilePage() {
        userHomePageBO.openProfile();
    }

    @And("^user opens options page$")
    public void openOptionsPage() {
        profilePageBO.openOptions();
    }

    @And("^user clicks log out button$")
    public void logOut() {
        optionsPageBO.clickLogOut();
    }

    @Then("^user should be logged out from the web site$")
    public void verifyLoggedOut() {
        Assert.assertTrue(homePageBO.isLogInButtonDisplayed());
    }

}
