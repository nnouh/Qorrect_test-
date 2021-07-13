package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Login;
import pages.ProductPage;
import pages.SelectProduct;

class ProductTest extends TestBase {

	@Test
	public void testLogine() {
		Login logObj = new Login(driver);
		RegistrationTest regTest = new RegistrationTest();
		logObj.clickLogIn(regTest.pwT);

	}

	@Test(dependsOnMethods = "testLogine")
	public void dressesPageTest() {

		ProductPage dress = new ProductPage(driver);
		dress.UserHoverOnDresses();
	}

	@Test(dependsOnMethods = "dressesPageTest")
	public void productDetails() {
		SelectProduct productDetails = new SelectProduct(driver);
		productDetails.moreClick();
	}

	@Test(dependsOnMethods = "productDetails")
	public void verificationlinktext() {
		SelectProduct productDet = new SelectProduct(driver);
		Assert.assertTrue(productDet.veriftxt().toString().contains("Your shopping cart contains:"));
	}
}
