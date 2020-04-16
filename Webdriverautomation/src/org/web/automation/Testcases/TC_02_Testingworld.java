package org.web.automation.Testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_02_Testingworld {
	
	public void tc_02_registration()
	{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.thetestingworld.com/testings/");
		driver.manage().window().maximize();
		
		driver.findElementByName("fld_username").sendKeys("vraj");
		driver.findElementByName("fld_email").sendKeys("v.raj@gmail.com");
		driver.findElementByName("fld_password").sendKeys("abc12");
		driver.findElementByName("fld_cpassword").sendKeys("abc12");
		//driver.findElementByName("dob").click();
		driver.findElementByName("dob").sendKeys("10/11/1990");
		//driver.findElementByName("dob").click();
		js.executeScript("window.scrollBy(0,250)");
		driver.findElementByName("phone").sendKeys("9910081057");
		driver.findElementByName("address").sendKeys("Noida");
		
		
		driver.findElementByName("add_type").click();
		Select add1=new Select(driver.findElementByName("sex"));
		//driver.findElementByName("sex").click();
		add1.selectByVisibleText("Male");
		Select add2=new Select(driver.findElementByName("country"));
		//driver.findElementByName("country").click();
		add2.selectByVisibleText("Australia");
	
		Select add3=new Select(driver.findElementByName("state"));
		add3.selectByVisibleText("Perth");
		Select add4=new Select(driver.findElementByName("city"));
		add4.selectByVisibleText("Miami");
		
		driver.findElementByName("zip").sendKeys("201301");
		driver.findElementByName("terms").click();
			
				
	}
	
public static void main(String[] args){
		
	TC_02_Testingworld obj2= new TC_02_Testingworld();
		obj2.tc_02_registration();

}
}

