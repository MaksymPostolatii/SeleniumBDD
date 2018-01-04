package util;

public final class Constants {

    public static final String DRIVER = "webdriver.chrome.driver";
    public static final String DRIVER_PATH = "src/main/resources/chrome-driver/chromedriver.exe";
    public static final String WEBSITE_PATH = "https://www.instagram.com/?hl=en";
    public static final String INSTAGRAM_REACTIVATED = "https://www.instagram.com/?hl=en#reactivated";
    public static final String NEXT_IMAGE_BUTTON_LOCATOR = "//a[contains(text(),'Next')]";
    public static final String BASE_DATA_PROVIDER = "base-data-provider";
    public static final String USERS_DATA_PATH = "/csv-data-provider/usersData.csv";

    private Constants() {
    }
}