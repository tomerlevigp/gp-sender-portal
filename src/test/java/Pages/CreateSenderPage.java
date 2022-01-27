package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateSenderPage extends LoginPage {
    public CreateSenderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//a[@href='/signup']")
    private WebElement sendersignup;

    @FindBy(xpath ="//input[@formcontrolname='firstName']")
    private WebElement firstnameField;

    @FindBy(xpath ="//input[@formcontrolname='lastName']")
    private WebElement lastnameField;

    @FindBy(xpath ="//input[@formcontrolname='email']")
    private WebElement emailField;

    @FindBy(xpath ="//button[@class='_dropdown']")
    private WebElement prefixbtn ;

    @FindBy(xpath ="//input[@formcontrolname='password']")
    private WebElement passwordField;

    @FindBy(xpath ="//input[@formcontrolname='phoneNumber']")
    private WebElement phonenumberField;

    @FindBy(xpath ="//*[contains(text(),'+972')]")
    private WebElement issraelprefiix;

    @FindBy(xpath ="//span[@class='mat-checkbox-inner-container']")
    private WebElement termscheckbox;

    @FindBy(xpath ="//button[@class='gp-submit']")
    private WebElement submitBtn;


    public void createsender(String firstname, String lastname, String email,String password,String phonenumber) throws InterruptedException {
        driver.get("https://sender-stg.getpackage-dev.com/login");
        Thread.sleep(1000);
        sendersignup.click();
        Thread.sleep(1000);
        sendKeysToElement(firstname,firstnameField,false);
        Thread.sleep(1000);
        sendKeysToElement(lastname,lastnameField,false);
        Thread.sleep(1000);
        sendKeysToElement(email,emailField,false);
        Thread.sleep(1000);
        sendKeysToElement(password,passwordField,false);
        Thread.sleep(1000);
        prefixbtn.click();
        Thread.sleep(1000);
        issraelprefiix.click();
        Thread.sleep(1000);
        sendKeysToElement(phonenumber,phonenumberField,false);
        Thread.sleep(2000);
        termscheckbox.click();
        Thread.sleep(2000);
        submitBtn.click();
        Thread.sleep(12000);




    }
}