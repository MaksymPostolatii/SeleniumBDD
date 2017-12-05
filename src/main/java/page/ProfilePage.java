package page;

import element.ButtonElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends AbstractPage {

    @FindBy(xpath = "//a[contains(text(),'Profile')]")
    private ButtonElement profile;

    public Boolean isProfileButtonDisplayed() {
        return profile.isDisplayed();
    }
}
