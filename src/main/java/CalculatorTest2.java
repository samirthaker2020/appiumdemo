import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CalculatorTest2 {

	// TO RUN  SYSTEM CALCULATOR  
	 
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
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "joker@4");
		//cap.setCapability(MobileCapabilityType.UDID, "72ed9067");
		cap.setCapability(MobileCapabilityType.UDID, "10.51.224.182:5555");
		
		cap.setCapability(MobileCapabilityType.APPLICATION_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT ,"25");
		//cap.setCapability("app", app.getAbsoluPath());
		 
		 
		
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sec.android.app.popupcalculator");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.sec.android.app.popupcalculator.Calculator");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"), cap);
		System.out.println("Application Started.....");
		
		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("9");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("1");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Plus");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("9");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("Equal");
		el5.click();
	}
}
