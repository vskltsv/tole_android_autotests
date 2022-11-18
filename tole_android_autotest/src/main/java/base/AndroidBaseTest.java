package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static base.BaseConstants.*;

public class AndroidBaseTest {
   private static  AndroidDriver ad = null;
  // private static  DesiredCapabilities dc = new DesiredCapabilities();


@Before
    public void setup() throws MalformedURLException {
        final DesiredCapabilities ds = new DesiredCapabilities();
        onSetDesiredCapabilitiesBeforeMethod(ds);
        AndroidDriver ad = new AndroidDriver(new URL(BaseConstants.URL), ds);
        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public AndroidDriver getDriver(){
       return  ad;
    }

    protected void onSetDesiredCapabilitiesBeforeMethod(DesiredCapabilities ds) {
        ds.setCapability("platformName", PLATFORM_NAME);
        //ds.setCapability("automationName", AUTOMATION_NAME);
        ds.setCapability("appPackage", APP_PACKAGE);
        ds.setCapability("appActivity", APP_ACTIVITY);
        ds.setCapability("deviceName", DEVICE_NAME);
        ds.setCapability("language", "ru");
        ds.setCapability("locale", "RU");
        ds.setCapability("autoGrantPermissions", AUTO_GRANT_PERMISSIONS);
        ds.setCapability("autoDismissAlerts", AUTO_DISMISS_ALERTS);
        ds.setCapability("autoAcceptAlerts", AUTO_ACCEPT_ALERTS);
        ds.setCapability("unicodeKeyboard", true);
        ds.setCapability("resetKeyboard", true);
        ds.setCapability("noSign", true);
        ds.setCapability("ignoreHiddenApiPolicyError", true);

    }
//    public static void makeScreen(WebDriver driver, String fileWithPath) throws Exception {
//        TakesScreenshot scrShot = ((TakesScreenshot) ad);
//        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
//        File DestFile = new File(fileWithPath);
//        // FileUtils.copyFile(SrcFile, DestFile);
//    }

@After
    public void teardown() throws Exception {
        ad.quit();
    }
}