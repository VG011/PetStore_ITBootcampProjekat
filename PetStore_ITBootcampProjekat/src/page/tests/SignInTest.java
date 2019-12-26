package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.PetStoreMenu;
import page.objects.SignIn;

public class SignInTest {
	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public static void SignIn() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(PetStoreMenu.MENU_URL); 
		
		wait2();

		SignIn.clickSignIn(driver);
		
		boolean currentText = driver.findElement(By.xpath(SignIn.LOGIN_TXT_XPATH)).isDisplayed();
		
		Assert.assertTrue(currentText);

		driver.close();
	}
}
