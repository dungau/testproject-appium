package mob_tests.android;
import io.appium.java_client.AppiumDriver;
import mob_tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProfilePage;

@Test
public class ProfileTest extends BaseTest {

    public void testProfile() {
        AppiumDriver driver = (AppiumDriver) getDriver();
        loginPage = new LoginPage(driver);
        loginPage.login("Test", "12345");
        profilePage = new ProfilePage(driver);
        profilePage.fillInfo("Canada", "8 Ness Ave", "someone@somewhere.com",
                "+1 555 555");
        profilePage.clickExpectedButtonByName("save");
        Assert.assertTrue(profilePage.isSaved(), "Info are saved");
    }
}