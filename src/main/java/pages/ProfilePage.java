package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
public class ProfilePage extends BasePage {
    public ProfilePage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "io.testproject.demo:id/greetings")
    private AndroidElement lblGreetings;
    @AndroidFindBy(id = "io.testproject.demo:id/logout")
    private AndroidElement btnLogout;
    @AndroidFindBy(id = "io.testproject.demo:id/country")
    private AndroidElement txtCountry;
    @AndroidFindBy(id = "io.testproject.demo:id/address")
    private AndroidElement txtAddress;
    @AndroidFindBy(id = "io.testproject.demo:id/email")
    private AndroidElement txtEmail;
    @AndroidFindBy(id = "io.testproject.demo:id/phone")
    private AndroidElement txtPhone;
    @AndroidFindBy(id = "io.testproject.demo:id/save")
    private AndroidElement btnSave;
    @AndroidFindBy(id = "io.testproject.demo:id/saved")
    private AndroidElement lblSaved;
    public boolean isDisplayed() {
        return lblGreetings.isDisplayed();
    }
    public void fillInfo(String country, String address, String email, String phone) {
        txtCountry.sendKeys(country);
        txtAddress.sendKeys(address);
        txtEmail.sendKeys(email);
        txtPhone.sendKeys(phone);
    }
    public void clickExpectedButtonByName(String btnName) {
        switch (btnName.toLowerCase().trim()) {
            case "save" -> click(btnSave);
            case "logout" -> click(btnLogout);
        }
    }
    public boolean isSaved() {
        return lblSaved.isDisplayed();
    }
}
