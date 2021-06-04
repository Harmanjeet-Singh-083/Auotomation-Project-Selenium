package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Config.ReadPropertyFile;

public class BaseHelper extends ReadPropertyFile {
	
    public static WebDriver driver;
	
	
	public static WebDriver startApp (String url, String browserName) throws Exception
    {
        //if(browserName.equals("Chrome"))
        //{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            
            driver = new ChromeDriver();

        //}
        //else if(browserName.equals("Firefox"))
        //{
          //  System.setProperty(getObject("firefoxDriver"), getObject("firefoxDriver_Location"));
            //driver = new FirefoxDriver();
        //}
        //else if(browserName.equals("Edge"))
        //{
          //  System.setProperty(getObject("edgeBrowser"), getObject("edgeBrowser_Location"));
            //driver = new InternetExplorerDriver();
        //}
        //else
        //{
          //  System.out.println("Browser not supported");
        //}
        //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
       System.out.println("Abc  :" + getObject("abc"));
       System.out.println("Home_Page_Visit  :" + getObject("home_Page_Visit"));
        return driver;
    }

	public static void loginToHomePage( String url) throws Exception
	{   
	    driver.get(getObject("url"));
	    
	    //Old login with Dropdown
	    //LoginPage.selectDropDown(driver);
	    
	    //New login with HQ Upgrade .net version 2
	    //Thread.sleep(2000);
	   // LoginPage.clickMedworxxSignInButton(driver);
	    
	    Thread.sleep(1000);
		//LoginPage.enterUsername(driver,userId);
		//LoginPage.enterPassword(driver,pass);
		//LoginPage.clickLogin(driver);
	}

	//Generic Method for getting text 
 	 public static String getTextBase( By by)
 	 {
 		return(driver.findElement( by).getText());
 	 }
 	 
 	//Generic Method for click 
 	 public static  void click(By by)
 	 {
 		
		driver.findElement( by).click();
 	 }

 	 
 	 
 	 
}



