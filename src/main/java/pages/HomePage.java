package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);

	}

	private By singIn = By.xpath("//div//a[@class='login']");

	public void clickSignIn() {
		click(singIn);
	}

}
