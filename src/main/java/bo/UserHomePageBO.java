package bo;

import page.UserHomePage;

public class UserHomePageBO {

    private UserHomePage userHomePage = new UserHomePage();

    public Boolean isProfileButtonDisplayed() {
        return userHomePage.isProfileButtonDisplayed();
    }

    public void openProfile() {
        userHomePage.openProfile();
    }

    public void enterUserSearchName(String userSearchName) {
        userHomePage.enterUserSearchName(userSearchName);
    }

}
