package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.Registration;
import page.objects.SignIn;
import utility.ExcelUtils;

public class LoginTest {
	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Test
	public static void Login() {

		for (int i = 1; i < 51; i++) {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			driver.manage().window().maximize();

			driver.get(HomePage.ENTER_URL);

			String DATA_SOURCE = "UserRandomData.xlsx";

			ExcelUtils.setExcell(DATA_SOURCE);
			ExcelUtils.setWorkSheet(0);

			String userid, password;

			double id = Double.parseDouble(ExcelUtils.getDataAt(i, 0).toString());
			int id1 = (int) id;
			userid = String.valueOf(id1);

			password = ExcelUtils.getDataAt(i, 1);

			SignIn.clickSignIn(driver);

			SignIn.inputUsername(driver, userid);
			SignIn.clearPassword(driver);
			SignIn.inputPassword(driver, password);
			wait2();
			SignIn.clickLogin(driver);

			boolean currentHeading = driver.findElement(By.xpath(Registration.MY_ACCOUNT_LINK)).isDisplayed();

			SoftAssert sa = new SoftAssert();
			sa.assertTrue(currentHeading);

			wait2();
			SignIn.clickLogout(driver);

			driver.quit();
			sa.assertAll();
		}
	}
}
