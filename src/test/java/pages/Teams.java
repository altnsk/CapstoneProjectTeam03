package pages;

import junit.framework.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;
import java.util.List;
public class Teams {
    WebDriver driver;
    public Teams() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//button[@class='btn btn-info float-end text-white']")
    public WebElement EditAndAddTeamsButton;
    @FindBy (xpath = "//button[@class='btn btn-danger text-light fw-bold']")
    public WebElement DeleteDepartmentButton;
    @FindBy (xpath ="//input[@id='name']")
    public WebElement DepartmentNameInput;
    @FindBy (xpath =" //input[@name='short_name']")
    public WebElement ShortNameInput;
    @FindBy(xpath=("//input[@id='react-select-2-input']"))
    public WebElement DropDownDepartmentType;
    @FindBy(xpath=("//input[@id='react-select-3-input']"))
    public WebElement DropDownRoles;
    @FindBy(xpath=("(//input[@class='form-control fw-bold'])[3]"))
    public WebElement DescriptionDepartment;
    @FindBy(xpath="//div[@class='col-9']//a")
    public List<WebElement> allCreatedTeams;
    @FindBy(xpath="//div[@class='row mt-2 mb-2']")
    public WebElement teamDepartment;
    @FindBy(xpath ="//div[@class='row mt-4 mb-4']")
    public WebElement teamname;
    @FindBy(xpath ="//label[@id='name']")
    public WebElement teamNameforAssertion;

    public void clickEditandAddTeamButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(EditAndAddTeamsButton));
        EditAndAddTeamsButton.click();
    }

    public void inputInfoOfTeams (){
        DepartmentNameInput.sendKeys("Team0003");
        ShortNameInput.sendKeys("Tm0003");
        DescriptionDepartment.sendKeys("Capstone Project");
        DropDownDepartmentType.sendKeys("Team"+Keys.ENTER);
        DropDownRoles.sendKeys("Quality Manager"+Keys.ENTER+Keys.ESCAPE+Keys.TAB+Keys.ENTER);
    }
    public void CheckingAddingNewTeamINfo(){
        String teamNames = " ";
        for (WebElement teamName : allCreatedTeams) {
            if (teamName.getText().length() > 0){
                teamNames+=teamName.getText();
            }
        }
        System.out.println("team Names="+teamNames);
        Assert.assertTrue(teamNames.contains("Team0003"));
    }
    public void CheckingEditingTeamInfo(){
        System.out.println(teamNameforAssertion.getText());
        Assert.assertTrue(teamNameforAssertion.getText().contains("Team0003"));
    }
    public void sayOkfortheAlertMessage (){
        driver.switchTo().alert().accept();
    }
    String theFirstTeamName;
    public void clicktheFirstTeam(){
        for (WebElement teamName : allCreatedTeams) {
            if (teamName.getText().length() > 0){
                theFirstTeamName = teamName.getText();
                System.out.println("Seçilen Takım= "+theFirstTeamName);
                teamName.click();
                break;
            }
        }
    }
    public void checkingtheDeletedTeam(){
        for (WebElement teamName : allCreatedTeams) {
            if (teamName.getText().length() > 0){
                System.out.println(teamName.getText());
                Assert.assertFalse(teamName.getText().contains(theFirstTeamName));
            }
        }
    }
    public void listAssert(){
        System.out.println(teamname.getText());
       Assert.assertTrue(teamname.isDisplayed());
    }
    public void clickableTeamInfoAssert(){
        Assert.assertTrue(teamDepartment.getText().contains("Department"));
    }
}
