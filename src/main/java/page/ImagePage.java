package page;

import element.ButtonElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ImagePage extends AbstractPage {

    @FindBy(xpath = "//span[contains(@class,'Heart')]")
    private ButtonElement like;

    private final String nextButton = "//a[contains(text(),'Next')]";

    @FindBy(xpath = "//button[contains(text(),'Close')]")
    private ButtonElement close;

    public void clickLike() {
        like.click();
    }

    public ButtonElement getLike() {
        return like;
    }

    public List<WebElement> getNextImageButton() {
        return driver.findElements(By.xpath(nextButton));
    }

    public void clickCloseImage() {
        close.click();
    }

}
