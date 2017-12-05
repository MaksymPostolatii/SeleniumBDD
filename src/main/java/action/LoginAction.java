package action;

import bo.HomePageBO;
import bo.LoginPageBO;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginAction {

    private LoginPageBO loginPageBO;
    private HomePageBO homePageBO;

    @Given("^the user is on landing page$")
    public void setup() {
        loginPageBO = new LoginPageBO();
        homePageBO = new HomePageBO();
    }


    @When("^user navigates to the sign in page$")
    public void user_navigates_to_the_sign_in_page() {
        homePageBO.clickLogInTab();
    }


    @And("^user provides the login as ([^\"]*)$")
    public void user_provides_the_login_as(String login) {
        loginPageBO.fillUsername(login);
    }


    @And("^user provides the password as ([^\"]*)$")
    public void user_provides_the_password_as(String password) {
        loginPageBO.fillPassword(password);
    }

    @And("^user clicks sign in button$")
    public void user_clicks_sign_in_button() {
        loginPageBO.clickLogIn();
    }

    @Then("^user should be logged in to the web site$")
    public void user_should_be_logged_in_to_the_web_site() {
//        boolean signOutLinkDisplayed = driver.findElement(By.cssSelector("a[href='/users/sign_out']")).isDisplayed();
//        Assert.assertTrue(signOutLinkDisplayed);
    }

}
