package casestudy.step_def;

import casestudy.pages.*;
import casestudy.utils.Helper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homepage = new HomePage();
    LoginPage loginpage  = new LoginPage();
    ProductListPage productlistpage = new ProductListPage();
    ProductDetailPage productdetailpage = new ProductDetailPage();


    BasketPage basketpage = new BasketPage();
    @Given("homepage is open")
    public void homepageIsOpen() {
        homepage.verifyHomePage();
    }

    @When("I login with google")
    public void iLoginWithGoogle() {
        homepage.goToLoginPage();
        loginpage.loginWithGoogle();
    }

    @Then("I verify logged in on hb homepage")
    public void iVerifyLoggedInOnHbHomepage() {
        homepage.verifyILoggedIn();
    }

    @And("I search with {string}")
    public void iSearchWith(String keyword) {
        Helper.waitFor(2);
        homepage.searchWithKeyword(keyword);
    }

    @Then("I go to any product detail page")
    public void iGoToAnyProductDetailPage() {
        productlistpage.goToProductPage();

    }

    @And("I add basket product with two different seller")
    public void iAddBasketProductWithTwoDifferentSeller() {
        productdetailpage.addProductToBasket();


    }

    @Then("I verify product on basket page")
    public void iVerifyProductOnBasketPage() {
        basketpage.verifyProducts();
    }
}
