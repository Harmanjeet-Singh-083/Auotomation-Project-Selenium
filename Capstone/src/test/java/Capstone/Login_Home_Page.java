package Capstone;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import Base.BaseHelper;

public class Login_Home_Page extends Login_Home{

	@Test(priority = 1)
	public void Login() throws Exception
	{		
		
	BaseHelper.startApp(getObject("Home_Page_URL"), getObject("browser"));
	//BaseHelper.loginToMedworxx(driver,getObject("username"), getObject("password"));
	//Assert.assertEquals(driver.getCurrentUrl(), getObject("url")+"UnitBoard");	
	//Thread.sleep(4000);
	//BaseHelper.logOut(driver);
	Thread.sleep(2000);
	//driver.close();
	}
	@Test(priority = 2)
	public void HomePageVerifyTitle() throws Exception {
		// getting the Title Of the Page
		//driver.getTitle();
		//Assert.assertEquals(driver.getTitle(), getObject("Title_Home_Page"));
		
		
		
	}
	
	
	
	@Test(priority = 3)
	public void HomePageVerifyLogo() {
		

		Assert.assertTrue(driver.findElement(homePageLogo).isDisplayed(), "true");
		//BaseHelper.click(myLambton);
	}
	
	@Test(priority = 4)
	public void HomePageDropDownsCount() throws Exception {
		// No. Of Drop Down Menus
	int a=6;	  
		Assert.assertEquals(driver.findElements(dropDownsHomePage).size(),a);
		
		//BaseHelper.click(myLambton);
	}
	
	@Test(priority = 5)
	public void HomePageDropDownsName() throws Exception {
		// Printing Name of Each Drop Down Menus 
		
		ArrayList<WebElement> dropDowns = new ArrayList<>(driver.findElements(dropDownsHomePage));
		dropDowns.stream().forEach(s->System.out.println(s.getText()));
		
		
		//List dropDowns = (List) driver.findElements(dropDownsHomePage);
		
		//Assert.assertEquals(driver.findElements(dropDownsHomePageLogo).size(),a);
		
		//BaseHelper.click(myLambton);
	}
	
	
	@Test(priority = 6)
	public void VerifyVisitTagHomePagePresence() throws Exception {
		// Printing Name of Each Drop Down Menus 
		
		// verify the presence of Visit Tag
		Assert.assertTrue(driver.findElement(homePageVisitTag).isDisplayed(), "true");
		
		
		
		//List dropDowns = (List) driver.findElements(dropDownsHomePage);
		
		//Assert.assertEquals(driver.findElements(dropDownsHomePageLogo).size(),a);
		
		//BaseHelper.click(myLambton);
	}
	@Test(priority = 7)
	public void VerifyVisitTagHomePageName() throws Exception {
		// Printing Name of Each Drop Down Menus 
		
		// verify the presence of Visit Tag
		//Assert.assertTrue(driver.findElement(homePageVisitTag).isDisplayed(), "true");
		
		System.out.println(driver.findElement(homePageVisitTag).getText());
		System.out.println(getObject("chromedriver"));
		System.out.println(getObject("chromedriver_location"));
		System.out.println(getObject("browserName"));
		System.out.println(getObject("Title_Home_Page"));
		System.out.println(getObject("Abc"));
		System.out.println(getObject("Home_Page_Visit"));
		//System.out.println(getObject("Home_Page_Visit"));
		
		
		
		Assert.assertEquals(driver.findElement(homePageVisitTag).getText(),getObject("Home_Page_Visit"));
	}
	
	@AfterSuite  
	public void after_suite()  
	{  
	    driver.quit();
	      
	}  
	
}
