/*
package cucumber.test;

import bo.HomePageBO;
import bo.LoginPageBO;
import bo.UserHomePageBO;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import static java.lang.String.format;
import static util.Constants.INSTAGRAM_REACTIVATED;
import static util.Constants.WEBSITE_PATH;

public class LogInTest {

    private HomePageBO homePageBO;
    private LoginPageBO loginPageBO;
    private UserHomePageBO userHomePageBO;

    @Before
    public void beforeScenario() {
        homePageBO = new HomePageBO();
        loginPageBO = new LoginPageBO();
        userHomePageBO = new UserHomePageBO();
    }

    @Given("^user is on instagram home page$")
    public void verifyHomePage() {
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
        loginPageBO.waitForUrl(INSTAGRAM_REACTIVATED);
    }

    @And("^user reloads page for avoiding 'download app for mobile' page$")
    public void reloadPage() {
        loginPageBO.loadPage(WEBSITE_PATH);
    }

    @Then("^user should be logged in to the web site$")
    public void verifyLoggedIn() {
        Assert.assertTrue(userHomePageBO.isProfileButtonDisplayed());
      //  userHomePageBO.enterUserNameForSearch("zbsk.citizen");
    }

}
*/
