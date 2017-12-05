package bo;

import page.HomePage;

public class HomePageBO {

    private HomePage homePage = new HomePage();

    public void clickLogInTab() {
        homePage.navigateToLogIn();
    }

}
