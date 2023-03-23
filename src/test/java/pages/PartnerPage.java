package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import java.util.List;

public class PartnerPage {
    Homepage homepage=new Homepage();



    WebDriver driver;

    public PartnerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='col-lg-4 col-md-6 col-12 d-grid mb-2']" )
    public List<WebElement> eachrole;


    public void enterroles() {

        homepage.roles.click();
    }


    public void rollergor() {
        System.out.println("AllRoles ");
        System.out.println("***");
        for (WebElement each : eachrole) {
            Assert.assertTrue(each.isDisplayed());


            System.out.println(each.getText());

        }
    }
      public void sitegiris(){
          Driver.getDriver().get("https://qa-gm3.quaspareparts.com/");
        }



public void AllRolles(){
    for (int i = 0; i<eachrole.size(); i++) {

     eachrole.get(i).click();
     Driver.getDriver().navigate().back();


}


}}

















