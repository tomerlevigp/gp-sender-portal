package tests;

import Pages.CreateBusinessPage;
import Pages.CreateSenderPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tests.AbstractBaseTests.TestBase;

import java.util.Random;

public class CreateBusinessTest extends TestBase {
    private CreateBusinessPage createbusinesspage;

    int n = 1000000 + new Random().nextInt(8999999);

    @BeforeTest
    @Override
    public void setUpPage() {
        createbusinesspage = new CreateBusinessPage(driver);
    }

    @Test
    public void createbusinesstest() throws InterruptedException {
        createbusinesspage.createbusiness("tomergp","levi","tomer"+n+"@gmail.com",
                "Aa12345678","052"+n,"tomerbusiness","tomerbusiness",
                "30"+n,"hachsharat hayishuv 23 rishon");

    }
}
