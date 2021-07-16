package Capstone;

import org.openqa.selenium.By;

import Base.BaseHelper;

public class ScrollDown extends BaseHelper{

	// Find A Program Search Bar
	static By find_aProgram_bar =By.xpath("//*[@title='Find a Program']");
	 
	
	// All Program
	static By all_Program =By.xpath("//*[@class='program-btn-text']");
	
	// Program Categories
	
	static By program_categories =By.xpath("//*[@class='program-menu']//a[2]//span");
	
}
