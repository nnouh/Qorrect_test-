package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends PageBase {
	public WebDriver driver;

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	private By dresses = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
	private By summerdress = By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[3]/a");

	public void UserHoverOnDresses() {

		click(dresses);

		click(summerdress);
	}

}
