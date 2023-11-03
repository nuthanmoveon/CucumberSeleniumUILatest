package Driver;

import java.time.Duration;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import SeleniumCommon.SeleniumCommonMethods;
import Utils.ConfigUtils;

public class BaseDriver {

	public static WebDriver driver1;

	public void setDriver(WebDriver driver) {
		driver1 = driver;
	}

	@BeforeClass
	public static WebDriver createDriver() {
		BaseDriver baseDriver = new BaseDriver();
		String browser = ConfigUtils.getBrowser();
		WebDriver driver = null;
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Drivers\\chromedriver.exe");

			// Initialize chrome WebDriver
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Drivers\\geckodriver.exe");

			// Initialize Firefox WebDriver
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		baseDriver.setDriver(driver);
		return driver;
	}

	public static WebDriver getDriver() {
		return driver1;
	}
	
	@AfterClass
	public static void quitDriver() {
		driver1.quit();
	}

}
