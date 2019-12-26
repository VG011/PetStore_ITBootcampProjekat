package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	public static final String REG_URL = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";

	// ***MY ACCOUNT***
	public static final String MY_ACCOUNT_LINK = "//a[contains(text(),'My Account')]";

	// ***USER INFORMATION***
	private static final String TXT_USER_ID_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	private static final String TXT_NEW_PASSWORD_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]";
	private static final String TXT_REPEAT_PASSWORD_XPATH = "//input[@name='repeatedPassword']";

	// ***ACCOUNT INFORMATION***
	private static final String TXT_FIRST_NAME_XPATH = "//input[@name='account.firstName']";
	private static final String TXT_LAST_NAME_XPATH = "//input[@name='account.lastName']";
	private static final String TXT_EMAIL_XPATH = "//input[@name='account.email']";
	private static final String TXT_PHONE_XPATH = "//input[@name='account.phone']";
	private static final String TXT_ADDRESS1_XPATH = "//input[@name='account.address1']";
	private static final String TXT_ADDRESS2_XPATH = "//input[@name='account.address2']";
	private static final String TXT_CITY_XPATH = "//input[@name='account.city']";
	private static final String TXT_STATE_XPATH = "//input[@name='account.state']";
	private static final String TXT_ZIP_XPATH = "//input[@name='account.zip']";
	private static final String TXT_COUNTRY_XPATH = "//input[@name='account.country']";

	// ***PROFILE INFORMATION***
	private static final String SELECT_LANGUAGE_XPATH = "//select[@name='account.languagePreference']";
	private static final String SELECT_FAVOURITE_CATEGORY_XPATH = "//select[@name='account.favouriteCategoryId']";
	private static final String CHECK_MYLIST_XPATH = "//input[@name='account.listOption']";
	private static final String CHECK_MYBANNER_XPATH = "//input[@name='account.bannerOption']";

	// ***SAVE ACCOUNT INFORMATION***
	private static final String SAVE_ACC_XPATH = "//input[@name='newAccount']";

	// ***EDIT ACCOUNT***
	private static final String EDIT_ACC_XPATH = "//input[@name='editAccount']";

	// PERSIAN CAT
	private static final String PERSIAN_CAT_XPATH = "//a[contains(text(),'FL-DLH-02')]";
	private static final String PERSIAN_CAT_MALE_XPATH = "//a[contains(text(),'EST-17')]";
	private static final String ADD_PERSIAN_CAT_MALE_XPATH = "//a[@class='Button']";
	public static final String EST_17_PERSIAN_CAT_XPATH = "//a[contains(text(),'EST-17')]";

	// ***MY ACCOUNT***
	// My Account
	public static WebElement getMyAccount(WebDriver driver) {
		return driver.findElement(By.xpath(MY_ACCOUNT_LINK));
	}

	public static void clickMyAccount(WebDriver driver) {
		getMyAccount(driver).click();
	}

	// ***USER INFORMATION***
	// UserID
	public static WebElement getUserID(WebDriver driver) {
		return driver.findElement(By.xpath(TXT_USER_ID_XPATH));
	}

	public static void clickUserID(WebDriver driver) {
		getUserID(driver).click();
	}

	public static void inputUserID(WebDriver driver, String data) {
		getUserID(driver).sendKeys(data);
	}

	// Password
	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(TXT_NEW_PASSWORD_XPATH));
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void clearPassword(WebDriver driver) {
		getPassword(driver).clear();
	}

	public static void inputPassword(WebDriver driver, String data) {
		getPassword(driver).sendKeys(data);
	}

	// Repeat Password
	public static WebElement getRepeatPassword(WebDriver driver) {
		return driver.findElement(By.xpath(TXT_REPEAT_PASSWORD_XPATH));
	}

	public static void clickRepeatPassword(WebDriver driver) {
		getRepeatPassword(driver).click();
	}

	public static void clearRepeatPassword(WebDriver driver) {
		getRepeatPassword(driver).clear();
	}

	public static void inputRepeatPassword(WebDriver driver, String data) {
		getRepeatPassword(driver).sendKeys(data);
	}

	// ***ACCOUNT INFORMATION***
	// FirstName
	public static WebElement getName(WebDriver driver) {
		return driver.findElement(By.xpath(TXT_FIRST_NAME_XPATH));
	}

	public static void clickName(WebDriver driver) {
		getName(driver).click();
	}

	public static void clearName(WebDriver driver) {
		getName(driver).clear();
	}

	public static void inputName(WebDriver driver, String data) {
		getName(driver).sendKeys(data);
	}

	// LastName
	public static WebElement getLastName(WebDriver driver) {
		return driver.findElement(By.xpath(TXT_LAST_NAME_XPATH));
	}

	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void clearLastName(WebDriver driver) {
		getLastName(driver).clear();
	}

	public static void inputLastName(WebDriver driver, String data) {
		getLastName(driver).sendKeys(data);
	}

	// Email
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(TXT_EMAIL_XPATH));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void clearEmail(WebDriver driver) {
		getEmail(driver).clear();
	}

	public static void inputEmail(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}

	// Phone
	public static WebElement getPhone(WebDriver driver) {
		return driver.findElement(By.xpath(TXT_PHONE_XPATH));
	}

	public static void clickPhone(WebDriver driver) {
		getPhone(driver).click();
	}

	public static void clearPhone(WebDriver driver) {
		getPhone(driver).clear();
	}

	public static void inputPhone(WebDriver driver, String data) {
		getPhone(driver).sendKeys(data);
	}

	// Address1
	public static WebElement getAddress1(WebDriver driver) {
		return driver.findElement(By.xpath(TXT_ADDRESS1_XPATH));
	}

	public static void clickAddress1(WebDriver driver) {
		getAddress1(driver).click();
	}

	public static void clearAddress1(WebDriver driver) {
		getAddress1(driver).clear();
	}

	public static void inputAddress1(WebDriver driver, String data) {
		getAddress1(driver).sendKeys(data);
	}

	// Address2
	public static WebElement getAddress2(WebDriver driver) {
		return driver.findElement(By.xpath(TXT_ADDRESS2_XPATH));
	}

	public static void clickAddress2(WebDriver driver) {
		getAddress2(driver).click();
	}

	public static void clearAddress2(WebDriver driver) {
		getAddress2(driver).clear();
	}

	public static void inputAddress2(WebDriver driver, String data) {
		getAddress2(driver).sendKeys(data);
	}

	// City
	public static WebElement getCity(WebDriver driver) {
		return driver.findElement(By.xpath(TXT_CITY_XPATH));
	}

	public static void clickCity(WebDriver driver) {
		getCity(driver).click();
	}

	public static void clearCity(WebDriver driver) {
		getCity(driver).clear();
	}

	public static void inputCity(WebDriver driver, String data) {
		getCity(driver).sendKeys(data);
	}

	// State
	public static WebElement getState(WebDriver driver) {
		return driver.findElement(By.xpath(TXT_STATE_XPATH));
	}

	public static void clickState(WebDriver driver) {
		getState(driver).click();
	}

	public static void clearState(WebDriver driver) {
		getState(driver).clear();
	}

	public static void inputState(WebDriver driver, String data) {
		getState(driver).sendKeys(data);
	}

	// Zip
	public static WebElement getZip(WebDriver driver) {
		return driver.findElement(By.xpath(TXT_ZIP_XPATH));
	}

	public static void clickZip(WebDriver driver) {
		getZip(driver).click();
	}

	public static void clearZip(WebDriver driver) {
		getZip(driver).clear();
	}

	public static void inputZip(WebDriver driver, String data) {
		getZip(driver).sendKeys(data);
	}

	// Country
	public static WebElement getCountry(WebDriver driver) {
		return driver.findElement(By.xpath(TXT_COUNTRY_XPATH));
	}

	public static void clickCountry(WebDriver driver) {
		getCountry(driver).click();
	}

	public static void clearCountry(WebDriver driver) {
		getCountry(driver).clear();
	}

	public static void inputCountry(WebDriver driver, String data) {
		getCountry(driver).sendKeys(data);
	}

	// ***PROFILE INFORMATION***

	// Language Preference
	public static Select getLanguagePreference(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_LANGUAGE_XPATH)));
	}

	public static void inputLanguagePreference(WebDriver driver, String data) {
		getLanguagePreference(driver).selectByVisibleText(data);
	}

	// Favourite Category
	public static Select getFavouriteCategory(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(SELECT_FAVOURITE_CATEGORY_XPATH)));
	}

	public static void inputFavouriteCategory(WebDriver driver, String data) {
		getFavouriteCategory(driver).selectByVisibleText(data);
	}

	// Enable MyList
	public static WebElement getMyList(WebDriver driver) {
		return driver.findElement(By.xpath(CHECK_MYLIST_XPATH));
	}

	public static void clickMyList(WebDriver driver) {
		getMyList(driver).click();
	}

	// Enable MyBanner
	public static WebElement getMyBanner(WebDriver driver) {
		return driver.findElement(By.xpath(CHECK_MYBANNER_XPATH));
	}

	public static void clickMyBanner(WebDriver driver) {
		getMyBanner(driver).click();
	}

	// Save Account Information
	public static WebElement getSaveAcc(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_ACC_XPATH));
	}

	public static void clickSaveAcc(WebDriver driver) {
		getSaveAcc(driver).click();
	}

	// Edit Account Information
	public static WebElement getEditAcc(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_ACC_XPATH));
	}

	public static void clickEditAcc(WebDriver driver) {
		getEditAcc(driver).click();
	}

	// Persian Cat
	public static WebElement getPersianCat(WebDriver driver) {
		return driver.findElement(By.xpath(PERSIAN_CAT_XPATH));
	}

	public static void clickPersianCat(WebDriver driver) {
		getPersianCat(driver).click();
	}

	// Persian Cat Male
	public static WebElement getPersianCatMale(WebDriver driver) {
		return driver.findElement(By.xpath(PERSIAN_CAT_MALE_XPATH));
	}

	public static void clickPersianCatMale(WebDriver driver) {
		getPersianCatMale(driver).click();
	}

	// Add Persian Cat Male
	public static WebElement getAddPersianCatMale(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_PERSIAN_CAT_MALE_XPATH));
	}

	public static void clickAddPersianCatMale(WebDriver driver) {
		getAddPersianCatMale(driver).click();
	}
}
