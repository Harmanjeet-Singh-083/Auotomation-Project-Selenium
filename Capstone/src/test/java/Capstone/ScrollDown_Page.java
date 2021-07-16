package Capstone;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseHelper;

public class ScrollDown_Page extends ScrollDown{
	@Test(priority = 18)
	public void scroll() throws Exception
	{
		
		//BaseHelper.startApp(getObject("Home_Page_URL"), getObject("browser"));
	
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,350)", "");
	       System.out.println("aa");
	       
	       Assert.assertTrue(driver.findElement(find_aProgram_bar).isDisplayed(),"true");
	       System.out.println("bb");
	      // Assert.assertTrue(driver.findElement(homePageLogo).isDisplayed(), "true");
		
	}
	@Test(priority = 19)
	public void All_Program() throws Exception
	{
		Assert.assertEquals(driver.findElement(all_Program).getText(),getObject("All_Programs"));
		
	}
	
	@Test(priority = 20)
	public void Program_categories() throws Exception
	{
		
		Assert.assertEquals(driver.findElement(program_categories).getText(),getObject("Program_Categories"));
		
	}
	
	@Test(priority = 21)
	public void Program_categories_click() throws Exception
	{
		
		driver.findElement(program_categories).click();
		
	}
	
	//  //*[@id="ctl00_ctl00_cphslideshow_cphslideshow_uxNavigationMenu_lstProgramType"]//li
	//(//*[@class='row']//div/h2)[1]
	@Test(priority = 22)
	public void Program_categories_elements() throws Exception
	{
		
		ArrayList<WebElement> ListDropDown = new ArrayList<>(driver.findElements(By.xpath("//*[@id='ctl00_ctl00_cphslideshow_cphslideshow_uxNavigationMenu_lstProgramType']//li")));
		ListDropDown.stream().forEach(s->System.out.println(s.getText()));
	}
	
}


