package tests;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.AbstractBaseTests.TestBase;

public class LoginTest extends TestBase {
    private LoginPage loginpage;

    @BeforeTest
    @Override
    public void setUpPage() {
        loginpage = new LoginPage(driver);
    }

    @Test
    public void loginTest() throws InterruptedException {
        loginpage.login("0522216199","17171");
    }
}
