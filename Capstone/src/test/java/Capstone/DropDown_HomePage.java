package Capstone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseHelper;

public class DropDown_HomePage extends BaseHelper {
	
	// Web Element future Student Drop Down
	
	static String FutureStudentsDropDownMenu="//*[@id='topmenu']/ul/li[1]/a";
    
	
	
	// Drop Down Elements in Future Students
static By FutureStudentsDropDownMenuOptions = By.xpath("//*[@class = 'nav navbar-nav']/li[1]/ul/li/a");

	// Method having List of Future Student Drop Down Menu 
	
	public List<String> FutureStudentArraylist() {
		
		List<String> dropDownFutureStudent = new ArrayList<String>();
		dropDownFutureStudent.add("Full-Time");
		dropDownFutureStudent.add("Online");
		dropDownFutureStudent.add("Applicants");
		dropDownFutureStudent.add("International");
		dropDownFutureStudent.add("Parents & Caregivers");
		dropDownFutureStudent.add("Educators & Counsellors");
		dropDownFutureStudent.add("School-College-Work Initiative");
		dropDownFutureStudent.add("Second Career");
 		
		

		return dropDownFutureStudent;
	}
	
	// Web Element About US Drop Down
	
		static String AboutUsDropDownMenu="//*[@id='topmenu']/ul/li[2]/a";
		// Drop Down Elements in About Us 
		static By AboutUsDropDownMenuOptions = By.xpath("//*[@id='topmenu']/ul/li[2]/ul/li");

		// Method having List of About Us Drop Down Menu 
		
		public List<String> AboutUsArraylist() {
			
			List<String> dropDownAboutUs = new ArrayList<String>();
			dropDownAboutUs.add("Alumni Association");
			dropDownAboutUs.add("Research & Innovation");
			dropDownAboutUs.add("Centres & Labs");
			dropDownAboutUs.add("Employment at Lambton");
			dropDownAboutUs.add("Events");
			dropDownAboutUs.add("Foundation");
			dropDownAboutUs.add("Media");
			dropDownAboutUs.add("Our College");
			dropDownAboutUs.add("Our Board");
			dropDownAboutUs.add("Our Brand");

			return dropDownAboutUs;
		}
		
		
	
		// Web Element Programs Drop Down
		
		static String ProgramsDropDownMenu="//*[@id='topmenu']/ul/li[3]/a";

		// Drop Down Elements in Programs
	static By ProgramsDropDownMenuOptions = By.xpath("//*[@class = 'nav navbar-nav']/li[3]/ul/li/a");

		// Method having List of Programs Drop Down Menu 
		
		public List<String> ProgramsArraylist() {
			
			List<String> dropPrograms = new ArrayList<String>();
			dropPrograms.add("All Programs");
			dropPrograms.add("Industrial Fire Training");
			dropPrograms.add("Corporate Training");
			dropPrograms.add("International Education");
			dropPrograms.add("Micro-Credentials");
			dropPrograms.add("Online Education");
	 		
			

			return dropPrograms;
		}
		
		// Web Element All Services Drop Down
		
				static String AllServicesDropDownMenu="//*[@id='topmenu']/ul/li[4]/a";

				// Drop Down Elements in AllServices
			static By AllServicesDropDownMenuOptions = By.xpath("//*[@class = 'nav navbar-nav']/li[4]/ul/li/a");

				// Method having List of AllServices Drop Down Menu 
		
		
public List<String> AllListArraylist() {
			
			List<String> AllList = new ArrayList<String>();
			Collections.addAll(AllList,"All Services", "Academic Upgrading", "Accessibility Services", "Athletics & Recreation" ,
					"Business Services", "Community Employment Services", "Contractors", "Co-op & Career Services", 
					"Creations Restaurant", "Cube Entrepreneurship", "EarlyOn Centre" ,"Esports Arena" ,"Event Centre",
					"Indigenous Student Centre", "Library", "Massage Clinic" ,"eLearning Development",
					 "Placements", "Research & Innovation", "Residence" ,"Salon & Spa", "Testing");

			return AllList;
		}

//Web Element All Services Drop Down

static String AddmissionsDropDownMenu="//*[@id='topmenu']/ul/li[5]/a";

// Drop Down Elements in AllServices
static By AddmissionsDropDownMenuOptions = By.xpath("//*[@class = 'nav navbar-nav']/li[5]/ul/li/a");

// Method having List of AllServices Drop Down Menu 


public List<String> AddmissionsArraylist() {

List<String> Addmissions = new ArrayList<String>();
Collections.addAll(Addmissions,"Registration Services","Financial Aid", "Academic Dates", 
		"How To Apply", "Confirm your Offer", "Transfer Opportunities");

return Addmissions;
}
//Web Element Contacts Drop Down

static String ContactsDropDownMenu="//*[@id='topmenu']/ul/li[6]/a";

//Drop Down Elements in Contacts
static By ContactsDropDownMenuOptions = By.xpath("//*[@class = 'nav navbar-nav']/li[6]/ul/li/a");

//Method having List of AllServices Drop Down Menu 


public List<String> ContactsArraylist() {

List<String> Contacts = new ArrayList<String>();
Collections.addAll(Contacts,"Facility Rentals","Locations", "Campus Maps",  "Contact Us", 
		"Tours & Program Advising", "COVID Protocols");


return Contacts;
}



		
	
	
}
