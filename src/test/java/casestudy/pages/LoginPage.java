package casestudy.pages;

import casestudy.utils.Driver;
import casestudy.utils.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (css="button#btnGoogle")
    public WebElement googleButton;
    @FindBy (css="#identifierId")
    public WebElement emailInput;
    @FindBy (css="#password input")
    public WebElement passInput;
    @FindBy (css="#identifierNext")
    public WebElement continueEmailButton;
    @FindBy (css="#passwordNext")
    public WebElement continuePassButton;
    @FindBy (css="#onetrust-accept-btn-handler")
    public WebElement agreeButton;


    public void loginWithGoogle() {
        Log.info("Login with google");
        googleButton.click();
        emailInput.click();
        emailInput.sendKeys("testaysenurkaynar@gmail.com");
        continueEmailButton.click();
        passInput.click();
        passInput.sendKeys("Aysenur123!");
        continuePassButton.click();
    }
}