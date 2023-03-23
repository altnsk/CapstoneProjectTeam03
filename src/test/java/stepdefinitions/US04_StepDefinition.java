package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Homepage;
import pages.US04_HomePage;
import utilities.Driver;


public class US04_StepDefinition {
    WebDriver driver;
    Homepage us04=new Homepage(Driver.getDriver());
    US04_HomePage us004=new US04_HomePage(Driver.getDriver());

    @Given("Kullanici Url ve login olur Account management tıklar")
    public void kullaniciUrlVeLoginOlurAccountManagementTıklar() {
        Driver.getDriver().get("https://qa-gm3.quaspareparts.com/");
        us04.login();
        us004.loginButton();
        us004.buss();
    }


    @Given("açılan sayfada edit e tıklar")
    public void açılanSayfadaEditETıklar() {

        us004.edit();
    }

    @When("e-mail kısmının değişmediğni doğrular")
    public void eMailKısmınınDeğişmediğniDoğrular() {
    us004.verifyemail();

    }

    @Then ("logout olur")
    public void logoutOlur() {
       Driver.closeDriver();

    }


    @Given("açılan sayfada Change Password")
    public void açılanSayfadaChangePassword() {

        us004.changepasword.click();
    }

    @When("kriterlere uygun password girer  confirm tusuna basar")
    public void kriterlereUygunPasswordGirerConfirmTusunaBasar() {
        us004.setNewpassword();


    }

    @Then("parolanın değiştiğini doğrular")
    public void parolanınDeğiştiğiniDoğrular() {
       us004.message();
       Driver.closeDriver();
    }


//seneryo outline
    @Given("kullanıcı cahange pasword tıklar")
    public void kullanıcıCahangePaswordTıklar() {
        us004.changepasword.click();

    }

    @And("kullanıcı {string},{string} girer")
    public void kullanıcıGirer(String arg0, String arg1) {
        us004.newpassword.click();
        us004.newpassword.sendKeys(arg0);
        us004.newpassword1.click();
        us004.newpassword1.sendKeys(arg1);
    }

    @And("confirm butonuna tıklar")
    public void confirmButonunaTıklar() throws InterruptedException {

        us004.confirm.click();

    }



   @Then("parolanın değişmediğini  dogrular cancel butonuna tıklar")
    public void parolanınDeğişmediğiniDogrularCancelButonunaTıklar() {
        //us004.CancelButton();
        us004.verifyhatamesaji();
        Driver.closeDriver();
   }
}
