package page;

import decorator.CustomFieldDecorator;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static driver.DriverManager.getDriver;
import static util.Constants.WEBSITE_PATH;
import static org.openqa.selenium.support.PageFactory.initElements;

abstract class AbstractPage {

    AbstractPage() {
        WebDriver driver = getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(WEBSITE_PATH);
        //driver.manage().window().fullscreen();
        initElements(new CustomFieldDecorator(driver), this);
    }
}
