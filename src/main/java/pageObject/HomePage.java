package pageObject;

import Managers.FileReadManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    String url= FileReadManager.getInstance().getConfigReader().getApplicationUrl();

    @FindBy(how = How.ID, using = "myAccount")
    private WebElement btn_GirisYap;

    @FindBy(how = How.ID, using = "login")
    private WebElement btn_GirisYapOnMenu;

    @FindBy(how = How.XPATH, using = "//*[@id='SearchBoxOld']//input")
    private WebElement input_searchBox;

    @FindBy(how = How.XPATH, using = "//*[@id='productresults']//ul[@class='product-list results-container do-flex list']//li//a")
    private List<WebElement> productList;


    public  void NavigateHomePage()
    {
       // driver.navigate().to("https://www.hepsiburada.com/uyelik/cikis?ReturnUrl=%2F");
        driver.navigate().to(url);
        WebDriverWait wait = new WebDriverWait(driver, 3);
    }

   public void ClickGirisYapButton()
   {
       btn_GirisYap.click();

   }

   public void SelectGirisYapButtonOnMenu()
   {
       btn_GirisYapOnMenu.click();
   }

   public void Login()
   {
       ClickGirisYapButton();
       SelectGirisYapButtonOnMenu();
   }
   public void SearchProduct(String productName)
   {
       input_searchBox.sendKeys(productName);
       input_searchBox.sendKeys(Keys.ENTER);

       WebDriverWait wait = new WebDriverWait(driver, 3);
   }

   public String ClickFirstProductOnList()
   {
      String productTitle=null;
       for (WebElement imgproduct : productList) {

           imgproduct.click();
           productTitle=imgproduct.getText();
           break;

       }

       return  productTitle;
   }
}
