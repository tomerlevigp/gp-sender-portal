package tests;

import Pages.CreateSDDPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.AbstractBaseTests.TestBase;

public class CreateSDDTest extends TestBase {
    private CreateSDDPage createsddpage;

    @BeforeTest
    @Override
    public void setUpPage() {
        createsddpage = new CreateSDDPage(driver);
    }

    @Test
    public void createsddtest() throws InterruptedException {
        createsddpage.createsdd("herzel 1 rishon lezion","remez 1 rishon lezion","tomergp",
                "0521415690","meshigp","0521002301");

    }
}
