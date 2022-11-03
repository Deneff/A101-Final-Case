package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {
    public ProductListPage() {
        PageFactory.initElements(Driver.get(), this);
    }
   @FindBy (css="#i1")
   public WebElement productCard;

    public void goToProductPage() {
        productCard.click();
        Helper.waitFor(5);

    }
}