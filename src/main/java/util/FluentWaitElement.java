package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

@SuppressWarnings("unchecked")
public class FluentWaitElement {

    public static void waitForUrlContains(WebDriver driver, String URL) {
        Wait wait = new FluentWait(driver).withTimeout(10, SECONDS).pollingEvery(3, MILLISECONDS);
        wait.until(ExpectedConditions.urlContains(URL));
    }

    public static void waitForUrl(WebDriver driver, String URL) {
        Wait wait = new FluentWait(driver).withTimeout(10, SECONDS).pollingEvery(3, MILLISECONDS);
        wait.until(ExpectedConditions.urlToBe(URL));
    }

    public static void waitClickableElement(WebElement webElement, WebDriver driver) {
        Wait wait = new FluentWait(driver).withTimeout(10, SECONDS).pollingEvery(3, MILLISECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

}
