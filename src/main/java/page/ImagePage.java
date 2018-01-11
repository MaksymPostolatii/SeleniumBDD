package page;

import element.ButtonElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static util.Constants.NEXT_IMAGE_BUTTON_LOCATOR;

public class ImagePage extends AbstractPage {

    @FindBy(xpath = "//span[contains(@class,'Heart')]")
    private ButtonElement likeButton;
    @FindBy(xpath = "//button[contains(text(),'Close')]")
    private ButtonElement closeButton;

    public ButtonElement getCloseButton() {
        return closeButton;
    }

    public ButtonElement getLikeButton() {
        return likeButton;
    }

    public List<WebElement> getNextImageButton() {
        return driver.findElements(By.xpath(NEXT_IMAGE_BUTTON_LOCATOR));
    }

}
