package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Homepage;
import pages.PartnerPage;
import utilities.Driver;

import java.util.List;

public class US_19 {
    Homepage homepage = new Homepage();
    PartnerPage partnerPage = new PartnerPage(Driver.getDriver());


    @When("Kullanici rol sekmesine tiklar")
    public void kullaniciRolSekmesineTiklar() {
        partnerPage.enterroles();



        }
        @Then("Kullanici rollerin herbirinin tiklanilabilir oldugunu dogrular")
        public void kullaniciRollerinHerbirininTiklanilabilirOldugunuDogrular () {
partnerPage.AllRolles();

homepage.logout();

        }


    }
