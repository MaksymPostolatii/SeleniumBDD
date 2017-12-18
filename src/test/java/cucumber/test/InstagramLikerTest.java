package cucumber.test;

import bo.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import driver.DriverManager;
import org.testng.Assert;

import static java.lang.String.format;
import static util.Constants.*;

public class InstagramLikerTest {

    private HomePageBO homePageBO;
    private LoginPageBO loginPageBO;
    private UserHomePageBO userHomePageBO;
    private ProfilePageBO profilePageBO;
    private OptionsPageBO optionsPageBO;
    private FriendPageBO friendPageBO;
    private ImagePageBO imagePageBO;

    @Before
    public void setUp() {
        homePageBO = new HomePageBO();
        loginPageBO = new LoginPageBO();
        userHomePageBO = new UserHomePageBO();
        profilePageBO = new ProfilePageBO();
        optionsPageBO = new OptionsPageBO();
        friendPageBO = new FriendPageBO();
        imagePageBO = new ImagePageBO();
    }

    @Given("^user navigates to the (.+) page$")
    public void navigateToSignInPage(String page) {
        DriverManager.getChromeDriverThreadLocal().navigate().to(page);
    }

    @And("^user clicks on the login tab$")
    public void clickOnLoginTab(){
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

    @And("^user is logged in to the web site$")
    public void verifyLoggedIn() {
        Assert.assertTrue(userHomePageBO.isProfileButtonDisplayed());
        //  userHomePageBO.enterUserNameForSearch("zbsk.citizen");
    }

    @And("^user types friend name as ([^\"]*) into the search field$")
    public void enterFriendName(String name) {
        userHomePageBO.enterUserNameForSearch(name);
    }

    @And("^user opens friend page and wait for URL with ([^\"]*) loading$")
    public void openFriendPage(String name) {
        userHomePageBO.openFriendPage(name);
    }

    @And("^user opens first image$")
    public void openFirstImage() {
        friendPageBO.openFirstImage();
    }

    @And("^user sets like for each image and closes last image$")
    public void setLikes() {

            //next button is present
            while (imagePageBO.isNextImageButtonPresent()) {
                if (imagePageBO.isPhotoLiked()) {
                    imagePageBO.clickLike();
                }
                    imagePageBO.clickNextImageButton();
            }

            imagePageBO.clickCloseImage();
    }

    @And("^user clicks on the profile page$")
    public void openProfilePage() {
        userHomePageBO.openProfile();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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

/*    @Test
    public void login() {
        //logIn
        homePageBO.clickLogInTab();
        loginPageBO.fillUsername(FIRST_LOGIN);
        loginPageBO.fillPassword(PASSWORD);
        loginPageBO.clickLogIn();
        loginPageBO.waitForUrl(INSTAGRAM_REACTIVATED);
        loginPageBO.loadPage(WEBSITE_PATH);
        //NavigateToFriendPage
        userHomePageBO.enterUserNameForSearch("zbsk.citizen");
        userHomePageBO.openFriendPage("zbsk.citizen");
        //Setup like
        friendPageBO.openFirstImage();
        try {
            while (imagePageBO.checkNextImageButton()) {
                imagePageBO.clickLike();
                imagePageBO.clickNextImage();
            }
        } catch (Exception e) {
//            imagePageBO.clickCloseImage();
        }
        //LogOut
        userHomePageBO.openProfile();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        profilePageBO.openOptions();
        optionsPageBO.clickLogOut();
    }*/

    @After
    public void tearDown() {
        DriverManager.removeDriver();
    }

}