package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends PageBase {
	WebDriver driver;

	public Login(WebDriver driver) {
		super(driver);
	}

	private By logIn = By.xpath("//div//a[@class='login']");
	private By loginEmail = By.id("email");
	private By loginPw = By.id("passwd");
	private By submitLogin = By.id("SubmitLogin");

	
	public void clickLogIn(String pwlogin) {
		CreateAnAccount logonCreatObj = new CreateAnAccount(driver);
		click(logIn);
		sendTextM(loginEmail, logonCreatObj.email);

		sendTextM(loginPw, pwlogin);
		click(submitLogin);

	}

}
