package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DepartmanProcess;
import pages.Homepage;

public class US_8 {

    Homepage hp = new Homepage();
    DepartmanProcess dp = new DepartmanProcess();


    @When("Kullanici Add New Departman butonuna tiklar")
    public void kullaniciAddNewDepartmanButonunaTiklar() {

        dp.addNewButton.click();
    }

    @When("Kullanici Departman name girer")
    public void kullaniciDepartmanNameGirer() {

        dp.departmentName.sendKeys("team3");
    }

    @When("Kullanici Departman type girer")
    public void kullaniciDepartmanTypeGirer() {

        dp.departmantTypeSec();
    }

    @When("Kullanici Save butonuna tiklar")
    public void kullaniciSaveButonunaTiklar() {

        dp.saveButton.click();
        hp.departments.click();
    }

    @Then("Kullanici Departman eklendigini kontrol eder")
    public void kullaniciDepartmanEklendiginiKontrolEder() {
        DepartmanProcess.waitForClickablility(hp.departments,5000);
        dp.departmentSearch();
        Assert.assertTrue(dp.aassss.isDisplayed());
    }


    @Then("Kullanici Please enter a name for department yazisini dogrular")
    public void kullaniciPleaseEnterANameForDepartmentYazisiniDogrular() {
        Assert.assertTrue(dp.dogrulamaYazisi.isDisplayed());
    }

    @When("Kullanici Save butonuna basar")
    public void kullaniciSaveButonunaBasar() {

        dp.saveButton.click();
    }

    @When("Kullanici Departman name bos birakir")
    public void kullaniciDepartmanNameBosBirakir() {

        dp.departmentName.click();
    }

    @Then("Kullanici Please select a type for department yazisini dogrular")
    public void kullaniciPleaseSelectATypeForDepartmentYazisiniDogrular() {
        Assert.assertTrue(dp.dogrulamaYazisi.isDisplayed());

    }

    @When("Kullanici Departman name bosluk karakteri girer")
    public void kullaniciDepartmanNameBoslukKarakteriGirer() {

        dp.departmentName.sendKeys("   ");
    }
}
