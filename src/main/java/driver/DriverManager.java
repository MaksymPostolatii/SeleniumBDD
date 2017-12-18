package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static util.Constants.DRIVER;
import static util.Constants.DRIVER_PATH;
import static java.lang.System.setProperty;
import static java.lang.ThreadLocal.withInitial;

public class DriverManager {

    private static final ThreadLocal<ChromeDriver> CHROME_DRIVER_THREAD_LOCAL = withInitial(() -> {
        setProperty(DRIVER, DRIVER_PATH);
        return new ChromeDriver();
    });

    private DriverManager() {
    }

    public static WebDriver getChromeDriverThreadLocal() {
        return CHROME_DRIVER_THREAD_LOCAL.get();
    }

    public static void removeDriver() {
        CHROME_DRIVER_THREAD_LOCAL.get().quit();
        CHROME_DRIVER_THREAD_LOCAL.remove();
    }
}