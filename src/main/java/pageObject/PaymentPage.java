package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {


    WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Havale')]")
    private WebElement opt_Havale;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Devam Et')]")
    private WebElement btn_DevamEt;

    @FindBy(how = How.XPATH, using = "//*[@class='money-order-banks']//li[1]//input")
    private WebElement radiobtn_banka;

    @FindBy(how = How.XPATH, using = "//*[@id='payment-container']//h1[@class='payment-title']")
    private WebElement pageTitle;
    @FindBy(how = How.XPATH, using = "//div[@class='instant-transfer']//div[@class='eft-button iban-eft']")
    private WebElement btn_SiparisSonrasıOdeme;
    public void SelectHavale()
    {
        opt_Havale.click();
    }

    public void ClickDevamEtButton()
    {
        btn_DevamEt.click();
    }

    public void SelectFirstBank()
    {
        radiobtn_banka.click();
    }

    public String GetPageTitle()
    {
        return  pageTitle.getText();
    }
    public void SelectSıparisSonrasıOdeme()
    {
        btn_SiparisSonrasıOdeme.click();
    }
}
