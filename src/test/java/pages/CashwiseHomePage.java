package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Config;
import utilities.Driver;

import java.awt.print.PageFormat;

public class CashwiseHomePage {
    public CashwiseHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "(//button)[1]")
    public WebElement signInBtn;

    @FindBy (xpath = "(//button)[2]")
    public WebElement signUpBtn;

    @FindBy (xpath = "(//button)[4]")
    public WebElement sendBtn;

    @FindBy (name = "name")
    public WebElement ContactNameInput;

    @FindBy (name = "phone")
    public WebElement contactPhoneInput;

    @FindBy (name = "email")
    public WebElement contactEmailInput;

    @FindBy (xpath = "//div[@type='MINI']//h2")
    public WebElement contactSubmittedPopup;






}
