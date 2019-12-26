package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.Registration;
import page.objects.SignIn;
import utility.ExcelUtils;

public class AccountChangeTest {
	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Test
	public static void Account() {

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
		Registration.clickMyAccount(driver);

		i = 51;

		String userid, password, firstname, lastname, email, phone, address1, address2, city, state, zip, country,
		language, category, list, banner;

		password = ExcelUtils.getDataAt(i, 1);
		firstname = ExcelUtils.getDataAt(i, 2);
		lastname = ExcelUtils.getDataAt(i, 3);
		email = ExcelUtils.getDataAt(i, 4);
		phone = ExcelUtils.getDataAt(i, 5);
		address1 = ExcelUtils.getDataAt(i, 6);
		address2 = ExcelUtils.getDataAt(i, 7);
		city = ExcelUtils.getDataAt(i, 8);
		state = ExcelUtils.getDataAt(i, 9);

		double z = Double.parseDouble(ExcelUtils.getDataAt(i, 10).toString());
		int z1 = (int) z;
		zip = String.valueOf(z1);

		country = ExcelUtils.getDataAt(i, 11);
		language = ExcelUtils.getDataAt(i, 12);
		category = ExcelUtils.getDataAt(i, 13);
		list = ExcelUtils.getDataAt(i, 14);
		banner = ExcelUtils.getDataAt(i, 15);

		Registration.clearPassword(driver);
		Registration.inputPassword(driver, password);
		Registration.clearRepeatPassword(driver);
		Registration.inputRepeatPassword(driver, password);
		Registration.clearName(driver);
		Registration.inputName(driver, firstname);
		Registration.clearLastName(driver);
		Registration.inputLastName(driver, lastname);
		Registration.clearEmail(driver);
		Registration.inputEmail(driver, email);
		Registration.clearPhone(driver);
		Registration.inputPhone(driver, phone);
		Registration.clearAddress1(driver);
		Registration.inputAddress1(driver, address1);
		Registration.clearAddress2(driver);
		Registration.inputAddress2(driver, address2);
		Registration.clearCity(driver);
		Registration.inputCity(driver, city);
		Registration.clearState(driver);
		Registration.inputState(driver, state);
		Registration.clearZip(driver);
		Registration.inputZip(driver, zip);
		Registration.clearCountry(driver);
		Registration.inputCountry(driver, country);

		Registration.inputLanguagePreference(driver, language);
		Registration.inputFavouriteCategory(driver, category);

		if (list.equals("YES")) {
			Registration.clickMyList(driver);
		}

		if (banner.equals("YES")) {
			Registration.clickMyBanner(driver);
		}

		Registration.clickEditAcc(driver);

		SignIn.clickLogout(driver);
		String userid2, password2;

		double id0 = Double.parseDouble(ExcelUtils.getDataAt(1, 0).toString());
		int id11 = (int) id0;
		userid2 = String.valueOf(id11);

		password2 = ExcelUtils.getDataAt(51, 1);

		// LOGIN
		wait2();
		SignIn.clickSignIn(driver);
		wait2();

		SignIn.inputUsername(driver, userid2);
		SignIn.clearPassword(driver);
		SignIn.inputPassword(driver, password2);
		wait2();
		SignIn.clickLogin(driver);

		boolean currentHeading = driver.findElement(By.xpath(Registration.MY_ACCOUNT_LINK)).isDisplayed();

		Assert.assertTrue(currentHeading);

		wait2();
		SignIn.clickLogout(driver);

		driver.quit();
	}
}