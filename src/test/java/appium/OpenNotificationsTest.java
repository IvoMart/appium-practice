package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class OpenNotificationsTest {

    /*
     * {
     * "platformName": "Android",
     * "appium:deviceName": "emulator-5554",
     * "appium:automationName": "UIAutomator2",
     * "appium:platformVersion": "11",
     * "appium:androidInstallTimeout": "180000",
     * "appium:uiautomator2ServerInstallTimeout": "350000"
     * }
     */

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "emulator-5554");
        cap.setCapability("appium:automationName", "UIAutomator2");
        cap.setCapability("appium:platformVersion", "11");
        cap.setCapability("appium:androidInstallTimeout", "180000");
        cap.setCapability("appium:uiautomator2ServerInstallTimeout", "350000");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723"), cap);
        driver.openNotifications();
    }
}
