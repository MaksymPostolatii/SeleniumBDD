package bo;

import page.LoginPage;
import util.FluentWaitElement;

public class LoginPageBO {

    private LoginPage loginPage = new LoginPage();

    public void fillUsername(String username) {
        loginPage.getUserNameInputField().sendKeys(username);
    }

    public void fillPassword(String password) {
        loginPage.getUserPasswordInputField().sendKeys(password);
    }

    public void clickLogIn(String URL) {
        loginPage.getLogInButton().click();
        FluentWaitElement.waitForUrl(loginPage.getDriver(), URL);
    }

    public void loadPage(String URL) {
        loginPage.getDriver().get(URL);
    }

    public void waitForUrl(String URL) {
        FluentWaitElement.waitForUrl(loginPage.getDriver(), URL);
    }
}