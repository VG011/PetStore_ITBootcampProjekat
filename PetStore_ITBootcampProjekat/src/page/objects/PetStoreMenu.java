package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreMenu {

	public static final String MENU_URL = "https://petstore.octoperf.com/actions/Catalog.action";
	
	public static final String FISH_MENU_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
	public static final String DOGS_MENU_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";
	public static final String CATS_MENU_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
	public static final String REPTILES_MENU_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";
	public static final String BIRDS_MENU_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";

	//***HEADINGS*** 
	public static final String FISH_HEADING_HEAD = "//h2[contains(text(),'Fish')]";
	public static final String DOGS_HEADING_HEAD = "//h2[contains(text(),'Dogs')]";
	public static final String CATS_HEADING_HEAD = "//h2[contains(text(),'Cats')]";
	public static final String REPTILES_HEADING_HEAD = "//h2[contains(text(),'Reptiles')]";
	public static final String BIRDS_HEADING_HEAD = "//h2[contains(text(),'Birds')]";
	
	// ***SIGN IN***
	private static final String SIGN_IN_XPATH = "//a[contains(text(),'Sign In')]";
	
	// ***SHOPPING CARD***
	private static final String SHOPPING_CARD_XPATH = "//img[@name='img_cart']";

	// ***MYBATTIS MENU***
	private static final String HELP_XPATH = "//a[contains(text(),'?')]";
	private static final String MY_BATIS_HOMEPAGE_XPATH = "//a[contains(text(),'www.mybatis.org')]";

	// ***LEFT MENU***
	private static final String FISH_LEFT_XPATH = "//div[@id='Content']//a[1]//img[1]";
	private static final String DOGS_LEFT_XPATH = "//div[@id='Content']//a[2]//img[1]";
	private static final String CATS_LEFT_XPATH = "//div[@id='Content']//a[3]//img[1]";
	private static final String REPTILES_LEFT_XPATH = "//div[@id='Content']//a[4]//img[1]";
	private static final String BIRDS_LEFT_XPATH = "//div[@id='Content']//a[5]//img[1]";

	// ***TOP MENU***
	private static final String FISH_TOP_XPATH = "//div[@id='QuickLinks']//a[1]//img[1]";
	private static final String DOGS_TOP_XPATH = "//div[@id='Header']//a[2]//img[1]";
	private static final String REPTILES_TOP_XPATH = "//div[@id='Header']//a[3]//img[1]";
	private static final String CATS_TOP_XPATH = "//a[4]//img[1]";
	private static final String BIRDS_TOP_XPATH = "//a[5]//img[1]";

	// ***PICTURES MENU***
	private static final String BIRDS_LARGE_PIC_XPATH = "//area[1]";
	private static final String FISH_PIC_XPATH = "//area[2]";
	private static final String DOGS_PIC_XPATH = "//area[3]";
	private static final String REPTILES_PIC_XPATH = "//area[4]";
	private static final String CATS_PIC_XPATH = "//area[5]";
	private static final String BIRDS_SMALL_PIC_XPATH = "//area[6]";

	// ***SIGN IN***

	// Sign In
	public static WebElement getSignIn(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_IN_XPATH));
	}

	public static void clickSignIn(WebDriver driver) {
		getSignIn(driver).click();
	}

	// ***SHOPPING CARD***

	// Shopping Card
	public static WebElement getShoppingCard(WebDriver driver) {
		return driver.findElement(By.xpath(SHOPPING_CARD_XPATH));
	}

	public static void clickShoppingCard(WebDriver driver) {
		getShoppingCard(driver).click();
	}

	// ***MYBATTIS MENU***

	// Help
	public static WebElement getHelp(WebDriver driver) {
		return driver.findElement(By.xpath(HELP_XPATH));
	}

	public static void clickHelp(WebDriver driver) {
		getHelp(driver).click();
	}

	// MyBatis Homepage
	public static WebElement getMyBatisHomepage(WebDriver driver) {
		return driver.findElement(By.xpath(MY_BATIS_HOMEPAGE_XPATH));
	}

	public static void clickMyBatisHomepage(WebDriver driver) {
		getMyBatisHomepage(driver).click();
	}

	// ***LEFT MENU***

	// Fish Left
	public static WebElement getFishLeft(WebDriver driver) {
		return driver.findElement(By.xpath(FISH_LEFT_XPATH));
	}

	public static void clickFishLeft(WebDriver driver) {
		getFishLeft(driver).click();
	}

	// Dogs Left
	public static WebElement getDogsLeft(WebDriver driver) {
		return driver.findElement(By.xpath(DOGS_LEFT_XPATH));
	}

	public static void clickDogsLeft(WebDriver driver) {
		getDogsLeft(driver).click();
	}

	// Cats Left
	public static WebElement getCatsLeft(WebDriver driver) {
		return driver.findElement(By.xpath(CATS_LEFT_XPATH));
	}

	public static void clickCatsLeft(WebDriver driver) {
		getCatsLeft(driver).click();
	}

	// Reptiles Left
	public static WebElement getReptilesLeft(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILES_LEFT_XPATH));
	}

	public static void clickReptilesLeft(WebDriver driver) {
		getReptilesLeft(driver).click();
	}

	// Birds Left
	public static WebElement getBirdsLeft(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDS_LEFT_XPATH));
	}

	public static void clickBirdsLeft(WebDriver driver) {
		getBirdsLeft(driver).click();
	}

	// ***TOP MENU***

	// Fish Top
	public static WebElement getFishTop(WebDriver driver) {
		return driver.findElement(By.xpath(FISH_TOP_XPATH));
	}

	public static void clickFishTop(WebDriver driver) {
		getFishTop(driver).click();
	}

	// Dogs Top
	public static WebElement getDogsTop(WebDriver driver) {
		return driver.findElement(By.xpath(DOGS_TOP_XPATH));
	}

	public static void clickDogsTop(WebDriver driver) {
		getDogsTop(driver).click();
	}

	// Reptiles Top
	public static WebElement getReptilesTop(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILES_TOP_XPATH));
	}

	public static void clickReptilesTop(WebDriver driver) {
		getReptilesTop(driver).click();
	}

	// Cats Top
	public static WebElement getCatsTop(WebDriver driver) {
		return driver.findElement(By.xpath(CATS_TOP_XPATH));
	}

	public static void clickCatsTop(WebDriver driver) {
		getCatsTop(driver).click();
	}

	// Birds Top
	public static WebElement getBirdsTop(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDS_TOP_XPATH));
	}

	public static void clickBirdsTop(WebDriver driver) {
		getBirdsTop(driver).click();
	}

	// ***PICTURES MENU***

	// Birds Large Picture
	public static WebElement getBirdsLargePicture(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDS_LARGE_PIC_XPATH));
	}

	public static void clickBirdsLargePicture(WebDriver driver) {
		getBirdsLargePicture(driver).click();
	}

	// Fish Picture
	public static WebElement getFishPicture(WebDriver driver) {
		return driver.findElement(By.xpath(FISH_PIC_XPATH));
	}

	public static void clickFishPicture(WebDriver driver) {
		getFishPicture(driver).click();
	}

	// Dogs Picture
	public static WebElement getDogsPicture(WebDriver driver) {
		return driver.findElement(By.xpath(DOGS_PIC_XPATH));
	}

	public static void clickDogsPicture(WebDriver driver) {
		getDogsPicture(driver).click();
	}

	// Reptiles Picture
	public static WebElement getReptilesPicture(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILES_PIC_XPATH));
	}

	public static void clickReptilesPicture(WebDriver driver) {
		getReptilesPicture(driver).click();
	}

	// Cats Picture
	public static WebElement getCatsPicture(WebDriver driver) {
		return driver.findElement(By.xpath(CATS_PIC_XPATH));
	}

	public static void clickCatsPicture(WebDriver driver) {
		getCatsPicture(driver).click();
	}

	// Birds Small Picture
	public static WebElement getBirdsPicture(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDS_SMALL_PIC_XPATH));
	}

	public static void clickBirdsPicture(WebDriver driver) {
		getBirdsPicture(driver).click();
	}

}
