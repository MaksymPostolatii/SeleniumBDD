package bo;

import page.OptionsPage;
import page.ProfilePage;

public class OptionsPageBO {

    private OptionsPage optionsPage = new OptionsPage();
    private ProfilePageBO profilePageBO = new ProfilePageBO();

    public void clickLogOut() {
        optionsPage.clickLogOut();

        if (profilePageBO.isRememberMeButtonPresent()) {
            profilePageBO.clickRememberMeButton();
        }
    }

}
