package casestudy.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.List;
import java.util.Set;

public class Helper {
    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void switchTab(){
        Set<String> windowAllWindows = Driver.get().getWindowHandles();
        for (String window:windowAllWindows){
            Driver.get().switchTo().window(window);
        }
    }

    public static void addTwoDifferentProducts(String element){
        List<WebElement> elements = Driver.get().findElements(By.cssSelector(element));

        for(WebElement e : elements) {
            e.click();
            Driver.get().findElement(By.cssSelector(".checkoutui-Modal-iHhyy79iR28NvF33vKJb")).click();
        }
    }

    public static String getProductNameInBasket(){
        List<WebElement> productTitles = Driver.get().findElements(By.cssSelector(".product_name_3Lh3t"));

        return  productTitles.get(1).getText();
    }

}
