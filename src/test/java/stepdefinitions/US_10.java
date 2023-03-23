package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Homepage;
import pages.RemoteUnits;
import utilities.Driver;



public class US_10 {
    RemoteUnits ru = new RemoteUnits();
    Homepage hp = new Homepage();
    @Given("Kullanici siteye login olur")
    public void kullanici_siteye_login_olur() {
        Driver.getDriver().get("https://qa-gm3.quaspareparts.com/");

        hp.login();
        ru.login2.click();
    }

    @When("Kullanici  Business Owner a tiklar")
    public void kullanici_business_owner_a_tiklar() {

        hp.user.click();
    }

    @When("Kullanici  Account Management a tiklar")
    public void kullanici_account_management_a_tiklar() {

        hp.accountmanagement.click();
    }

    @When("Kullanici  Remote Unit a tiklar")
    public void kullanici_remote_unit_a_tiklar()  {

        hp.remoteUnits.click();

    }

    @Then("Listenin goruntulendigini check eder")
    public void listenin_goruntulendigini_check_eder() {

        System.out.println(ru.displayed.getText());
        Assert.assertTrue(ru.displayed.isDisplayed());

    }

}
