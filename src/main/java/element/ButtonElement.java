package element;

import org.openqa.selenium.WebElement;

public class ButtonElement extends AbstractElement {

    public ButtonElement(WebElement webElement) {
        super(webElement);
    }

    public void click() {
        webElement.click();
    }

    public boolean isDisplayed() {
        return webElement.isDisplayed();
    }

    public boolean isEnabled() {
        return webElement.isEnabled();
    }

    @Override
    public String getCSSClass() {
        return super.getCSSClass();
    }
}
