package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//input[@formcontrolname='phone']")
    private WebElement phonenumberfield;

    @FindBy(xpath ="//input[@autocomplete='one-time-code']")
    private WebElement optCodeField;

    @FindBy(xpath ="//button[@class='gp-submit']")
    private WebElement loginButton;


    public void login(String phoneNumber, String optCode) throws InterruptedException {
        driver.get("https://sender-stg.getpackage-dev.com/login");
        Thread.sleep(2000);
        sendKeysToElement(phoneNumber, phonenumberfield, false);
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(2000);
        sendKeysToElement(optCode, optCodeField, false);
        Thread.sleep(2000);

    }
}