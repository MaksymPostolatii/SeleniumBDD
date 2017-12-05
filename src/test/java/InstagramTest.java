import bo.HomePageBO;
import bo.LoginPageBO;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static driver.DriverManager.removeDriver;
import static util.Constants.*;

public class InstagramTest {


    @DataProvider(parallel = true)
    public Object[][] dataProvider() {
        return new Object[][]{{FIRST_LOGIN, PASSWORD}, {SECOND_LOGIN, PASSWORD}};
    }

    @Test(dataProvider = DATA_PROVIDER)
    public void LoginTest(String username, String password) {

        LoginPageBO loginPageBO = new LoginPageBO();
        HomePageBO homePageBO = new HomePageBO();


        homePageBO.clickLogInTab();

        loginPageBO.fillUsername(username);
        loginPageBO.fillPassword(password);
        loginPageBO.clickLogIn();
    }

    @AfterMethod
    public void afterMethod() {
        removeDriver();
    }

}