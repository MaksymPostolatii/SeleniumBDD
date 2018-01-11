package bo;

import org.openqa.selenium.WebElement;
import page.ImagePage;

public class ImagePageBO {

    private ImagePage imagePage = new ImagePage();

    public void clickLike() {
        imagePage.getLikeButton().click();
    }

    public boolean isPhotoLiked() {
        return imagePage.getLikeButton().getCSSClass().contains("HeartFull");
    }

    public void clickNextImageButton() {
        imagePage.getNextImageButton().stream().findAny().ifPresent(WebElement::click);
    }

    public boolean isNextImageButtonPresent() {
        return imagePage.getNextImageButton().size() > 0;
    }

    public void clickCloseImage() {
        imagePage.getCloseButton().click();
    }

}
