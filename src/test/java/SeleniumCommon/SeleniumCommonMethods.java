package SeleniumCommon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Driver.BaseDriver;

public class SeleniumCommonMethods extends BaseDriver {

	public void openURL(String url) {
		WebDriver driver =BaseDriver.createDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void click(WebElement webElement) {
		webElement.click();
	}

	public void typeText(WebElement webElement, String text) {
		webElement.sendKeys(text);
	}

	public void clearText(WebElement webElement) {
		webElement.clear();
	}

	public String getText(WebElement webElement) {
		return webElement.getText();
	}

	public boolean isPresent(WebElement webElement) {
		return webElement.isDisplayed();
	}

	public boolean isEnabled(WebElement webElement) {
		return webElement.isEnabled();
	}

	public boolean isSelected(WebElement webElement) {
		return webElement.isSelected();
	}

	public void selectValue(WebElement webElement, String selectValue) {
		Select select = new Select(webElement);
		select.selectByValue(selectValue);
	}

	public void waitUntilElementToVisible(WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOfElementLocated((By) webElement));

	}

}
