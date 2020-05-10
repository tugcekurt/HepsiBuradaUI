package pageObject;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "email")
    private WebElement input_email;

    @FindBy(how = How.ID, using = "password")
    private WebElement input_password;


    @FindBy(how = How.XPATH, using = "//*[@id='form-login']//button[contains(text(),'Giriş')]")
    private WebElement btn_giris;

    public void EnterEmailAndPassword(String email,String password)
    {

        WebDriverWait wait = new WebDriverWait(driver, 3);

        wait.ignoring(StaleElementReferenceException.class).until((ExpectedConditions.elementToBeClickable(input_password)));
        input_email.sendKeys(email);
        input_password.sendKeys(password);



    }

    public  void ClickGirisButton()
    {
        btn_giris.click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait = new WebDriverWait(driver, 3);
    }
}
