package bo;

import page.HomePage;

public class HomePageBO {

    private HomePage homePage = new HomePage();

    public void clickLogInTab() {
        homePage.getLogInButton().click();
    }

    public String getCurrentURL() {
        return homePage.getDriver().getCurrentUrl();
    }

    public Boolean isLogInButtonDisplayed() {
        return homePage.getLogInButton().isDisplayed();
    }

}
