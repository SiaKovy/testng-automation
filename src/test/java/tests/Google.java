package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Config;
import utilities.Driver;

public class Google {
    @Test
    public void fistTest(){
        Driver.getDriver().get(Config.getValue("url"));
        Faker faker = new Faker();
        String word = faker.lorem().word();
        Driver.getDriver().findElement(By.name("q")).sendKeys(word + Keys.ENTER);
        String title  = Driver.getDriver().getTitle();
        Assert.assertTrue( title.contains(word), "Title failed");
        Driver.quit();

    }
}
