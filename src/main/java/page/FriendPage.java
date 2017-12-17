package page;

import element.ButtonElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

public class FriendPage extends AbstractPage {

    @FindBy(xpath = "(//div/img[@srcset])[1]")
    private ButtonElement firstImage;

    public void openFirstImage() {

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", firstImage.getWebElement());

        //firstImage.click();
    }

}
