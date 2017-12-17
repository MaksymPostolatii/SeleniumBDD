package bo;

import page.ImagePage;

public class ImagePageBO {

    private ImagePage imagePage = new ImagePage();

    public void clickLike() {
        imagePage.clickLike();
    }

    public void clickNextImage() {
        imagePage.clickNextImage();
    }

    public void clickCloseImage() {
        imagePage.clickCloseImage();
    }

    public Boolean checkNextImageButton() {
        return imagePage.checkNextImageButton();
    }

}
