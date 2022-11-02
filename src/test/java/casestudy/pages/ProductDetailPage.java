package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
    public ProductDetailPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void goToProductPage() {
        Helper.switchTab();
        Helper.yetisYaAli("#tabMerchant .add-to-basket.button");
        Helper.waitFor(10);

    }
}