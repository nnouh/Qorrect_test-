package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

public class CreateAnAccount extends PageBase {

	public WebDriver driver;

	public CreateAnAccount(WebDriver driver) {
		super(driver);
	}

	Faker fakeEmail = new Faker();

	private By emailField = By.id("email_create");
	private By createAnAcountButton = By.id("SubmitCreate");
	public String email = fakeEmail.internet().emailAddress();

	public void enterEmail() {

		sendTextM(emailField, email);
		click(createAnAcountButton);
	}

}
