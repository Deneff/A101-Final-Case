package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {
    public BasketPage() {
        PageFactory.initElements(Driver.get(), this);
    }

   ProductDetailPage pdp = new ProductDetailPage();
   public void verifyProducts(){
       Assert.assertEquals(pdp.productNameText+"Gri",Helper.getProductNameInBasket());
   }
}