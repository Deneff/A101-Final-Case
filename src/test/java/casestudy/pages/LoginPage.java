package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (css="button#btnFacebook")
    public WebElement facebookButton;
    @FindBy (css="#email")
    public WebElement emailInput;
    @FindBy (css="#pass")
    public WebElement passInput;
    @FindBy (css="#loginbutton")
    public WebElement loginButton;
    @FindBy (css="#onetrust-accept-btn-handler")
    public WebElement agreeButton;


    public void loginWithFacebook() {
        agreeButton.click();
        Helper.waitFor(2);
        facebookButton.click();
        emailInput.click();
        emailInput.sendKeys("aysnrkynr19@hotmail.com");
        passInput.click();
        passInput.sendKeys("Aysenur5288.");
        loginButton.click();
    }
}