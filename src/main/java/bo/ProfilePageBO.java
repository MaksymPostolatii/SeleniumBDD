package bo;

import page.ProfilePage;

public class ProfilePageBO {

    ProfilePage profilePage = new ProfilePage();

    public Boolean isProfileButtonDisplayed() {
        return profilePage.isProfileButtonDisplayed();
    }

}
