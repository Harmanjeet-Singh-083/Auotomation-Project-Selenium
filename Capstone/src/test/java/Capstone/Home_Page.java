package Capstone;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public 	class Home_Page extends Home_Page_Object {
	
	
	WebDriver driver = new ChromeDriver();
	Properties prop=new Properties();
	
	@BeforeClass
	public void setProperties() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// driver object
		
		FileInputStream ip= new FileInputStream("C:\\Users\\dell1\\eclipse-workspace\\Capstone\\src\\test\\java\\data.properties");
		prop.load(ip);
		
	}
	
	
	
@Test(priority = 1)
	public void verifyTitileHomePage() throws IOException {
	
	
	driver.get(prop.getProperty("Home_Page_URL"));
		Assert.assertEquals(driver.getTitle(), "Welcome | Lambton College");
		
	}

@Test (priority = 2)
public void verifyURLHomePage () {
	Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("Home_Page_URL"));
}
	
@Test (priority = 3)
public void verifyLogoHomePage () {
	System.out.println(driver.findElement(logoHomePage).isDisplayed() + "Harman");
	Assert.assertTrue(driver.findElement(logoHomePage).isDisplayed(), "true");
	
	
	
}
	
}
