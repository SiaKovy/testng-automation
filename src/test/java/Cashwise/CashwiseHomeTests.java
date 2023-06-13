package Cashwise;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import pages.CashwiseHomePage;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

public class CashwiseHomeTests {

    public void contactUs(){
        Driver.getDriver().get(Config.getValue("cashwiseURL"));
        Faker faker = new Faker();
        CashwiseHomePage cashwiseHomePage = new CashwiseHomePage();
        cashwiseHomePage.contactPhoneInput.sendKeys(faker.phoneNumber().subscriberNumber(9));
        cashwiseHomePage.contactEmailInput.sendKeys(faker.internet().emailAddress());
        ApplicationFlow.pause(3000);
        cashwiseHomePage.sendBtn.click();
        //Assert.assertTrue(cashwiseHomePage.);


    }

}
