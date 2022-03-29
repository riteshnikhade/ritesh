package ashu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.Grocery;
import pom.Login;
import pom.Logout;



public class Testclass {

	    WebDriver driver ;
	    Grocery grocery ;
		Login login ;
		Logout logout;	
		
		@BeforeClass
		
		public void lunchbrowser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		 }
		
		@BeforeMethod
		
			public void loginpage() throws InterruptedException
			{
			Thread.sleep(4000);
			driver.get("http://www.flipkart.com");
			 login = new Login(driver);
			
			
			
		
			}
		
		@Test(priority = 1)
		public void verifylogin() throws InterruptedException
		{
			Thread.sleep(4000);
			login.sendusername();
			login.sendpassword();
			login.clickonlogin();
		}
		
//		@Test(priority = 2)
//		public void verifyGrocery() throws InterruptedException
//		{
//			grocery = new Grocery(driver);
//			Thread.sleep(4000);
//			grocery.verifyGrocerytab(); 
//		}
//		
		@AfterMethod
		public void logout() throws InterruptedException
		{
			logout = new Logout(driver);
			Thread.sleep(4000);
			logout.mouseactflip();
			logout.clickonlogout();
		}
		
		@AfterClass
		public void closebrowser()
		{
			driver.quit();
		}
	
}

