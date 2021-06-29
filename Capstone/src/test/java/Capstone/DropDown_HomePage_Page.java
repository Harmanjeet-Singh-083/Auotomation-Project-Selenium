package Capstone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDown_HomePage_Page extends DropDown_HomePage {

	
	@Test(priority = 12)
	public void VerifyFutureStudentDropDownMenu() throws Exception {
				

		Assert.assertTrue(mouseOver(FutureStudentsDropDownMenu,FutureStudentsDropDownMenuOptions,FutureStudentArraylist()));
		

	}
	
	
	@Test(priority = 13)
	public void VerifyAboutUsDropDownMenu() throws Exception {
		
		Assert.assertTrue(mouseOver(AboutUsDropDownMenu,AboutUsDropDownMenuOptions,AboutUsArraylist()));
			
	}
	
	
	@Test(priority = 14)
	public void VerifyProgramsDownMenu() throws Exception {
				
		
		Assert.assertTrue(mouseOver(ProgramsDropDownMenu,ProgramsDropDownMenuOptions,ProgramsArraylist()));
	
				
	}
	
	@Test (priority =15)
	public void VerifyAllServicesDownMenu () throws InterruptedException {
	
		Assert.assertTrue(mouseOver(AllServicesDropDownMenu,AllServicesDropDownMenuOptions,AllListArraylist()));
			
	}
	
	@Test (priority =16)
	public void VerifyAddmissionsDownMenu () throws InterruptedException {
	
		Assert.assertTrue(mouseOver(AddmissionsDropDownMenu,AddmissionsDropDownMenuOptions,AddmissionsArraylist()));
			
	}
	@Test (priority =17)
	public void VerifyContactsDownMenu () throws InterruptedException {
	
		Assert.assertTrue(mouseOver(ContactsDropDownMenu,ContactsDropDownMenuOptions,ContactsArraylist()));
			
	}
	public boolean mouseOver(String DropDown,By WebElements, List listname) throws InterruptedException {
		
		WebElement a=driver.findElement(By.xpath(DropDown));
		
		//Mouse Over Action performing on the dropdown menu
				Actions aa= new Actions (driver);
				aa.moveToElement(a).build().perform();
				
				
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(WebElements));
				
				//Thread.sleep(3000);
	System.out.println("H1");
				//Array list of web elements
					ArrayList<WebElement> ListDropDown = new ArrayList<>(driver.findElements(WebElements));
					System.out.println("H2");
					wait.until(ExpectedConditions.visibilityOfElementLocated(WebElements));
					
				//	Thread.sleep(14000);
				//Print in console
					ListDropDown.stream().forEach(s->System.out.println(s.getText()));
					System.out.println("H3");
					List<String> listOfDropdowns = ListDropDown.stream() .map(s->s.getText()) .collect(Collectors.toList());
					boolean isEqual = listOfDropdowns.equals(listname);
					return isEqual;
						
		
	}
	
	
}
