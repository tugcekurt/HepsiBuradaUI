package StepDefinition;

import cucumber.TestContext;
import org.junit.Assert;
import pageObject.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddBookTestSteps {


    TestContext testContext;
    HomePage homePage;
    LoginPage loginPage;
    ProductDetailPage productDetailPage;
    BasketPage basketPage;
    DeliveryPage deliveryPage;
    PaymentPage paymentPage;

    private String productTitle;

    public AddBookTestSteps(TestContext context)
    {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
        loginPage= testContext.getPageObjectManager().GetLoginPage();
        productDetailPage=testContext.getPageObjectManager().GetproductDetailPage();
        basketPage=testContext.getPageObjectManager().GetBasketPage();
        deliveryPage=testContext.getPageObjectManager().GetDeliveryPage();
        paymentPage=testContext.getPageObjectManager().GetpaymentPage();
    }

    @Given("user is on HomePage")
    public void GoToHomePage()
    {
        homePage.NavigateHomePage();
    }

    @When("user click Login button")
    public  void Login()
    {
        homePage.Login();
    }

    @And("user enter email {string} and enter  password {string}")
    public void EnterEmailAndPassword(String email,String password)
    {
        loginPage.EnterEmailAndPassword(email,password);
    }

    @And("user click GirisYap button")
    public void ClickGirisYapButton()
    {
        loginPage.ClickGirisButton();
    }

    @When("user search {string} on searchbox")
    public void SearchBook(String product)
    {
        homePage.SearchProduct(product);
    }

    @Then("user check books are listed")
    public void CheckListedProduct()
    {
        //TO DO
    }

    @When("user select any book on list")
    public void SelectProduct()
    {
        productTitle=  homePage.ClickFirstProductOnList();
    }

    @Then("user seen productDetail")
    public void CheckProductDetailPage()
    {
        String productDetailTitle=productDetailPage.GetProductTitle();

        Assert.assertEquals(productDetailTitle.toLowerCase(),productTitle.toLowerCase());
    }


    @When("user click SepeteEkle button and go to Sepetim")
    public void UserAddProductInBasket() {

        productDetailPage.ClickSepeteEkleButton();
        productDetailPage.ClickSepetimButton();


    }

    @Then("user seen product in basket")
    public void userSeenProductInBasket() {
        Assert.assertEquals(basketPage.GetPageTitle().toLowerCase(),"Sepetim".toLowerCase());
        Assert.assertEquals(basketPage.GetProductTitle().toLowerCase(),productTitle.toLowerCase());
    }

    @When("user click Alısverisi Tamamla button")
    public void userClickAlısverisiTamamlaButton() {
        basketPage.AlısverisiTamamlaButton();
    }

    @Then("user seen  Delivery Page")
    public void CheckDeliveryPage() {
        Assert.assertEquals(deliveryPage.GetHeaderTitle().toLowerCase(),"Teslimat Bilgileri".toLowerCase());

    }

    @When("user click DevamEt button")
    public void userClickDevamEtButton() {
        deliveryPage.ClickDevamEtButton();
    }

    @Then("user seen PaymentPage")
    public void userSeenPaymentPage() {
        Assert.assertEquals( paymentPage.GetPageTitle().toLowerCase(),"Ödeme yöntemi seçiniz".toLowerCase());
    }

    @When("user click Havale")
    public void SelectPaymentType() {

        paymentPage.SelectHavale();
    }



    @And("user select bank and click DevamEt button")
    public void SelectBank() {

        paymentPage.SelectFirstBank();
        paymentPage.ClickDevamEtButton();
    }

    @And("user select sipais sonrası odeme option")
    public void SelectPaymentTimeIban() {

        paymentPage.SelectSıparisSonrasıOdeme();
    }
}
