package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {


    WebDriver driver;

    public ProductDetailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.ID, using = "addToCart")
    private WebElement btn_SepeteEkle;

@FindBy(how = How.XPATH, using = "//*[@id='productDetailsCarousel']//picture/img")
private WebElement imgProduct;

    @FindBy(how = How.ID, using = "shoppingCart")
    private WebElement btn_Sepetim;
    public void ClickSepeteEkleButton()
    {
        btn_SepeteEkle.click();

    }

    public void ClickSepetimButton()
    {
        btn_Sepetim.click();
    }
    public String GetProductTitle()
    {
       return imgProduct.getText();


    }


}
