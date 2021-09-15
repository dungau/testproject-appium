package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public AppiumDriver driver;
    public WebDriverWait wait;

    //Constructor
    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,15);
    }

    void click(AndroidElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}
