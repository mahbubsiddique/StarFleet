package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome {
	
	WebDriver driver;
	
	public AmazonHome(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//*[@id='nav-link-accountList-nav-line-1']")
	WebElement siginLink;

	public void clickSignIn() {
		siginLink.click();
	}

}
