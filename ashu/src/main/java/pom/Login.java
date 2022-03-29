package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy (xpath = "(//input[@autocomplete='off'])[2]")
	private WebElement username ;
	
	@FindBy (xpath = "(//input[@autocomplete='off'])[3]")
	private WebElement password ;
	
	@FindBy (xpath = "(//button[@type='submit'])[2]")
	private WebElement login ;
	
	public Login (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendusername()
	{
		 username.sendKeys("7066139181");
	}
	
	public void sendpassword()
	{
		password .sendKeys("password@flipkart");
	}
	
	public void clickonlogin()
	{
		 login.click();
	}
	
}
