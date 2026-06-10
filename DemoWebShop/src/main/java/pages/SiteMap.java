package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SiteMap {

	public SiteMap(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
