package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	public static final String SIGNIN_URL = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
	
	

	private static final String USERNAME_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";
	private static final String PASSWORD_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]";
	private static final String LOGIN_XPATH = "//input[@name='signon']";
	private static final String REGISTRATION_XPATH = "//a[contains(text(),'Register Now!')]";

	private static final String SIGNIN_XPATH = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[2]";
	
	private static final String LOGOUT_XPATH = "//a[contains(text(),'Sign Out')]";

	private static final String MY_ACCOUNT_XPATH = "//a[contains(text(),'My Account')]";

	public static final String LOGIN_TXT_XPATH = "//p[contains(text(),'Please enter your username and password.')]";

	// Sign In
	public static WebElement getSignIn(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNIN_XPATH));
	}

	public static void clickSignIn(WebDriver driver) {
		getSignIn(driver).click();
	}

	// Username
	public static WebElement getUsername(WebDriver driver) {
		return driver.findElement(By.xpath(USERNAME_XPATH));
	}

	public static void clickUsername(WebDriver driver) {
		getUsername(driver).click();
	} 

	public static void inputUsername(WebDriver driver, String data) {
		getUsername(driver).sendKeys(data);
	}

	// Password
	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_XPATH));
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

	// Login
	public static WebElement getLogin(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_XPATH));
	}

	public static void clickLogin(WebDriver driver) {
		getLogin(driver).click();
	}

	// Registration
	public static WebElement getRegistration(WebDriver driver) {
		return driver.findElement(By.xpath(REGISTRATION_XPATH));
	}

	public static void clickRegistration(WebDriver driver) {
		getRegistration(driver).click();
	}

	// Logout
	public static WebElement getLogout(WebDriver driver) {
		return driver.findElement(By.xpath(LOGOUT_XPATH));
	}

	public static void clickLogout(WebDriver driver) {
		getLogout(driver).click();
	}

	// My Account
	public static WebElement getMyAccount(WebDriver driver) {
		return driver.findElement(By.xpath(MY_ACCOUNT_XPATH));
	}

	public static void clickMyAccount(WebDriver driver) {
		getMyAccount(driver).click();
	}
}
