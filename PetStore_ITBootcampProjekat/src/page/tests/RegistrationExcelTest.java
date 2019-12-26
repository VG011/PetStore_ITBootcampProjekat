package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.PetStoreMenu;
import page.objects.Registration;
import page.objects.SignIn;
import utility.ExcelUtils;

public class RegistrationExcelTest {
	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Test
	public static void RegistrationExcel() {

		for (int i = 1; i < 51; i++) {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

			driver.manage().window().maximize();

			driver.get(Registration.REG_URL);

			String DATA_SOURCE = "UserRandomData.xlsx";

			ExcelUtils.setExcell(DATA_SOURCE);
			ExcelUtils.setWorkSheet(0);

			String userid, password, firstname, lastname, email, phone, address1, address2, city, state, zip, country,
					language, category, list, banner;

			double id = Double.parseDouble(ExcelUtils.getDataAt(i, 0).toString());
			int id1 = (int) id;
			userid = String.valueOf(id1);

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

			Registration.inputUserID(driver, userid);
			Registration.inputPassword(driver, password);
			Registration.inputRepeatPassword(driver, password);
			Registration.inputName(driver, firstname);
			Registration.inputLastName(driver, lastname);
			Registration.inputEmail(driver, email);
			Registration.inputPhone(driver, phone);
			Registration.inputAddress1(driver, address1);
			Registration.inputAddress2(driver, address2);
			Registration.inputCity(driver, city);
			Registration.inputState(driver, state);
			Registration.inputZip(driver, zip);
			Registration.inputCountry(driver, country);

			Registration.inputLanguagePreference(driver, language);
			Registration.inputFavouriteCategory(driver, category);

			if (list.equals("YES")) {
				Registration.clickMyList(driver);
			}

			if (banner.equals("YES")) {
				Registration.clickMyBanner(driver);
			}

			Registration.clickSaveAcc(driver);

			wait2();

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
