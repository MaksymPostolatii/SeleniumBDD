package page;

import element.ButtonElement;
import element.InputElement;
import org.openqa.selenium.support.FindBy;
import util.FluentWaitElement;

public class UserHomePage extends AbstractPage {

    @FindBy(xpath = "//a[contains(text(),'Profile')]")
    private ButtonElement profile;

    @FindBy(xpath = "//input[@placeholder='Search']")
    private InputElement userSearch;

    @FindBy(xpath = "//div/img")
    private ButtonElement userImage;

    public Boolean isProfileButtonDisplayed() {
        return profile.isDisplayed();
    }

    public void openProfile() {
        profile.click();
    }

    public void enterUserNameForSearch(String userSearchName) {
        userSearch.sendKeys(userSearchName);
    }

    public void openFriendPage(String urlPart) {
        userImage.click();
        FluentWaitElement.waitForUrl(driver, urlPart);
    }
}
