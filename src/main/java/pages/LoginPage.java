package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "io.testproject.demo:id/name")
    private AndroidElement txtUsername;
    @AndroidFindBy(id = "io.testproject.demo:id/password")
    private AndroidElement txtPassword;
    @AndroidFindBy(id = "io.testproject.demo:id/login")
    private AndroidElement btnLogin;
    public boolean isDisplayed() {
        return btnLogin.isDisplayed();
    }
    public void fillLogin(String name, String password) {
        txtUsername.sendKeys(name);
        txtPassword.sendKeys(password);
    }
    public void clickLogin() {
        click(btnLogin);
    }
    public void login (String name, String password) {
        fillLogin(name, password);
        clickLogin();
    }
}
