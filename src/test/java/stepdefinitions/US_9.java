package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import pages.DepartmanProcess;
import pages.Homepage;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class US_9 {

    Homepage hp=new Homepage();
    DepartmanProcess dp=new DepartmanProcess();

    @When("Kullanici Departman secer")
    public void kullaniciDepartmanSecer() {

        dp.departmanSec();

    }

    @And("Kullanici Edit Departman butonuna tiklar")
    public void kullaniciEditDepartmanButonunaTiklar()  {
        dp.edit.click();

    }
    @When("Kullanici Departman name degistirir")
    public void kullaniciDepartmanNameDegistirir() {

        dp.departmentName.clear();
        dp.departmentName.sendKeys("team3");

    }


    @Then("Kullanici Departman isminin degistigini dogrular")
    public void kullaniciDepartmanIsmininDegistiginiDogrular() {

        dp.nameSearch();
        Assert.assertTrue(dp.degisenName.isDisplayed());

    }


    @And("Kullanici delete butonunu tiklar")
    public void kullaniciDeleteButonunuTiklar() throws InterruptedException, IOException {

        dp.delete.click();
        DepartmanProcess.getScreenshot("bug");
    }

    @When("Kullanici acilan onay penceresinden tamam butonu tiklanir")
    public void kullaniciAcilanOnayPenceresindenTamamButonuTiklanir() {
    }

    @Then("Kullanici departmanin silindigi dogrular")
    public void kullaniciDepartmaninSilindigiDogrular() {
    }

    public void  screenShot() throws InterruptedException, IOException {
        Thread.sleep(3000);
        File kaynak = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(kaynak, new File("src/test/java/Screenshot_bug"));

    }

}
