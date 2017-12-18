//package cucumber.test;
//
//import bo.*;
//import driver.DriverManager;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import static util.Constants.*;
//
//public class TEST {
//
//
//    private HomePageBO homePageBO;
//    private LoginPageBO loginPageBO;
//    private UserHomePageBO userHomePageBO;
//    private ProfilePageBO profilePageBO;
//    private OptionsPageBO optionsPageBO;
//    private FriendPageBO friendPageBO;
//    private ImagePageBO imagePageBO;
//
//    @BeforeClass
//    public void setUp() {
//        homePageBO = new HomePageBO();
//        loginPageBO = new LoginPageBO();
//        userHomePageBO = new UserHomePageBO();
//        profilePageBO = new ProfilePageBO();
//        optionsPageBO = new OptionsPageBO();
//        friendPageBO = new FriendPageBO();
//        imagePageBO = new ImagePageBO();
//    }
//
//    @Test
//    public void login() {
//        //logIn
//        homePageBO.clickLogInTab();
//        loginPageBO.fillUsername(FIRST_LOGIN);
//        loginPageBO.fillPassword(PASSWORD);
//        loginPageBO.clickLogIn();
//        loginPageBO.waitForUrl(INSTAGRAM_REACTIVATED);
//        loginPageBO.loadPage(WEBSITE_PATH);
//        //NavigateToFriendPage
//        userHomePageBO.enterUserNameForSearch("zbsk.citizen");
//        userHomePageBO.openFriendPage("zbsk.citizen");
//        //Setup like
//        friendPageBO.openFirstImage();
//
//        try {
//            while (imagePageBO.checkNextImageButton()) {
//                imagePageBO.clickLike();
//                imagePageBO.clickNextImage();
//            }
//        } catch (Exception e) {
////            imagePageBO.clickCloseImage();
//        }
//
//
//        //LogOut
//        userHomePageBO.openProfile();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        profilePageBO.openOptions();
//        optionsPageBO.clickLogOut();
//
//
//    }
//
//    @AfterClass
//    public void tearDown() {
//         DriverManager.removeDriver();
//    }
//
//}
