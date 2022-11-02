package casestudy.pages;

import casestudy.utils.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import casestudy.utils.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(css = "a[title='Hepsiburada']")
    public WebElement hbLogo;

    @FindBy(css = "#myAccount")
    public WebElement accountButton;

    @FindBy(css="#login")
    public WebElement loginButton;

    @FindBy(css="a[title='Hesabım']")
    public WebElement accountTitle;

    @FindBy(css=".SearchBoxOld-sfMlfEXVp4n_X7Z5DwbW")
    public WebElement searchBox;

    public void verifyHomePage() {
        hbLogo.click();
    }

    public void goToLoginPage() {
        accountButton.click();
        loginButton.click();
    }

    public void verifyILoggedIn() {
     accountTitle.isDisplayed();
    }

    public void searchWithKeyword(String keyword) {
        searchBox.click();
        searchBox.sendKeys(keyword);
        searchBox.sendKeys(Keys.RETURN);
        Helper.waitFor(10);
    }
}