package page;

import element.ButtonElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends AbstractPage {

    @FindBy(xpath = "//button[contains(text(),'Options')]")
    private ButtonElement options;

    public void openOptions() {
        options.click();
    }

}
