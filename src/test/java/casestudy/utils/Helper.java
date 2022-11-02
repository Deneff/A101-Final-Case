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

    public static void clickWithLinkText(String linkText){
        Driver.get().findElement(By.linkText(linkText)).click();
    }

    public static void switchTab(){
        Set<String> windowAllWindows = Driver.get().getWindowHandles();
        for (String window:windowAllWindows){
            Driver.get().switchTo().window(window);
        }
    }

    public static void yetisYaAli(String abc){
        List<WebElement> elements = Driver.get().findElements(By.id(abc));

        for(WebElement e : elements) {
            e.click();
        }
    }

}
