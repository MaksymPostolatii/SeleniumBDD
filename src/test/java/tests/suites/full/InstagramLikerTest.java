package tests.suites.full;

import dataprovider.BaseDataProvider;
import dataprovider.CsvDataProvider;
import driver.DriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;
import static util.Constants.*;

@Test(dataProviderClass = BaseDataProvider.class)
public class InstagramLikerTest extends BaseTest {

    @CsvDataProvider(filePath = USERS_DATA_PATH)
    @Test(dataProvider = BASE_DATA_PROVIDER)
    public void loginToInstagram(String login, String password) {
        DriverManager.getChromeDriverThreadLocal().navigate().to(WEBSITE_PATH);
        loginPageBO.waitForUrl(WEBSITE_PATH);
        homePageBO.clickLogInTab();

        loginPageBO.fillUsername(login);
        loginPageBO.fillPassword(password);
        loginPageBO.clickLogIn(INSTAGRAM_REACTIVATED);
        //assertThat(true).isEqualTo(userHomePageBO.isProfileButtonDisplayed());
    }

    public void navigateToSignInPage(String page) {
        DriverManager.getChromeDriverThreadLocal().navigate().to(page);
    }

    public void clickOnLoginTab() {
        homePageBO.clickLogInTab();
    }

    public void reloadPage() {
        loginPageBO.loadPage(WEBSITE_PATH);
    }

    public void verifyLoggedIn() {
        Assert.assertTrue(userHomePageBO.isProfileButtonDisplayed());
        //  userHomePageBO.enterUserNameForSearch("zbsk.citizen");
    }

    public void enterFriendName(String name) {
        userHomePageBO.enterUserNameForSearch(name);
    }

    public void openFriendPage(String name) {
        userHomePageBO.openFriendPage(name);
    }

    public void openFirstImage() {
        friendPageBO.openFirstImage();
    }

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

    public void openProfilePage() {
        userHomePageBO.openProfile();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openOptionsPage() {
        profilePageBO.openOptions();
    }

    public void logOut() {
        optionsPageBO.clickLogOut();
    }

    public void verifyLoggedOut() {
        //Assert.assertTrue(homePageBO.isLogInButtonDisplayed());
    }
}