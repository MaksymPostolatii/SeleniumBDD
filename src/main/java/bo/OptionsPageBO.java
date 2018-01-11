package bo;

import page.OptionsPage;

public class OptionsPageBO {

    private OptionsPage optionsPage = new OptionsPage();
    private ProfilePageBO profilePageBO = new ProfilePageBO();

    public void clickLogOut() {
        optionsPage.getLogOutButton().click();

        if (profilePageBO.isRememberMeButtonPresent()) {
            profilePageBO.clickRememberMeButton();
        }
    }

}
