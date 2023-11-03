package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Driver.BaseDriver;
import SeleniumCommon.SeleniumCommonMethods;

public class HomePage extends SeleniumCommonMethods {
	public HomePage() {
		PageFactory.initElements(BaseDriver.getDriver(), this);
	}

	@FindBy(xpath = " //span[contains(text(),'Products')]")
	private WebElement productsText;

	public String getProductText() {
		return getText(productsText);
	}
}
