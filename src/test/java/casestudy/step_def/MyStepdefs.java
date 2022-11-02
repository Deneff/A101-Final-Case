package casestudy.step_def;

import casestudy.pages.LoginPage;
import casestudy.pages.ProductDetailPage;
import casestudy.pages.ProductListPage;
import casestudy.utils.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import casestudy.pages.HomePage;
import casestudy.utils.Driver;

public class MyStepdefs {
    HomePage homepage = new HomePage();
    LoginPage loginpage  = new LoginPage();
    ProductListPage productlistpage = new ProductListPage();

    ProductDetailPage productdetailpage = new ProductDetailPage();
    @Given("homepage is open")
    public void homepageIsOpen() {
        homepage.verifyHomePage();
    }

    @When("I login with facebook")
    public void iLoginWithFacebook() {
        homepage.goToLoginPage();
        loginpage.loginWithFacebook();

    }

    @Then("I verify logged in on hb homepage")
    public void iVerifyLoggedInOnHbHomepage() {
        homepage.verifyILoggedIn();
    }

    @And("I search with {string}")
    public void iSearchWith(String keyword) {
        homepage.searchWithKeyword(keyword);
    }

    @Then("I go to any product detail page")
    public void iGoToAnyProductDetailPage() {
        productlistpage.goToProductPage();

    }

    @And("I add basket product with two different seller")
    public void iAddBasketProductWithTwoDifferentSeller() {
        productdetailpage.goToProductPage();


    }

    @Then("I verify product on basket page")
    public void iVerifyProductOnBasketPage() {
    }
}
