package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class DepartmanProcess {

    public DepartmanProcess () {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(linkText = "gm3wa-a3m-client")
    public WebElement loginTwo;
    @FindBy (xpath = "//div[@class='card shadow rounded-15 mb-5'] ")
    public List<WebElement> departmanGoruntuler;
    @FindBy(xpath = "//button[@class='btn btn-info float-end text-white']")
    public WebElement addNewButton;

    @FindBy(id="name")
    public WebElement departmentName;

    @FindBy (id = "react-select-2-placeholder")
    public  WebElement departmentType;

    @FindBy(xpath = "//button[@class='btn btn-info text-white px-3']")
    public WebElement saveButton;

    @FindBy(id="search")
    public WebElement search;

    @FindBy(xpath = "//div[@class='card shadow rounded-15 mb-5']")
    public WebElement aassss;

    @FindBy(xpath = "//span[@class='text-danger']")
    public WebElement dogrulamaYazisi;

    @FindBy(xpath = "(//div[@class='card shadow rounded-15 mb-5'])[3]")
     public WebElement departmanSec;

    @FindBy(xpath = "//button[@class='btn btn-info float-end text-white']")
      public WebElement edit;

    @FindBy(xpath = "//div[@class='card shadow rounded-15 mb-5']")
     public WebElement degisenName;

    @FindBy(xpath = "//button[@class='btn btn-danger text-light fw-bold']")
      public WebElement delete;




    Actions actions=new Actions(Driver.getDriver());
    public void departmantTypeSec() {
        actions.click(departmentType).sendKeys("Department").sendKeys(Keys.ENTER).perform();
    }


    public void departmentSearch(){
    actions.click(search).sendKeys("team3").perform();
    }
    public void departmanSec(){

        actions.click(departmanSec).perform();
    }

    public void nameSearch(){

        actions.click(search).sendKeys("team3").perform();
    }


    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
       String target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
      //  String target = System.getProperty("user.dir") + ".\\test-output\\Screenshots\\" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }


}
