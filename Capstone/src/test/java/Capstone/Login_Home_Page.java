package Capstone;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import Base.BaseHelper;

public class Login_Home_Page extends Login_Home{

	@Test(priority = 1)
	public void Login() throws Exception
	{		
		
	BaseHelper.startApp(getObject("Home_Page_URL"), getObject("browser"));
	
	
	}
	@Test(priority = 2)
	public void HomePageVerifyTitle() throws Exception {
		// getting the Title Of the Page
		
		Assert.assertEquals(driver.getTitle(), getObject("Title_Home_Page"));
		
		
		
	}
	
	
	
	@Test(priority = 3)
	public void HomePageVerifyLogo() {
		

		Assert.assertTrue(driver.findElement(homePageLogo).isDisplayed(), "true");
		
	}
	
	@Test(priority = 4)
	public void HomePageDropDownsCount() throws Exception {
		// No. Of Drop Down Menus
	int a=6;	  
		Assert.assertEquals(driver.findElements(dropDownsHomePage).size(),a);
		
		
	}
	
	@Test(priority = 5)
	public void HomePageDropDownsName() throws Exception {
		// Getting Name of Each Drop Down Menus 
		
		ArrayList<WebElement> dropDowns = new ArrayList<>(driver.findElements(dropDownsHomePage));
		
		dropDowns.stream().forEach(s->System.out.println(s.getText()));
		
		List<String> listOfDropDown = dropDowns.stream() .map(s->s.getText()) .collect(Collectors.toList());
		boolean isEqual = listOfDropDown.equals(arraylist());
		
		Assert.assertTrue( isEqual);
	}
	
	
	@Test(priority = 6)
	public void VerifyVisitTagHomePagePresence() throws Exception {
		
		
		// verify the presence of Visit Tag
		Assert.assertTrue(driver.findElement(homePageVisitTag).isDisplayed(), "true");
		
		
	}
	@Test(priority = 7)
	public void VerifyVisitTagHomePageName() throws Exception {
		
			
		Assert.assertEquals(driver.findElement(homePageVisitTag).getText(),getObject("Home_Page_Visit"));
		
	}
	
	@Test(priority = 8)
	public void VerifyMyLambtonHomePagePresence() throws Exception {
		
		
		// verify the presence of Visit Tag
		Assert.assertTrue(driver.findElement(homePageMyLambton).isDisplayed(), "true");
		
		
	}
	@Test(priority = 9)
	public void VerifyMyLambtonTagHomePageName() throws Exception {
		
			
		Assert.assertEquals(driver.findElement(homePageMyLambton).getText(),getObject("Home_Page_MyLambton"));
		
	}
	
	@Test(priority = 10)
	public void VerifySearchBarHomePagePresence() throws Exception {
		
		
		// verify the presence of Visit Tag
		Assert.assertTrue(driver.findElement(homePageSearchBar).isDisplayed(), "true");
		
		
	}
	@Test(priority = 11)
	public void VerifySearchButtonHomePagePresence() throws Exception {
		
		
		// verify the presence of Visit Tag
		Assert.assertTrue(driver.findElement(homePageSearchButton).isDisplayed(), "true");
		
		
	}
	
	
	
	
	
	
	
	@AfterSuite  
	public void after_suite()  
	{  
	   //driver.quit();
	      
	}  
	
}
