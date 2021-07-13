package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pages.CreateAnAccount;
import pages.HomePage;
import pages.MyAccount;
import pages.RegistrationForm;

public class RegistrationTest  extends TestBase{
	String fnamT = "Nashwa";
	String snamT = "Nouh";
	String pwT = "12345";
	int daysT = 3;
	int monthsT = 5;
	int yearsT = 7;
	String compT = "Qorrect";
	String addLn1T = "Cairo, Giza";
	String addLn2T = "Cairo, Nasr City";
	String cityT = "Cairo";
	int statT = 1;
	String postalCodT = "12345";
	int contryT = 1;
	String addinfoT = "my demo";
	String phT = "3788900";
	String mobphT = "123456778";
	String addInFutureT = "new address in future";

	@Test
	@Description("user strat to login")
	public void openSignInPage() {

		HomePage homeP = new HomePage(driver);
		homeP.clickSignIn();

	}
	
	@Test(dependsOnMethods = "openSignInPage")
	@Description("the e-mail should be unique")
	public void clickCreateAnAccount() {
		CreateAnAccount createAcount = new CreateAnAccount(driver);

		createAcount.enterEmail();
	}

	@Test(dependsOnMethods = "clickCreateAnAccount")
	public void userRegistrationTest() {
		
		RegistrationForm registObj = new RegistrationForm(driver);

		registObj.userRegisteration(fnamT, snamT, pwT, daysT, monthsT, yearsT, compT, addLn1T,
				 cityT, statT, postalCodT, contryT, addinfoT, phT, mobphT, addInFutureT);
		
		
	}
	@Test(dependsOnMethods ="userRegistrationTest" )
	public void myAccountassertion() {
		
		MyAccount accountTextObj = new MyAccount(driver);
		   Assert.assertTrue(accountTextObj.successfulMessage.toString().contains("Welcome"));
		   accountTextObj.logout();

	}


}
