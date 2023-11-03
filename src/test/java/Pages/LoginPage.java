package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Driver.BaseDriver;
import SeleniumCommon.SeleniumCommonMethods;

public class LoginPage extends SeleniumCommonMethods {
	
	public LoginPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
    
    @FindBy(id = "user-name")
    private WebElement usernameInput;
    
    @FindBy(id = "password")
    private WebElement passwordInput;
    
    @FindBy(id = "login-button")
    private WebElement loginButton;
    
    public void enterUsername(String username) {
       typeText(usernameInput, username);
    }
    
    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }
    
    public void clickLogin() {
        loginButton.click();
    }
	

}
