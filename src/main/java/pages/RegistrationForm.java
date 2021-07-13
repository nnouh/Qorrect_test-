package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationForm extends PageBase {

	WebDriver driver;

	public RegistrationForm(WebDriver driver) {
		super(driver);

	}

	private By mrsTitle = By.id("id_gender2");
	private By cFname = By.id("customer_firstname");
	private By cLName = By.id("customer_lastname");
	public By formEmail = By.id("email");
	private By password = By.id("passwd");
	private By dateDays = By.id("days");
	private By dateMothes = By.id("months");
	private By dateYears = By.id("years");
	private By newsletter = By.id("newsletter");
	private By specialOffers = By.id("optin");
	private By company = By.id("company");
	private By addline1 = By.id("address1");
	private By city = By.id("city");
	private By state = By.id("id_state");
	private By postCode = By.id("postcode");
	private By country = By.id("id_country");
	private By additionalInfo = By.id("other");
	private By phone = By.id("phone");
	private By mobilPhone = By.id("phone_mobile");
	private By addressAliasFuture = By.id("alias");
	private By submit = By.id("submitAccount");

	public void userRegisteration(String fnam, String snam, String pw, int days, int months, int years, String comp,
			String addLn1, String cty, int stat, String postalCod, int contry, String addinfo, String ph, String mobph,
			String addInFuture) {
		click(mrsTitle);
		sendTextM(cFname, fnam);
		sendTextM(cLName, snam);
		sendTextM(password, pw);
		selectValuesM(dateDays, days);
		selectValuesM(dateMothes, months);
		selectValuesM(dateYears, years);
		click(newsletter);
		click(specialOffers);
		// sendTextM(addFName, addFnm);
		// sendTextM(addLName, addLnum);
		sendTextM(company, comp);
		sendTextM(addline1, addLn1);
		sendTextM(city, cty);
		selectValuesM(state, stat);
		sendTextM(postCode, postalCod);
		selectValuesM(country, contry);
		sendTextM(additionalInfo, addinfo);
		sendTextM(phone, ph);
		sendTextM(mobilPhone, mobph);
		sendTextM(addressAliasFuture, addInFuture);
		click(submit);
	}

}
