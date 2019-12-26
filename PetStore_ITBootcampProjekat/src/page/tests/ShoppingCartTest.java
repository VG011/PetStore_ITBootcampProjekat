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
import page.objects.Registration;
import page.objects.SignIn;
import utility.ExcelUtils;

public class ShoppingCartTest {
	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Test
	public static void ShoppingCart() {
		int i = 1;

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(HomePage.ENTER_URL);

		String DATA_SOURCE = "UserRandomData.xlsx";

		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);

		String userid1, password1;

		double id = Double.parseDouble(ExcelUtils.getDataAt(i, 0).toString());
		int id1 = (int) id;
		userid1 = String.valueOf(id1);

		password1 = ExcelUtils.getDataAt(i, 1);

		// LOGIN
		wait2();
		SignIn.clickSignIn(driver);
		wait2();

		SignIn.inputUsername(driver, userid1);
		SignIn.clearPassword(driver);
		SignIn.inputPassword(driver, password1);
		wait2();
		SignIn.clickLogin(driver);

		wait2();
		PetStoreMenu.clickCatsTop(driver);
		wait2();
		Registration.clickPersianCat(driver);
		wait2();
		Registration.clickPersianCatMale(driver);
		wait2();
		Registration.clickAddPersianCatMale(driver);
		wait2();

		boolean currentCat = driver.findElement(By.xpath(Registration.EST_17_PERSIAN_CAT_XPATH)).isDisplayed();

		Assert.assertTrue(currentCat);

		SignIn.clickLogout(driver);

		driver.quit();
	}
}
