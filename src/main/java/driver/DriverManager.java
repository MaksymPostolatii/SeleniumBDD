package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static util.Constants.DRIVER;
import static util.Constants.DRIVER_PATH;
import static java.lang.System.setProperty;
import static java.lang.ThreadLocal.withInitial;

public class DriverManager {

    private static ThreadLocal<WebDriver> driver = withInitial(() -> {
        setProperty(DRIVER, DRIVER_PATH);
        return new ChromeDriver();
    });

    private DriverManager() {
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void removeDriver() {
        driver.get().quit();
        driver.remove();
    }
}