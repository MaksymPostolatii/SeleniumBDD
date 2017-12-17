package page;

import cucumber.deps.com.thoughtworks.xstream.io.xml.BEAStaxDriver;
import element.ButtonElement;
import org.openqa.selenium.support.FindBy;

public class ImagePage extends AbstractPage {

    @FindBy(xpath = "//span[contains(text(),'Like') or contains(text(), 'Unlike')]")
    private ButtonElement like;

    @FindBy(xpath = "//a[contains(text(),'Next')]")
    private ButtonElement next;

    @FindBy(xpath = "//button[contains(text(),'Close')]")
    private ButtonElement close;

    public void clickLike() {
        like.click();
    }

    public void clickNextImage() {
        next.click();
    }

    public void clickCloseImage() {
        close.click();
    }

    public Boolean checkNextImageButton() {
        return next.isDisplayed();
    }

}
