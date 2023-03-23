package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.Homepage;
import pages.RemoteUnits;
import utilities.Driver;

import java.awt.*;
import java.awt.event.KeyEvent;


public class US_12 {


    RemoteUnits remote = new RemoteUnits();
    Homepage hp= new Homepage();

    @Given("Kullanici ayni adimlari yaparak remote sayfasina gelir")
    public void kullanici_ayni_adimlari_yaparak_remote_sayfasina_gelir() {
        remote.samesteps();
    }

    @When("Listelenenlerden ilkine tiklar")
    public void listelenenlerden_ilkine_tiklar()  {
        RemoteUnits.waitForClickabilty(hp.remoteUnits,5000);
        remote.id.click();


    }
    @When("Edit Remote Unit e tiklar")
    public void edit_remote_unit_e_tiklar()  {
        RemoteUnits.waitForClickabilty(remote.edit,5000);
        remote.edit.click();
    }
    @When("Delete Department a tiklar")
    public void delete_department_a_tiklar() throws InterruptedException {
        RemoteUnits.waitForClickabilty(remote.delete,10000);
        remote.delete.click();


    }
    @Then("Cikan pop up i onaylar")
    public void cikan_pop_up_i_onaylar() throws AWTException  {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);



    }
}
