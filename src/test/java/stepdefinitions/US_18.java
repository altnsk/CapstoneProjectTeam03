package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;
import pages.PartnerPage;
import utilities.Driver;

public class US_18 {
    Homepage homepage=new Homepage();
    PartnerPage partnerPage =new PartnerPage(Driver.getDriver());
    @Given("Kullanici sayfaya gider login olur ve account managementa tiklar")
    public void kullaniciSayfayaGiderLoginOlurVeAccountManagementaTiklar() {

        partnerPage.sitegiris();
       homepage.login();
        homepage.user.click();
       homepage.accountmanagement.click();
    }

    @When("Kullanici rollere tiklar")
    public void kullaniciRollereTiklar() {

        partnerPage.enterroles();

    }

    @Then("Kullanici rolleri gordugunu dogrular")
    public void kullaniciRolleriGordugunuDogrular() {
partnerPage.rollergor();

    }



    }

