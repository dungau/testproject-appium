package mob_tests.android;

import io.appium.java_client.AppiumDriver;
import mob_tests.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public static void testLogin() {
        loginPage = new LoginPage((AppiumDriver) getDriver());
        loginPage.login("Test", "12345");
    }
}
