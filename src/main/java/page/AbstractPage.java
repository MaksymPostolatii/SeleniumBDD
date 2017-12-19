package page;

import decorator.CustomFieldDecorator;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static driver.DriverManager.getChromeDriverThreadLocal;
import static org.openqa.selenium.support.PageFactory.initElements;

abstract class AbstractPage {

    WebDriver driver;

    AbstractPage() {
        driver = getChromeDriverThreadLocal();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        initElements(new CustomFieldDecorator(driver), this);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
