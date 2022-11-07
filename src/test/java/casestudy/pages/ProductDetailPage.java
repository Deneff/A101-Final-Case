package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import casestudy.utils.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {
    public ProductDetailPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (css="#product-name")
    WebElement productName;

    @FindBy (css="a[href='https://checkout.hepsiburada.com/sepetim']")
    WebElement shoppingCart;
    public static String productNameText = "";
    public void addProductToBasket() {
        Helper.switchTab();
        productNameText = productName.getText();
        Helper.addTwoDifferentProducts(".add-to-basket.button.small");
        Helper.waitFor(1);
        shoppingCart.click();
        Log.info("Added product to basket with two different seller");

    }
}