package tests;

import bo.*;
import driver.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected HomePageBO homePageBO;
    protected LoginPageBO loginPageBO;
    protected UserHomePageBO userHomePageBO;
    protected ProfilePageBO profilePageBO;
    protected OptionsPageBO optionsPageBO;
    protected FriendPageBO friendPageBO;
    protected ImagePageBO imagePageBO;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        homePageBO = new HomePageBO();
        loginPageBO = new LoginPageBO();
        userHomePageBO = new UserHomePageBO();
        profilePageBO = new ProfilePageBO();
        optionsPageBO = new OptionsPageBO();
        friendPageBO = new FriendPageBO();
        imagePageBO = new ImagePageBO();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        DriverManager.removeDriver();
    }
}
