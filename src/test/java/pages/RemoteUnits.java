package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class RemoteUnits {

    public RemoteUnits(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "gm3wa-a3m-client")
    public WebElement login2;
    @FindBy (xpath = "(//div[@class='card shadow rounded-15 mb-5'])[4]")
    public WebElement displayed;
    @FindBy (xpath = "//button[@class='btn btn-info float-end text-white']")
    public WebElement ekle;

    @FindBy (id = "name")
    public  WebElement name;

    @FindBy (xpath = "(//input[@class='form-control fw-bold'])[3]")
    public  WebElement description;
    @FindBy (xpath = "//button[@class='btn btn-info text-white px-3']")
    public  WebElement save;


    @FindBy (xpath = "(//div[@class=' css-1xc3v61-indicatorContainer'])[1]")
    public  WebElement cubuk;



    @FindBy (id = "react-select-2-listbox")
    public  WebElement departmenttype;

    @FindBy(xpath = " //div[text() ='alperen35']")
    public WebElement alperen35;

    @FindBy(xpath = "//button[@class='btn btn-info float-end text-white']")
    public WebElement edit;

    @FindBy(linkText = "001010")
    public WebElement id;

    @FindBy(xpath = "//button[@class='btn btn-danger text-light fw-bold']")
    public  WebElement delete;

    public static WebElement waitForClickabilty(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void samesteps(){
        Homepage hp = new Homepage();
        RemoteUnits ru = new RemoteUnits();
        Driver.getDriver().get("https://qa-gm3.quaspareparts.com/");
        hp.login();
        ru.login2.click();
        hp.user.click();
        hp.accountmanagement.click();
        RemoteUnits.waitForClickabilty(hp.remoteUnits, 5000);
        hp.remoteUnits.click();


    }
}
