package Capstone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
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
		//System.out.println("aa1");
		//ArrayList<WebElement> ListContent = new ArrayList<>(driver.findElements(program_categories_list));
		//ListContent.stream().forEach(s->System.out.println(s.getText()));
		//System.out.println("bb1");
		Assert.assertTrue(listElements(program_categories_list,programArraylist()));	
	}
	
	@Test(priority = 23)
	public void Area_Of_interest_elements() throws Exception
	{
//		System.out.println("aa1");
//		ArrayList<WebElement> ListContent = new ArrayList<>(driver.findElements(By.xpath("//*[@id='ctl00_ctl00_cphslideshow_cphslideshow_uxNavigationMenu_lstProgramArea']/li")));
//		ListContent.stream().forEach(s->System.out.println(s.getText()));
//		System.out.println("bb1");
		Assert.assertTrue(listElements(area_of_interest,area_Of_Interest_Arraylist()));
		driver.findElement(close_button).click();
	}
	@Test(priority = 24)
	public void Type_in_search_Box() throws Exception
	{
		
		driver.findElement(find_aProgram_bar).sendKeys("cloud computing for big data");
		driver.findElement(search_button).click();
		String Url= driver.getCurrentUrl();
		Assert.assertEquals(Url, getObject("Cloud_Computing_URL"));
	    
		
	}

	
	@AfterClass  
	 public void after_class()  
	 {  
           driver.navigate().back();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,-450)", ""); 
	 }  
	
	
	
	
	
	boolean listElements(By WebElements, List listname) 
			throws InterruptedException {
		
		ArrayList<WebElement> ListContent = new ArrayList<>(driver.findElements(WebElements));
		ListContent.stream().forEach(s->System.out.println(s.getText()));
		List<String> listOfContent = ListContent.stream() .map(s->s.getText()) .collect(Collectors.toList());
		boolean isEqual = listOfContent.equals(listname);
		
		
		return isEqual;
	}
}


