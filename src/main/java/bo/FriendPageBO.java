package bo;

import org.openqa.selenium.JavascriptExecutor;
import page.FriendPage;

public class FriendPageBO {

    private FriendPage friendPage = new FriendPage();

    public void openFirstImage() {
        JavascriptExecutor executor = (JavascriptExecutor) friendPage.getDriver();
        executor.executeScript("arguments[0].click();", friendPage.getFirstImage().getWebElement());
    }

}
