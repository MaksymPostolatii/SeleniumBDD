package element;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class InputElement extends AbstractElement {

    public InputElement(WebElement webElement) {
        super(webElement);
    }

    public void sendKeys(String keys) {
        webElement.sendKeys(keys);
    }

    public String getText() {
        return webElement.getText();
    }

    public void sendKeys(Keys keys) {
        webElement.sendKeys(keys);
    }
}
