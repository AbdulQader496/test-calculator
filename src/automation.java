import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class automation {



    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.android.calculator2");
        dc.setCapability("appActivity", ".Calculator");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);


        MobileElement el12 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_1");
        el12.click();
        MobileElement el13 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_2");
        el13.click();
        MobileElement el14 = (MobileElement) ad.findElementByAccessibilityId("plus");
        el14.click();
        MobileElement el15 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_1");
        el15.click();
        MobileElement el16 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_5");
        el16.click();
        MobileElement el17 = (MobileElement) ad.findElementByAccessibilityId("equals");
        el17.click();

        Assert.assertEquals(ad.findElementById("com.android.calculator2:id/result").getText(),27);


    }

}