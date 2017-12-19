package bo;

import org.openqa.selenium.WebDriver;
import page.HomePage;

public class HomePageBO {

    private HomePage homePage = new HomePage();

    public void clickLogInTab() {
        homePage.getLogIn().click();
    }

    public String getCurrentURL() {
        return homePage.getDriver().getCurrentUrl();
    }

    public Boolean isLogInButtonDisplayed() {
        return homePage.getLogIn().isDisplayed();
    }

}
