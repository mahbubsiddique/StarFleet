package steps;

import common.AmazonBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonHome;
import pages.AmazonLoginPage;

public class AmazonLogin extends AmazonBase{
	
	@Given("I am on Amazon homepage")
	public void i_am_on_amazon_homepage() {

			launchBrowser();
		
	}

	@When("I click on sign in button")
	public void i_click_on_sign_in_button() {
		
	AmazonHome ah = new AmazonHome(driver);
	ah.clickSignIn();

		
	}

	@When("I enter {string} addreess and click continue")
	public void i_enter_addreess_and_click_continue(String email) {

		AmazonLoginPage alp = new AmazonLoginPage(driver);
		alp.enterEmailAddress(email);
		alp.clickContinue();
		
	}

	@When("I enter invalid {string} and click continue")
	public void i_enter_invalid_and_click_continue(String string) {

		
		
	}

	@Then("I receive an error message")
	public void i_receive_an_error_message() {

		
		
	}


}
