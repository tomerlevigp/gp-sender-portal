package tests;

import Pages.CreateExpressPage;
import Pages.CreateSenderPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.AbstractBaseTests.TestBase;

import java.util.Random;

public class CreateSenderTest extends TestBase {
    private CreateSenderPage createsenderpage;

    int n = 1000000 + new Random().nextInt(8999999);

    @BeforeTest
    @Override
    public void setUpPage() {
        createsenderpage = new CreateSenderPage(driver);
    }

    @Test
    public void createsendertest() throws InterruptedException {
        createsenderpage.createsender("tomergp","levi","tomer"+n+"@gmail.com","Aa12345678","052"+n);

    }
}
