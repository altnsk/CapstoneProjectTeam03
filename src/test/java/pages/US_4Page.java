package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US_4Page {

    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public US_4Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy (xpath = "(//td/span)[1]")
    public WebElement accountmanagement;

    @FindBy (xpath = "//a[@href='/a3m/']")
    public WebElement businessOwner;

    @FindBy (xpath = "//button[@class=\"btn btn-ghost-dark rounded-circle\"]")
    public WebElement btn;

    @FindBy (id="email")
    public WebElement email;

    @FindBy(id="changePasswordButton")
    public WebElement changepasword;

    @FindBy(id="newPassword")
    public WebElement newpassword;

    @FindBy(id="newPassword2")
    public WebElement newpassword1;

    @FindBy(xpath =" //button[@class=\"btn btn-dark text-white me-2\"]")
    public WebElement confirm;

    @FindBy(xpath = "//div/div/p")
    private WebElement resultText;

    @FindBy(xpath = "//div[@role='alert']")
    private WebElement errormesage;

    @FindBy(xpath =" //button[@class=\"btn btn-danger text-white me-2\"]")
    private WebElement cancelButton;

    @FindBy(linkText = "gm3wa-a3m-client")
    public WebElement loginButton;


    public void buss(){

        accountmanagement.click();
        businessOwner.click();

    }

    public void edit(){

       btn.click();
    }
    public void verifyemail(){

       Assert.assertFalse(email.isSelected());
    }
    public void newpassword(){

        changepasword.click();

    }
    public void setNewpassword(){
        newpassword.click();
        newpassword.sendKeys("Hacimustafa46.");
        newpassword1.click();
        newpassword1.sendKeys("Hacimustafa46.");
        confirm.click();
        cancelButton.click();
        wait.until(ExpectedConditions.visibilityOf(changepasword));
        changepasword.click();
        newpassword.click();
        newpassword.sendKeys("1WVal0SlYWPd9uz.");
        newpassword1.click();
        newpassword1.sendKeys("1WVal0SlYWPd9uz.");
        confirm.click();
    }
    public void message(){

        wait.until(ExpectedConditions.visibilityOf(resultText));

        Assert.assertTrue(resultText.getText().contains("Change password successfully"));

    }
    public void CancelButton(){
        wait.until(ExpectedConditions.visibilityOf(cancelButton));
        cancelButton.click();

    }
    public void verifyhatamesaji(){
        wait.until(ExpectedConditions.visibilityOf(errormesage));

       Assert.assertTrue(errormesage.getText().contains("Password must"));
    }
public  void loginButton(){

        loginButton.click();
}

}