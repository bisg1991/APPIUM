package testnexus;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import java.net.URL;
import java.net.MalformedURLException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
 
	 private String host = "localhost";
	    private int port = 8889;
	    private String reportDirectory = "reports";
	    private String reportFormat = "xml";
	    private String testName = "testtexus";
	    protected SeeTestAndroidDriver<SeeTestAndroidElement> driver = null;
	    public AppiumDriver driver;
	    
	    
  @BeforeTest
  public void setUp() throws MalformedURLException {
      DesiredCapabilities dc = new DesiredCapabilities();
      dc.setCapability(SeeTestCapabilityType.REPORT_DIRECTORY, reportDirectory);
      dc.setCapability(SeeTestCapabilityType.REPORT_FORMAT, reportFormat);
      dc.setCapability(SeeTestCapabilityType.TEST_NAME, testName);
      dc.setCapability(MobileCapabilityType.UDID, "T03850B54G");
      driver = new SeeTestAndroidDriver<>(new URL("http://"+host+":"+port), dc);
  }

  
  @Test
  public void testtesttexus() {
      driver.sendKeys("naimesh.prajapati@softwebsolutions.com");
      driver.findElement(By.xpath("//*[@id='edtPassword']")).click();
      driver.findElement(By.xpath("//*[@id='edtPassword']")).sendKeys("qwerttqwertyqqwerty");
      new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Powered by Softweb Solutions Inc.']")));
      driver.findElement(By.xpath("//*[@text='Powered by Softweb Solutions Inc.']")).click();
      driver.findElement(By.xpath("//*[@text='Skip']")).click();
      driver.findElement(By.xpath("//*[@text='Spaces']")).click();
      driver.findElement(By.xpath("//*[@id='iv_row_room_next' and ./preceding-sibling::*[./*[@text='06']]]")).click();
      driver.findElement(By.xpath("//*[@text='Book Now']")).click();
      driver.findElement(By.xpath("//*[@text='15 mins']")).sendKeys("test");
      driver.findElement(By.xpath("//*[@text='OK']")).click();
      driver.findElement(By.xpath("//*[@text='Allow']")).click();
      driver.getClient().elementListSelect("", "text=Cancel Meeting", 0, false);
      driver.findElement(By.xpath("//*[@text='Cancel Meeting']")).click();
      driver.findElement(By.xpath("//*[@text='Yes']")).click();
  }
  
  @AfterTest
  public void tearDown() {
      driver.quit();
  }

}
