package bo;

import page.UserHomePage;
import util.FluentWaitElement;

public class UserHomePageBO {

    private UserHomePage userHomePage = new UserHomePage();

    public Boolean isProfileButtonDisplayed() {
        return userHomePage.getProfileButton().isDisplayed();
    }

    public void openProfile() {
        userHomePage.getProfileButton().click();
    }

    public void enterUserNameForSearch(String userSearchName) {
        userHomePage.getUserSearchInputField().sendKeys(userSearchName);
    }

    public void openFriendPage(String partOfUrl) {
        userHomePage.getUserImage().click();
        FluentWaitElement.waitForUrlContains(userHomePage.getDriver(), partOfUrl);
    }
}
