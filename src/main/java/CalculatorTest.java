import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CalculatorTest {

	 
	static AppiumDriver<MobileElement> adriver;
	static AndroidDriver<MobileElement> mdriver;
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		try {
			opencalculator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public static void opencalculator() throws Exception
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "PIE9.0");
		cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		cap.setCapability(MobileCapabilityType.APPLICATION_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator1");
		//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT ,"25");
		//cap.setCapability("app", app.getAbsoluPath());
		 
		 
		
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"), cap);
		System.out.println("Application Started.....");
		MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_9");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_1");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("plus");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_9");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("equals");
		el5.click();
		
	}
}
