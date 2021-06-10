package Capstone;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseHelper;

public class Login_Home extends BaseHelper {
	
	// Logo on Home Page
	
	static By homePageLogo = By.xpath("//*[@class='img-responsive']");

   // Drop Downs in Home Page	
	static By dropDownsHomePage = By.xpath("//*[@class='dropdown-toggle desktop-hover']");
	
  // Visit Tag
	static By homePageVisitTag = By.xpath("//*[@id=\"toplinks\"]/a[1]");
	
	// MyLambton Tag
	
	static By homePageMyLambton = By.xpath("//*[text()='myLambton']");
	
	// Method having List of Drop Down Menu Names 
	
	public List<String> arraylist() {
		
		List<String> dropDownMenuNames = new ArrayList<String>();
		dropDownMenuNames.add("Future Students");
		dropDownMenuNames.add("About Us");
		dropDownMenuNames.add("Programs");
		dropDownMenuNames.add("Services");
		dropDownMenuNames.add("Admissions");
		dropDownMenuNames.add("Contact");
		
 		
		

		return dropDownMenuNames;
	}
	
	// Search Bar Home Page
		static By homePageSearchBar = By.xpath("//*[@class='search-query']");
	

	// Search Button Home Page
		
		static By homePageSearchButton = By.xpath("//*[@class='search-btn']");
	
}
