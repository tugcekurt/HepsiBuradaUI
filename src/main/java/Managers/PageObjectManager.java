package Managers;

import org.openqa.selenium.WebDriver;
import pageObject.*;


public class PageObjectManager {


    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private DeliveryPage deliveryPage;
    private BasketPage basketPage;
    private ProductDetailPage productDetailPage;
    private  PaymentPage paymentPage;

    public PageObjectManager(WebDriver  driver) {

        this.driver = driver;

    }

    public HomePage getHomePage(){

        return (homePage == null) ? homePage = new HomePage(driver) : homePage;

    }


    public LoginPage GetLoginPage(){

        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;

    }

    public DeliveryPage GetDeliveryPage(){

        return (deliveryPage == null) ? deliveryPage = new DeliveryPage(driver) : deliveryPage;

    }

    public BasketPage GetBasketPage(){

        return (basketPage == null) ? basketPage = new BasketPage(driver) : basketPage;

    }

    public ProductDetailPage GetproductDetailPage(){

        return (productDetailPage == null) ? productDetailPage = new ProductDetailPage(driver) : productDetailPage;

    }
    public PaymentPage GetpaymentPage(){

        return (paymentPage == null) ? paymentPage = new PaymentPage(driver) : paymentPage;

    }


}
