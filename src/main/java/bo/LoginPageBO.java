package bo;

import page.LoginPage;

public class LoginPageBO {

    private LoginPage loginPage = new LoginPage();

    public void fillUsername(String username) {
        loginPage.enterLogin(username);
    }

    public void fillPassword(String password) {
        loginPage.enterPassword(password);
    }

    public void clickLogIn(String URL) {
        loginPage.clickLogIn();
        loginPage.waitForUrl(URL);
    }

    public void loadPage(String URL) {
        loginPage.loadPage(URL);
    }

    public void waitForUrl(String URL) {
        loginPage.waitForUrl(URL);
    }
}