package tests;

import Pages.CreateExpressPage;
import Pages.CreateSDDPage;
import Pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.AbstractBaseTests.TestBase;

public class CreateExpressTest extends TestBase {
    private CreateExpressPage createexpresspage;

    @BeforeTest
    @Override
    public void setUpPage() {
        createexpresspage = new CreateExpressPage(driver);
    }

    @Test
    public void createexpresstest() throws InterruptedException {
        createexpresspage.createexpress("hertzel 1 rishon lezion","remez 1 rishon lezion","tomergp",
                "0521415690","meshigp","0521002301");

    }
}
