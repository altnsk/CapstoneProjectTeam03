package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;
import pages.RemoteUnits;
import utilities.Driver;

public class US_11 {
    Homepage hp = new Homepage();
    RemoteUnits ru= new RemoteUnits();

    @Given("Kullanici siteye loginn olur")
    public void kullanici_siteye_loginn_olur() {
        Driver.getDriver().get("https://qa-gm3.quaspareparts.com/");
        hp.login();
        ru.login2.click();
    }

    @When("Kullanici  Business Owner e tiklar")
    public void kullanici_business_owner_e_tiklar() {
        hp.user.click();
    }

    @When("Kullanici  Account Management e tiklar")
    public void kullanici_account_management_e_tiklar() {
        hp.accountmanagement.click();
    }

    @When("Kullanici  Remote Unit e tiklar")
    public void kullanici_remote_unit_e_tiklar()  {
        hp.remoteUnits.click();


    }

    @When("Add New Remote Unite tiklar")
    public void add_new_remote_unite_tiklar()  {
        ru.ekle.click();


    }

    @When("Isim ve departman girer")
    public void isim_ve_departman_girer() {
        ru.save.click();
        ru.name.sendKeys("001010");
        ru.description.sendKeys("alperen35");
        ru.cubuk.click();
        ru.departmenttype.click();
        ru.save.click();


    }

    @Then("Kayit edildigini check eder")
    public void kayit_edildigini_check_eder() {
        hp.remoteUnits.click();
        RemoteUnits.waitForClickabilty(ru.alperen35,5000);
        ru.alperen35.isDisplayed();
        System.out.println(ru.alperen35.getText());

    }
}