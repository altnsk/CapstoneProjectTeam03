package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.io.PushbackInputStream;
import java.util.List;

public class UserModuleProcess {

    public UserModuleProcess(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href=\"#/user/215\"])[2]")
    public  WebElement userRow;

    @FindBy(xpath = "//div[@class=\"avatar bg-info me-2 text-white\"]")
    public List<WebElement> allUser;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[3]/div/table/tbody//td[2]/a")
    public List<WebElement>allUsername;

    @FindBy(linkText= "admin45")
    public WebElement firstUser;


    @FindBy(xpath = "//span[@class=\"float-end ms-2\"]")
    public WebElement editButton;

    @FindBy (xpath = "//input[@placeholder=\"Username\"]")
    public WebElement userName;

     @FindBy(xpath = "//button[@class=\"btn btn-ghost-primary rounded-circle\"]")
     public WebElement okButton;

    @FindBy(linkText = "Username cannot be empty")
    public WebElement empty;

    @FindBy (name = "email")
    public WebElement email;

    @FindBy (xpath = "//img[@class=\"ms-2\"]")
    public WebElement addRoleButton;

    @FindBy(xpath = "//span[@class=\"active-roles-box\"]")
    public WebElement activeRole;

    @FindBy (xpath = "//span[@class=\"active-roles-box\"]")
    public WebElement defoultRole;

    @FindBy (id="react-select-5-placeholder")
    public WebElement selectMenu;

    @FindBy(linkText = "Save")
    public WebElement saveButton;

    @FindBy(linkText = "Purchase Manager")
    public WebElement purchaseManager;

    @FindBy (id = "changePasswordButton")
    public WebElement resetPasswordButton;

    @FindBy(linkText = "Confirm")
    public WebElement confirmButton;

    @FindBy (xpath = "//button[@class=\"btn btn-transparent p-0\"]")
    public List<WebElement> cahangeButton;

    @FindBy (xpath = "//*[@fill=\"#08875D\"]")
    public List<WebElement> tick;




    public void selectRole(){
        addRoleButton.click();
        Select select=new Select(selectMenu);
        select.selectByVisibleText("Purchase Manager");
        saveButton.click();
        Assert.assertTrue(purchaseManager.isDisplayed());

    }

    public void assertGreenTick() throws InterruptedException {

        Actions act=new Actions(Driver.getDriver());
        Thread.sleep(2000);

        act.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        for (int i = 0; i < tick.size(); i++) {
            Assert.assertTrue(tick.get(i).isDisplayed());}


    }

    public void EmptyUserNameAssertion() throws InterruptedException {





        Thread.sleep(5000);

       /* userName.sendKeys("        ");
        Thread.sleep(3000);
        okButton.click();
        Thread.sleep(3000);
        Assert.assertTrue(userName.getText().equals(""));*/
    }


    public void assertDefoultRole() throws InterruptedException {

        Actions act=new Actions(Driver.getDriver());
        act.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        act.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        //uM.activeRole.click();

        Assert.assertFalse(activeRole.isSelected());
    }





}
