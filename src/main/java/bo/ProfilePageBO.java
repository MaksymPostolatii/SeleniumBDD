package bo;

import org.openqa.selenium.WebElement;
import page.ProfilePage;

public class ProfilePageBO {

    private ProfilePage profilePage = new ProfilePage();

    public void openOptions() {
        profilePage.getOptionsButton().click();
    }

    public boolean isRememberMeButtonPresent() {
        return profilePage.getRememberMeButton().size() > 0;
    }

    public void clickRememberMeButton() {
        profilePage.getRememberMeButton().stream().findAny().ifPresent(WebElement::click);
    }
}
