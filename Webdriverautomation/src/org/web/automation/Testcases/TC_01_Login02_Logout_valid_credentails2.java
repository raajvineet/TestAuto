package org.web.automation.Testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01_Login02_Logout_valid_credentails2 {
	WebDriver driver;                // Declare the object globally will access in all the methods
	
	
	@BeforeMethod
	public void startBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		   
	}
		   
	@Test(priority=1)	                         
    public void TC002(){
    	 System.out.println("2");
		   driver.findElement(By.id("email")).sendKeys("hello");
		   driver.findElement(By.name("pass")).sendKeys("abc123");
		   driver.findElement(By.linkText("Forgotten account?")).click();
		   //driver.navigate().to("https://www.google.com");
		   //driver.navigate().back();
		   //driver.navigate().forward();
	
	}
  @Test(priority=2)	                         
  public void TC001(){
		   System.out.println("1"); 	 
			driver.findElement(By.id("email")).sendKeys("hello");
		    driver.findElement(By.name("pass")).sendKeys("abc123");
			driver.findElement(By.linkText("Forgotten account?")).click();
		   
	}
	@AfterMethod
	public void closeBrowser(){
		 driver.close();
		
	}
		   
		   
		  
				}

