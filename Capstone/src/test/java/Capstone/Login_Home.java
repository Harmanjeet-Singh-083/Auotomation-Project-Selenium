package Capstone;

import org.openqa.selenium.By;

import Base.BaseHelper;

public class Login_Home extends BaseHelper {
	
	// Logo on Home Page
	
	static By homePageLogo = By.xpath("//*[@class='img-responsive']");

   // Drop Downs in Home Page	
	static By dropDownsHomePage = By.xpath("//*[@class='dropdown-toggle desktop-hover']");
	
  // Visit Tag
	
	static By homePageVisitTag = By.xpath("//*[@id=\"toplinks\"]/a[1]");
			
	By myLambton = By.xpath("//*[@id=\"toplinks\"]/a[2]");
	
	
}
