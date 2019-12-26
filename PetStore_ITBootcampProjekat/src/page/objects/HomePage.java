package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static final String HOME_URL = "https://petstore.octoperf.com/";
	public static final String ENTER_URL = "https://petstore.octoperf.com/actions/Catalog.action";
	
	private static final String ENTER_THE_STORE_XPATH = "//a[contains(text(),'Enter the Store')]";

	public static WebElement getEnterTheStore(WebDriver driver) {
		return driver.findElement(By.xpath(ENTER_THE_STORE_XPATH));
	}

	public static void clickEnterTheStore(WebDriver driver) {
		getEnterTheStore(driver).click();
	}

}
