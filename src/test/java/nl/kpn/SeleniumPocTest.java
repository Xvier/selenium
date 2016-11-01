package nl.kpn;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.URL;

/**
 * Created by xviuda on 01-11-16.
 */
public class SeleniumPocTest {
    WebDriver driver;

    @Test
    public void firstTest() throws Exception {


             driver = new RemoteWebDriver(new URL("http://selenium-hub.default.svc.appfactory.local:4444/wd/hub"),DesiredCapabilities.firefox());
            driver.get("http://www.google.nl");

            assertEquals(driver.getTitle(),"Google");
            driver.close();
            driver.quit();

    }

    @Test
    public void chromeTest() throws Exception {


         driver = new RemoteWebDriver(new URL("http://selenium-hub.default.svc.appfactory.local:4444/wd/hub"),DesiredCapabilities.chrome());
        driver.get("http://www.google.nl");

        assertEquals(driver.getTitle(),"Google");
        driver.close();
        driver.quit();

    }

    @Test
    public void foutTest() throws Exception {


        driver = new RemoteWebDriver(new URL("http://selenium-hub.default.svc.appfactory.local:4444/wd/hub"),DesiredCapabilities.chrome());
        driver.get("http://www.google.nl");

        assertEquals(driver.getTitle(),"Google");
        System.out.println("nothing");
        driver.close();
        driver.quit();

    }


}
