package technexus;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class NewTest {

	// public WebDriver driver;
	public WebDriverWait wait;
	Dimension size;
	TouchAction action;
	public AppiumDriver driver;

	@BeforeMethod
	public void beforeMethod() throws MalformedURLException, InterruptedException {

		// Create an object for Desired Capabilities
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// Name of mobile web browser to automate. ‘Safari’ for iOS and ‘Chrome’
		// or ‘Browser’ for Android
		// capabilities.setCapability("browsername", "chrome");

		// The kind of mobile device or emulator to use - iPad Simulator, iPhone
		// Retina 4-inch, Android Emulator, Galaxy S4 etc
		capabilities.setCapability("deviceName", "FBAZGU043425DA9");

		// Which mobile OS platform to use - iOS, Android, or FirefoxOS
		capabilities.setCapability("platformName", "Android");

		// Java package of the Android app you want to run- Ex:
		// com.example.android.myApp
		capabilities.setCapability("appPackage", "com.softweb.technexus");

		// Activity name for the Android activity you want to launch from your
		// package
		capabilities.setCapability("appActivity", "com.softweb.smartoffice.activity.SplashActivity");

		// Initialize the driver object with the URL to Appium Server and
		// passing the capabilities
		// driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),
		// capabilities);
		driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		wait = new WebDriverWait(driver, 20);

		Thread.sleep(7000);

	}

	@Test
	public void setapplication() throws InterruptedException {

		// driver.findElement(By.id("menuSearch")).click();
		/*
		 * driver.findElement(By.xpath(
		 * "//android.widget.TextView[@text='Spaces']")).click();
		 * System.out.println("Driver control is on"+driver);
		 */

		
		  /*driver.findElement(By.id("edtUserName")).sendKeys("naimesh.prajapati@softwebsolutions.com");
		  driver.findElement(By.id("edtPassword")).sendKeys("qwerty");
		  Thread.sleep(2000); driver.findElement(By.id("btnSignIn")).click();
		  Thread.sleep(2000); driver.findElement(By.id("btnClose")).click();
		  Thread.sleep(8000);*/
		 
		
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Spaces' and @index='0']")).click();
		 
		 driver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id,'swipe') and @index='0']")) .click();
		  
		 driver.findElement(By.id("btnBookNow")).click(); Thread.sleep(1000);
		 driver.findElement(By.id("btn15Min")).click(); Thread.sleep(1000);
		 driver.findElement(By.xpath("//android.widget.EditText[@text='Company Name']")).sendKeys("IRCTC"); driver.findElement(By.id("button1")).click();
		 System.out.println("The meeting created successfully by the book now button");
		  Thread.sleep(2000);
		 
		//Locate the seekbar
        WebElement bookings = driver.findElement(By.id("com.softweb.technexus:id/llMain"));
        
        // get location of seek bar from left
        int start=bookings.getLocation().getX();
        System.out.println("Startpoint - " + start);
        
        //get location of seekbar from top
        int y=bookings.getLocation().getY();
        System.out.println("Yaxis - "+ y);
        
        //Get total width of seekbar
        int end=start + bookings.getSize().getWidth();
        System.out.println("End point - "+ end);
        
        TouchAction action=new TouchAction(driver);
        //move slider to 70% of width
        int moveTo=(int)(end*0.2);
        action.longPress(start,y).moveTo(moveTo,y).release().perform();
       
        System.out.println("Swiped the elemnt");
		

		

		 Thread.sleep(2000);

		
		 driver.findElement(By.id("com.softweb.technexus:id/tvCancelMeeting")).click();
		 Thread.sleep(1000);
				 
		 driver.findElement(By.id("android:id/button1")).click();
		 

	}

	/*
	 * @AfterMethod public void afterMethod() {
	 * 
	 * driver.close(); }
	 */

}
