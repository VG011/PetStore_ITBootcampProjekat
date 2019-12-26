package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.objects.HomePage;

public class EnterTheStoreTest {
  @Test
  public static void EnterStore() {
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(HomePage.HOME_URL);

		HomePage.clickEnterTheStore(driver);
		
		String currUrl = driver.getCurrentUrl(); 
		
		Assert.assertEquals(currUrl, HomePage.ENTER_URL);
		
		driver.close(); 
  }
}
