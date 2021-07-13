package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectProduct extends PageBase {
	public SelectProduct(WebDriver driver) {
		super(driver);
	}

	private By list = By.id("list");
	private By selectDress = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[2]/a[2]/span");

	private By color = By.id("color_13");
	private By Size = By.id("group_1");
	private By addToCart = By.name("Submit");
	private By proceed = By.xpath("//a[@class='btn btn-default button button-medium']");
	private By verificationText = By.xpath("//span[@class=\"heading-counter\"]");

	public void moreClick() {
		click(list);
		click(selectDress);
		click(color);
		selectValuesM(Size, 2);
		click(addToCart);
		click(proceed);

	}

	public String veriftxt() {
		return driver.findElement(verificationText).getText();
	}
}