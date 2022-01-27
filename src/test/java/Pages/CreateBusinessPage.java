package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CreateBusinessPage extends LoginPage {
    public CreateBusinessPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//a[@href='/signup?type=business']")
    private WebElement businesssignup;

    @FindBy(xpath ="//input[@formcontrolname='firstName']")
    private WebElement firstnameField;

    @FindBy(xpath ="//input[@formcontrolname='lastName']")
    private WebElement lastnameField;

    @FindBy(xpath ="//input[@formcontrolname='email']")
    private WebElement emailField;

    @FindBy(xpath ="//button[@class='_dropdown']")
    private WebElement prefixbtn;

    @FindBy(xpath ="//*[contains(text(),'Line of Business')]")
    private WebElement businesstypedrop;

    @FindBy(xpath ="//*[contains(text(),'Banking and Finance')]")
    private WebElement businesstype;

    @FindBy(xpath ="//input[@formcontrolname='password']")
    private WebElement passwordField;

    @FindBy(xpath ="//input[@formcontrolname='phoneNumber']")
    private WebElement phonenumberField;

    @FindBy(xpath ="//input[@formcontrolname='businessName']")
    private WebElement businessnameField;

    @FindBy(xpath ="//input[@formcontrolname='financeCompanyName']")
    private WebElement financenameField;

    @FindBy(xpath ="//input[@formcontrolname='companyNumber']")
    private WebElement companynumberField;

    @FindBy(xpath ="//input[@formcontrolname='address']")
    private WebElement addressField;

    @FindBy(xpath ="//*[contains(text(),'+972')]")
    private WebElement issraelprefiix;

    @FindBy(xpath ="//span[@class='mat-checkbox-inner-container']")
    private WebElement termscheckbox;

    @FindBy(xpath ="//button[@class='gp-submit']")
    private WebElement continueBtn;

    @FindBy(xpath ="//*[contains(text(),'Sign Up')]")
    private WebElement submitBtn;


    public void createbusiness(String firstname, String lastname, String email,String password,String phonenumber,
                               String businessname,String financename,String companynumber,String address) throws InterruptedException {
        driver.get("https://sender-stg.getpackage-dev.com/login");
        Thread.sleep(1000);
        businesssignup.click();
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
        continueBtn.click();
        Thread.sleep(2000);
        sendKeysToElement(businessname,businessnameField,false);
        Thread.sleep(1000);
        sendKeysToElement(financename,financenameField,false);
        Thread.sleep(1000);
        sendKeysToElement(companynumber,companynumberField,false);
        Thread.sleep(1000);
        businesstypedrop.click();
        Thread.sleep(1000);
        businesstype.click();
        Thread.sleep(1000);
        sendKeysToElement(address,addressField,false);
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(4000);
        submitBtn.click();
        Thread.sleep(2000);
        submitBtn.click();
        Thread.sleep(9000);



    }
}