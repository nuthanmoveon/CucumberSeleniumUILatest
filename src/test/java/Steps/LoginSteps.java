package Steps;

import Driver.BaseDriver;
import Pages.PageObjects;
import Utils.ConfigUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps {

	@Given("User is on the login page")
	public void userIsOnTheLoginPage() {
		PageObjects.getLoginPage().openURL(ConfigUtils.getURL());
	}

	@When("user enters {string} and {string}")
	public void userEntersUsernameAndPassword(String userName, String Password) {
		PageObjects.getLoginPage().enterUsername(userName);
		PageObjects.getLoginPage().enterPassword(Password);
	}

	@And("Click on login button")
	public void clicksOnTheLoginButton() {
		PageObjects.getLoginPage().clickLogin();
	}

	@SuppressWarnings("deprecation")
	@Then("The user should be navigated to the home page having text {string}")
	public void userShouldBeNavigatedToHomePage(String verifyTextProduct) {
		Assert.assertEquals(verifyTextProduct, PageObjects.getHomePage().getProductText());
		BaseDriver.quitDriver();
	}
}