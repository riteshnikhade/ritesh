package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Grocery {
	
	@FindBy (xpath = "//img[@alt='Grocery']")
	private WebElement grocery ;
	
	public Grocery (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyGrocerytab()
	{
		 grocery.click();
	}

}
