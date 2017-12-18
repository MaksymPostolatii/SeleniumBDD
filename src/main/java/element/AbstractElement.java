package element;

import org.openqa.selenium.WebElement;

public abstract class AbstractElement {

    WebElement webElement;

    AbstractElement(WebElement webElement) {
        this.webElement = webElement;
    }

    public WebElement getWebElement() {
        return webElement;
    }

    public String getCSSClass() {
        return webElement.getAttribute("class");
    }
}
