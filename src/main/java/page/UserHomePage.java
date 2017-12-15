package page;

import element.ButtonElement;
import element.InputElement;
import org.openqa.selenium.support.FindBy;

public class UserHomePage extends AbstractPage {

    @FindBy(xpath = "//a[contains(text(),'Profile')]")
    private ButtonElement profile;

    @FindBy(xpath = "//input[@placeholder='Search']")
    private InputElement enterSearchUser;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    private ButtonElement clickSearchUser;

    public Boolean isProfileButtonDisplayed() {
        return profile.isDisplayed();
    }

    public void openProfile() {
        profile.click();
    }

    public void enterUserSearchName(String userSearchName) {
        clickSearchUser.click();
        enterSearchUser.sendKeys(userSearchName);
    }
}
