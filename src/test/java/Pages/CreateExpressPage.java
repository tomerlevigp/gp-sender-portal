package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CreateExpressPage extends LoginPage {
    public CreateExpressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//button[@id='create-new-delivery-btn']")
    private WebElement createDelivery;

    @FindBy(xpath ="//input[@formcontrolname='pickUpPoint']")
    private WebElement pickupaddressField;

    @FindBy(xpath ="//input[@formcontrolname='dropOffPoint']")
    private WebElement dropaddressField;

    @FindBy(xpath ="//input[@formcontrolname='senderName']")
    private WebElement sendernameField;

    @FindBy(xpath ="//input[@formcontrolname='senderPhoneNumber']")
    private WebElement senderphoneField;

    @FindBy(xpath ="//input[@formcontrolname='receiverName']")
    private WebElement recievernameField;

    @FindBy(xpath ="//input[@formcontrolname='receiverPhoneNumber']")
    private WebElement recieverphoneField;

    @FindBy(xpath ="//div[@class='submit']")
    private WebElement createBtn;

    @FindBy(xpath ="//*[@id=\"mat-dialog-0\"]/gp-create-delivery-confirmation-modal/gp-base-dialog/div/div[3]/div[2]/div/div[4]/button")
    private WebElement createdeliveryBtn;


    public void createexpress(String pickupaddress , String dropaddress, String sendername, String senderphone, String recievername, String recieverphone) throws InterruptedException {
        login("0522216199","17171");
        Thread.sleep(1000);
        createDelivery.click();
        Thread.sleep(2000);
        sendKeysToElement(pickupaddress,pickupaddressField,false);
        Actions action = new Actions(driver);
        Thread.sleep(3000);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        sendKeysToElement(dropaddress,dropaddressField,false);
        Thread.sleep(3000);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1000);
        sendKeysToElement(sendername,sendernameField,false);
        Thread.sleep(1000);
        sendKeysToElement(senderphone,senderphoneField,false);
        Thread.sleep(1000);
        sendKeysToElement(recievername,recievernameField,false);
        Thread.sleep(1000);
        sendKeysToElement(recieverphone,recieverphoneField,false);
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        createBtn.click();
        Thread.sleep(1000);
        createdeliveryBtn.click();
        Thread.sleep(2000);




    }
}