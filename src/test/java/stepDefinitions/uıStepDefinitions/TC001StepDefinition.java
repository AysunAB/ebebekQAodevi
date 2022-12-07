package stepDefinitions.uıStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ebebekPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC001StepDefinition {

        ebebekPage page= new ebebekPage();
        Actions actions=new Actions(Driver.getDriver());


        @Given("Ana sayfa acilir")
        public void ana_sayfa_acilir() {
                Driver.getDriver().get(ConfigReader.getProperty("Url"));
        }

        @Given("Arama cubuguna biberon yazilir")
        public void arama_cubuguna_biberon_yazilir() {

                page.notificationText.click();
        }
        @Given("Arama yapilir")
        public void arama_yapilir() {

                actions.click(page.searchBox).sendKeys("Biberon",Keys.ENTER).perform();
                ReusableMethods.waitForPageToLoad(2);
        }
        @Given("Ilk urune tiklanir")
        public void ilk_urune_tiklanir() {
                page.ilkUrun.click();
                ReusableMethods.waitFor(2);
        }
        @Given("Sepete Ekle butonuna tiklanir")
        public void sepete_ekle_butonuna_tiklanir() {
                page.addToCart.click();
                ReusableMethods.waitFor(2);
        }
        @Given("Sepeti Gor butonuna tiklanir.")
        public void sepeti_gor_butonuna_tiklanir() {
                page.seeTheCart.click();
                ReusableMethods.waitFor(2);
        }
        @Given("Urunun sepete eklendigi kontrol edilir.")
        public void urunun_sepete_eklendigi_kontrol_edilir() {
                Assert.assertTrue(page.productInTheCart.isDisplayed());
        }

}