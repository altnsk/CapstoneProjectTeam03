package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Homepage;
import pages.Teams;
import utilities.Driver;

import java.time.Duration;

public class teams {
    Homepage hp= new Homepage();
    Teams tm=new Teams();
    @Given("Kullanıcı qa sayfasındadır.")
    public void kullanıcıQaSayfasındadır() {
        Driver.getDriver().get("https://qa-gm3.quaspareparts.com/");
    }
    @When("Kullanici login olur.")
    public void kullaniciLoginOlur() {
        hp.login();
    }

    @And ("Kullanici account management sayfasina gider.")
    public void kullaniciAccountManagementSayfasinaGider(){
       hp.user.click();
       hp.accountmanagement.click();
    }
    @And("Kullanici sayfadaki Teams butonuna tiklar")
    public void kullaniciSayfadakiTeamsButonunaTiklar() {
        hp.teams.click();
    }
    @When("Kullanici ilk tiklanabilir takıma tiklar")
    public void kullaniciIlkTiklanabilirTakımaTiklar() {
        tm.clicktheFirstTeam();
    }
    @When("Kullanici sayfanin sag bolumundeki Edit Team butonuna tiklar")
    public void kullaniciSayfaninSagBolumundekiEditTeamButonunaTiklar() {
        tm.clickEditandAddTeamButton();
    }
    @Then("Kullanici takim bilgilerindeki değisiklikleri goruntuler")
    public void kullaniciTakimBilgilerindekiDeğisiklikleriGoruntuler() {
        tm.CheckingEditingTeamInfo();
    }
    @When("Kullanici sayfanin sol kismindaki Delete Department butonuna tiklar.")
    public void kullaniciSayfaninSolKismindakiDeleteDepartmentButonunaTiklar() {
        tm.DeleteDepartmentButton.click();
    }
    @When("Kullanici sayfada  goruntulenen Alert Mesajinda Tamam butonuna tiklar.")
    public void kullaniciSayfadaGoruntulenenAlertMesajindaTamamButonunaTiklar() {
        tm.sayOkfortheAlertMessage();
    }
    @Then("Kullanici sildiği takimin sayfada bulunmadiğini görüntüler.")
    public void kullaniciSildiğiTakiminSayfadaBulunmadiğiniGörüntüler() {
        tm.checkingtheDeletedTeam();
    }
    @Then("Kullanıcının takımları görüntülediği doğrulanır")
    public void kullanıcınınTakımlarıGörüntülediğiDoğrulanır() {
        tm.listAssert();
    }
    @Then("Kullanıcı tıkladığı takımın bilgilerini detaylı olarak görür")
    public void kullanıcıTıkladığıTakımınBilgileriniDetaylıOlarakGörür() {
        tm.clickableTeamInfoAssert();
    }
    @Then("Kullanıcı eklediği takımın listelenen takımlar arasında bulunduğunu görür")
    public void kullanıcıEklediğiTakımınListelenenTakımlarArasındaBulunduğunuGörür() {
        tm.CheckingAddingNewTeamINfo();
    }
    @When("Kullanıcı sayfada sağ üstte bulunan Add New Team butonuna tıklar")
    public void kullanıcıSayfadaSağÜstteBulunanAddNewTeamButonunaTıklar() {
        tm.EditAndAddTeamsButton.click();
    }
    @And("Kullanıcı çıkan sayfadaki boşluklara takım bilgilerini girer ve Save butonuna tıklar")
    public void kullanıcıÇıkanSayfadakiBoşluklaraTakımBilgileriniGirerVeSaveButonunaTıklar() {
        tm.inputInfoOfTeams();
    }
}
