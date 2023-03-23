package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.DepartmanProcess;
import pages.Homepage;
import utilities.Driver;

public class US_7 {

    DepartmanProcess dp=new DepartmanProcess();
    Homepage hp=new Homepage();

    @Given("Kullanici URL ye gider")
    public void kullaniciURLYeGider() {

      String  URL="https://qa-gm3.quaspareparts.com";
        Driver.getDriver().get(URL);

    }

    @When("Kullanici login olur")
    public void kullaniciLoginOlur() {

        hp.login();
        dp.loginTwo.click();

    }

    @When("Kullanici Account Management e tiklar")
    public void kullaniciAccountManagementETiklar() {

        hp.user.click();
        hp.accountmanagement.click();
    }

    @When("Kullanici Departman Bolumune gider")
    public void kullaniciDepartmanBolumuneGider() {
        hp.departments.click();
    }

    @Then("Kullanici butun departmanların goruntulendigini kontrol eder")
    public void kullaniciButunDepartmanlarınGoruntulendiginiKontrolEder() {

        for(WebElement e :dp.departmanGoruntuler){
            Assert.assertTrue(e.isDisplayed());
        }
    }


}
