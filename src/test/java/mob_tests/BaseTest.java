package mob_tests;

import com.beust.jcommander.Parameterized;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.ProfilePage;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static LoginPage loginPage;
    protected static ProfilePage profilePage;
    protected static WebDriver driver;

    @BeforeTest()
    public void setUp() throws MalformedURLException, InterruptedException, FileNotFoundException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.21.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("deviceName", "Pixel_4_API_30");
        capabilities.setCapability("app", "/Users/dung_au/Training/Automation/testproject-appium/src/test/resources/app/testproject-demo-app.apk");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown() {
        getDriver().quit();
    }

    protected static WebDriver getDriver() {
        return driver;
    }

}