package page;

import decorator.CustomFieldDecorator;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static driver.DriverManager.getDriver;
import static org.openqa.selenium.support.PageFactory.initElements;
import static util.Constants.WEBSITE_PATH;

abstract class AbstractPage {

    WebDriver driver;

    AbstractPage() {
        driver = getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(WEBSITE_PATH);
        initElements(new CustomFieldDecorator(driver), this);
    }
}
