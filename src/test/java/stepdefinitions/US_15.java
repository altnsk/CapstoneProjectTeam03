package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Homepage;
import pages.UserModuleProcess;
import utilities.Driver;

public class US_15 {

    Homepage hP=new Homepage();

    UserModuleProcess uM=new UserModuleProcess();

    @Given("Kullanici Base URL e gider {string}")
    public void kullaniciBaseURLEGider(String URL) {

        URL="https://qa-gm3.quaspareparts.com";
        Driver.getDriver().get(URL);
    }

    @When("Kullanıcı login olur")
    public void kullanıcıLoginOlur() {
        hP.login();

    }

    @And("Kullanici Account Management e Tiklar.")
    public void kullaniciAccountManagementETiklar() {

        hP.user.click();
        hP.accountmanagement.click();
    }


    @Then("Kullanici Users Modul e gider.")
    public void kullaniciUsersModulEGider() {
        hP.users.click();
    }

    @Then("Kullanici yeni eklenen kullanicilarin goruldugunu dogrular.")
    public void kullaniciYeniEklenenKullanicilarinGoruldugunuDogrular() {

        Assert.assertTrue(uM.allUser.get(1).isDisplayed());

        hP.logout();


    }

    @Then("Kullanici,emaili onaylanmis kullanicilarda yesil tik goruldugunu dogrular.")
    public void kullaniciEmailiOnaylanmisKullanicilardaYesilTikGoruldugunuDogrular() throws InterruptedException {


        uM.assertGreenTick();
        Driver.getDriver().quit();

       // Assert.assertEquals(16, uM.tick.size());
    }
}
