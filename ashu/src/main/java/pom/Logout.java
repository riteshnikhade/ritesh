package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	WebDriver driver;
	
	Actions acts = new Actions(driver);
	
	@FindBy (xpath = "(//div[@class='exehdJ'])[1]")
	private WebElement flipkart ;

	@FindBy (xpath = "(//div[@class='_3vhnxf'])[10]")
	private WebElement logout ;
	
	public Logout (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void mouseactflip()
	{
		acts.moveToElement(flipkart).perform();
	}
	
	public void clickonlogout()
	{
		logout.click();
	} 

}
