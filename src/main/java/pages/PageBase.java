package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

	public WebDriver driver;

	public PageBase(WebDriver driver) {
		this.driver = driver;
	}

	public void click(By elemntButton) {
		driver.findElement(elemntButton).click();
	}

	public void sendTextM(By textField, String txt) {
		driver.findElement(textField).sendKeys(txt);
	}

	public void selectValuesM(By selectElemnt, int index) {

		Select selvalue = new Select(driver.findElement(selectElemnt));

		selvalue.selectByIndex(index);
	}

}
