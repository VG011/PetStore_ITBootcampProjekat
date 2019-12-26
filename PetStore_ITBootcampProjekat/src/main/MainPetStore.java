//TESTING CLASS - IGNORE IT! :)

package main;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.Region;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HomePage;
import page.objects.PetStoreMenu;
import page.objects.Registration;
import page.objects.SignIn;
import utility.ExcelUtils;

public class MainPetStore {

	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) { 
		
		for (int i = 1; i < 2; i++) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(HomePage.HOME_URL);

		HomePage.clickEnterTheStore(driver);
		
		PetStoreMenu.clickSignIn(driver); 
		SignIn.clickRegistration(driver);

		String DATA_SOURCE = "UserRandomData.xlsx";

		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);

		
			String userid, password, firstname, lastname, email, phone, address1, address2, city, state, zip, country, language, banner, y;
			//userid= ExcelUtils.getDataAt(i, 0); 
			
			double id = Double.parseDouble(ExcelUtils.getDataAt(i, 0).toString());
			int id1 = (int) id;
			userid = String.valueOf(id1);
			
			password= ExcelUtils.getDataAt(i, 1);
			firstname = ExcelUtils.getDataAt(i, 2);
			lastname = ExcelUtils.getDataAt(i, 3);
			email = ExcelUtils.getDataAt(i, 4);
			phone = ExcelUtils.getDataAt(i, 5);
			address1 = ExcelUtils.getDataAt(i, 6);
			address2 = ExcelUtils.getDataAt(i, 7);
			city = ExcelUtils.getDataAt(i, 8);
			state = ExcelUtils.getDataAt(i, 9);
			//zip = ExcelUtils.getDataAt(i, 10);
			
			double z = Double.parseDouble(ExcelUtils.getDataAt(i, 10).toString());
			int z1 = (int) z;
			zip = String.valueOf(z1);
			
			country = ExcelUtils.getDataAt(i, 11); 
			language= ExcelUtils.getDataAt(i, 12); 
			banner= ExcelUtils.getDataAt(i, 13); 
			y= ExcelUtils.getDataAt(i, 14);
			
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
			Registration.inputFavouriteCategory(driver, banner);
			Registration.clickMyList(driver);
			Registration.clickMyBanner(driver);
			
			//Registration.clickSaveAcc(driver); 
			
			//driver.quit();

		}

		// ***PetStoreMenu***

		// PetStoreMenu.clickSignIn(driver);
		// PetStoreMenu.clickShoppingCard(driver);

		// PetStoreMenu.clickHelp(driver);
		// PetStoreMenu.clickMyBatisHomepage(driver);

		// PetStoreMenu.clickFishLeft(driver);
		// PetStoreMenu.clickDogsLeft(driver);
		// PetStoreMenu.clickCatsLeft(driver);
		// PetStoreMenu.clickReptilesLeft(driver);
		// PetStoreMenu.clickBirdsLeft(driver);

		// PetStoreMenu.clickBirdsLargePicture(driver);
		// PetStoreMenu.clickFishPicture(driver);
		// PetStoreMenu.clickDogsPicture(driver);
		// PetStoreMenu.clickCatsPicture(driver);
		// PetStoreMenu.clickReptilesPicture(driver);
		// PetStoreMenu.clickBirdsPicture(driver);

		// ***SignIn***
		/*
		 * PetStoreMenu.clickSignIn(driver); wait2(); SignIn.inputUsername(driver);
		 * SignIn.inputPassword(driver); SignIn.clickLogin(driver);
		 * 
		 * PetStoreMenu.clickSignIn(driver); SignIn.clickRegistration(driver);
		 */

	}

}
