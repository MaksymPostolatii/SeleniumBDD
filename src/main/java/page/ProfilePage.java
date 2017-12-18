package page;

import element.ButtonElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfilePage extends AbstractPage {

    @FindBy(xpath = "//button[contains(text(),'Options')]")
    private ButtonElement options;

    private static final String REMEMBER_ME_BUTTON_LOCATOR  = "//button[contains(text(), 'Remember')]";

    public void openOptions() {
        options.click();
    }

    public List<WebElement> getRememberMeButton() {
        return driver.findElements(By.xpath(REMEMBER_ME_BUTTON_LOCATOR));
    }
}
