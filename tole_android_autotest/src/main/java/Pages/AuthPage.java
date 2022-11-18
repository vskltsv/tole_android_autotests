package Pages;

import base.AndroidBaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AuthPage extends AndroidBaseTest {


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    private WebElement inputNumber;
    @AndroidFindBy(id = "kz.jusan.pay.dev:id/button")
    private WebElement clickNext;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.GridLayout/android.widget.TextView[10]")
    private WebElement inputCode0;


    public void sendKeysPhone() throws InterruptedException{
        inputNumber.sendKeys("+77770090610");
        clickNext.click();
        inputCode0.click();
        inputCode0.click();
        inputCode0.click();
        inputCode0.click();
        inputCode0.click();
        inputCode0.click();
    }



}
