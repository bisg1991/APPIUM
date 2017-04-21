package technexus;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
  public WebDriver driver;	
  public WebDriverWait wait;
  
 
  
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException, InterruptedException {
	  
	// Create an object for Desired Capabilities
				DesiredCapabilities capabilities = new DesiredCapabilities();

				// Name of mobile web browser to automate. �Safari� for iOS and �Chrome�
				// or �Browser� for Android
				//capabilities.setCapability("browsername", "chrome");

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
				driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
				wait = new WebDriverWait(driver, 20);
				
				Thread.sleep(6000);
				
  }

  
  
  @Test
  public void setapplication() throws InterruptedException {
	  
	    //driver.findElement(By.id("menuSearch")).click();
	    /*driver.findElement(By.xpath("//android.widget.TextView[@text='Spaces']")).click();
		System.out.println("Driver control is on"+driver);*/
		driver.findElement(By.id("edtUserName")).sendKeys("naimesh.prajapati@softwebsolutions.com");
		driver.findElement(By.id("edtPassword")).sendKeys("qwerty");
	    Thread.sleep(2000);
		driver.findElement(By.id("btnSignIn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnClose")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Spaces' and @index='0']")).click();
		
		driver.findElement(By.xpath("//android.widget.FrameLayout[contains(@resource-id,'swipe') and @index='0']")).click();
		
		driver.findElement(By.id("btnBookNow")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btn15Min")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Company Name']")).sendKeys("IRCTC");
		driver.findElement(By.id("button1")).click();
		System.out.println("The meeting created successfully by the book now button");
	  
  }
  
  
  /*@AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }*/

}
