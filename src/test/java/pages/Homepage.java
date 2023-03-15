package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Homepage {
    public Homepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id="loginButton" )
    public WebElement loginButton;

    @FindBy(id="username" )
    public WebElement username;

    @FindBy(id="passWord" )
    public WebElement password;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement signin;

    @FindBy (xpath = "//span[@class=\"fw-bold\"][1]")
    public WebElement user;

    @FindBy (linkText = "Business Owner")
    public WebElement businessOwner;

    @FindBy (linkText = "Subscriptions")
    public WebElement subscriptions;

    @FindBy (linkText = "Company")
    public WebElement company;

    @FindBy (linkText = "Departments")
    public WebElement departments;

    @FindBy (linkText = "Remote Units")
    public WebElement remoteUnits;

    @FindBy (linkText = "Teams")
    public WebElement teams;


    @FindBy (linkText = "Users")
    public WebElement users;

    @FindBy (linkText = "Roles")
    public WebElement roles;

    @FindBy (linkText = "Logout")
    public WebElement logout;

    @FindBy (linkText = "Account Management")
    public WebElement accountmanagement;

    public void login(){

        loginButton.click();
        username.sendKeys("group3@test.com");
        password.sendKeys("1WVal0SlYWPd9uz.");
        signin.click();
    }

    public void logout(){
        user.click();
        logout.click();

    }





}