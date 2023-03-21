package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RemoteUnits;

import java.awt.*;
import java.awt.event.KeyEvent;


public class US_12 {


    RemoteUnits remote = new RemoteUnits();


    @Given("Kullanici ayni adimlari yaparak remote sayfasina gelir")
    public void kullanici_ayni_adimlari_yaparak_remote_sayfasina_gelir() {
         remote.samesteps();

    }

    @When("Listelenenlerden ilkine tiklar")
    public void listelenenlerden_ilkine_tiklar() throws InterruptedException {

        remote.id.click();
        Thread.sleep(6000);
    }
    @When("Edit Remote Unit e tiklar")
    public void edit_remote_unit_e_tiklar()  {
        remote.edit.click();
    }
    @When("Delete Department a tiklar")
    public void delete_department_a_tiklar()  {
      remote.delete.click();

    }
    @Then("Cikan pop up i onaylar")
    public void cikan_pop_up_i_onaylar() throws AWTException  {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }
}
