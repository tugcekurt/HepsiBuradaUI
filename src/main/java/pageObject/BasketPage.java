package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {
    WebDriver driver;

    public BasketPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy(how = How.XPATH, using = "//*[@id='cart-container']/section//header/h1")
    private WebElement pageTitle;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Alışverişi Tamamla')]")
    private WebElement btn_AlısverisiTamamla;
    @FindBy(how = How.XPATH, using = "//*[@id='form-item-list']//h4[@class='product-name']")
    private WebElement productTitle;


    public void AlısverisiTamamlaButton()
    {
        btn_AlısverisiTamamla.click();
    }

    public String GetPageTitle()
    {
        return pageTitle.getText();
    }

    public String GetProductTitle()
    {
        return productTitle.getText();
    }
}
