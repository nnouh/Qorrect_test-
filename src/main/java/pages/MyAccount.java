package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount extends PageBase {

	public WebDriver driver;

	public MyAccount(WebDriver driver) {
		super(driver);

	}

	public By successfulMessage = By.partialLinkText("Welcome to your account.");
	private By logout = By.xpath("// *[contains(text(),'Sign out') and @class='logout']");

	public void logout() {
		click(logout);

	}

}
