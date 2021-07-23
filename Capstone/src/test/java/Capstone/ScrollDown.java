package Capstone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;

import Base.BaseHelper;

public class ScrollDown extends BaseHelper{

	// Find A Program Search Bar
	static By find_aProgram_bar =By.xpath("//*[@title='Find a Program']");
	 
	// Search button
	static By search_button=By.xpath("//*[@alt='Search Programs']");
	
	
	// All Program
	static By all_Program =By.xpath("//*[@class='program-btn-text']");
	
	// Program Categories
	
	static By program_categories =By.xpath("//*[@class='program-menu']//a[2]//span");
	
	// close_button
	static By close_button =By.xpath("//*[@alt='Close Overlay']");
	
	
	// List of Program Categories
	static By program_categories_list = By.xpath("//*[@id=\'ctl00_ctl00_cphslideshow_cphslideshow_uxNavigationMenu_lstProgramType\']//li");
	
	// List of Program Categories
	public List<String> programArraylist() {

		List<String> programs = new ArrayList<String>();
		Collections.addAll(programs,"Accelerated","Advanced Diploma","Apprenticeship","Award of Recognition",
				 "Board of Governors Certificate", "Certificate","Co-op","Degree","Diploma","Graduate Studies",
				 "Preparatory","Second Career");


		return programs;
		}
	
	// Area of Interest
	static By area_of_interest= By.xpath("//*[@id='ctl00_ctl00_cphslideshow_cphslideshow_uxNavigationMenu_lstProgramArea']/li");
	
	// List of Area Of Interest
		public List<String> area_Of_Interest_Arraylist() {

			List<String> area_of_interest = new ArrayList<String>();
			Collections.addAll(area_of_interest,"Business","Community Services","Corporate Training","Creative Design",
					 "Fire Sciences", "Health Sciences","Information Technology","International Education","Online Education","Technology & Trades");


			return area_of_interest;
			}
	
}
