/*
 * Copyright 2014-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package tests.AbstractBaseTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * An abstract base for all of the Android tests within this package
 * <p>
 * Responsible for setting up the Appium test Driver
 */
public abstract class TestBase {
    /**
     * Make the driver static. This allows it to be created only once
     * and used across all of the test classes.
     */
    public static WebDriver driver;

    /**
     * Method to initialize the test's page
     */
    @BeforeTest
    public abstract void setUpPage();

    /**
     * This method runs before any other method.
     * <p>
     * Appium follows a client - server model:
     * We are setting up our appium client in order to connect to Device Farm's appium server.
     * <p>
     * We do not need to and SHOULD NOT set our own DesiredCapabilities
     * Device Farm creates custom settings at the server level. Setting your own DesiredCapabilities
     * will result in unexpected results and failures.
     *
     * @throws MalformedURLException An exception that occurs when the URL is wrong
     */
    @BeforeTest
    public void setSelenium() throws MalformedURLException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Use a higher value if your web elements take time to show up
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

    }

    /**
     * Always remember to quit
     */
    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    /**
     * Restart the app after every test class to go back to the main
     * screen and to reset the behavior
     */

}