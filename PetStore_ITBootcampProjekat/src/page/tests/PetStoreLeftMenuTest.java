package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.PetStoreMenu;

public class PetStoreLeftMenuTest {
	@Test
	public static void Fish() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(PetStoreMenu.MENU_URL);

		PetStoreMenu.clickFishLeft(driver);

		boolean currentHeading = driver.findElement(By.xpath(PetStoreMenu.FISH_HEADING_HEAD)).isDisplayed();

		SoftAssert sa = new SoftAssert();
		sa.assertTrue(currentHeading);

		driver.close();
	}

	@Test
	public static void Dogs() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(PetStoreMenu.MENU_URL);

		PetStoreMenu.clickDogsLeft(driver);

		boolean currentHeading = driver.findElement(By.xpath(PetStoreMenu.DOGS_HEADING_HEAD)).isDisplayed();

		SoftAssert sa = new SoftAssert();
		sa.assertTrue(currentHeading);

		driver.close();
	}

	@Test
	public static void Cats() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(PetStoreMenu.MENU_URL);

		PetStoreMenu.clickCatsLeft(driver);

		boolean currentHeading = driver.findElement(By.xpath(PetStoreMenu.CATS_HEADING_HEAD)).isDisplayed();

		SoftAssert sa = new SoftAssert();
		sa.assertTrue(currentHeading);

		driver.close();
	}

	@Test
	public static void Reptiles() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(PetStoreMenu.MENU_URL);

		PetStoreMenu.clickReptilesLeft(driver);

		boolean currentHeading = driver.findElement(By.xpath(PetStoreMenu.REPTILES_HEADING_HEAD)).isDisplayed();

		SoftAssert sa = new SoftAssert();
		sa.assertTrue(currentHeading);

		driver.close(); 
	}

	@Test
	public static void Birds() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(PetStoreMenu.MENU_URL);

		PetStoreMenu.clickBirdsLeft(driver);

		boolean currentHeading = driver.findElement(By.xpath(PetStoreMenu.BIRDS_HEADING_HEAD)).isDisplayed();

		SoftAssert sa = new SoftAssert();
		sa.assertTrue(currentHeading);

		driver.close(); 
		
		sa.assertAll();
	}
}
