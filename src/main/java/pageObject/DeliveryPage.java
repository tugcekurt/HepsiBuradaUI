package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeliveryPage {

    WebDriver driver;

    public DeliveryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Devam Et')]")
    private WebElement btn_DevamEt;



    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Sipariş sonrası')]")
    private WebElement opt_SiparisSonrasi;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Siparişi Onayla')]")
    private WebElement btn_SiparisiOnayla;

    @FindBy(how = How.ID, using = "gsm-no")
    private WebElement input_gsmNo;


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Kaydet')]")
    private WebElement btn_Kaydet;


    @FindBy(how = How.XPATH, using = "//div[@id='delivery-container']/div/header/h1")
    private WebElement pageHeaderTitle;





    public void ClickDevamEtButton()
    {
        btn_DevamEt.click();
    }




    public void SelectTransferType()
    {
        opt_SiparisSonrasi.click();
    }

    public  void ClickSiparisiOnayla()
    {
        btn_SiparisiOnayla.click();
    }

    public  void EnterPhoneNumber(String number)
    {
        input_gsmNo.sendKeys(number);
    }

    public  void ClickKaydetButton()
    {
        btn_Kaydet.click();
    }

    public String GetHeaderTitle()
    {
        return  pageHeaderTitle.getText();
    }


}
