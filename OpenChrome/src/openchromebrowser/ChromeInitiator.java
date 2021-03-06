package openchromebrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ChromeInitiator {
  
	    WebDriver driver;
		WebDriverWait wait;
		String AppURL = "http://www.gmail.com";
  
     @BeforeTest
     public void beforeTest() throws MalformedURLException {
	 
	
            // Create an object for Desired Capabilities
			DesiredCapabilities capabilities = new DesiredCapabilities();

			// Name of mobile web browser to automate. �Safari� for iOS and �Chrome�
			// or �Browser� for Android
			capabilities.setCapability("browsername", "chrome");

			// The kind of mobile device or emulator to use - iPad Simulator, iPhone
			// Retina 4-inch, Android Emulator, Galaxy S4 etc
			capabilities.setCapability("deviceName", "FBAZGU043425DA9");

			// Which mobile OS platform to use - iOS, Android, or FirefoxOS
			capabilities.setCapability("platformName", "Android");

			// Java package of the Android app you want to run- Ex:
			// com.example.android.myApp
			capabilities.setCapability("appPackage", "com.android.chrome");

			// Activity name for the Android activity you want to launch from your
			// package
			capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
			
			

			// Initialize the driver object with the URL to Appium Server and
			// passing the capabilities
			driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			wait = new WebDriverWait(driver, 5);
}
	
	
  	
       @Test
        public void f() throws InterruptedException {
 
	    driver.get(AppURL);
	    System.out.println(driver.getTitle());
	    
	    Thread.sleep(5000);
	    WebElement emailfield= driver.findElement(By.id("Email"));
	    emailfield.click();
	    emailfield.sendKeys("biswajitgqa");
	    Thread.sleep(1000);
	    driver.findElement(By.id("next")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.id("Passwd")).sendKeys("testing#123");
	    
	    driver.findElement(By.id("signIn")).click();
	    
	    System.out.println(driver.getTitle());
	    
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//android.widget.CheckBox[@index='2']")).click();
	    
		
 }
  

 /* @AfterTest
  public void afterTest() {
 
	  driver.quit();
	  
  }*/

  
}
