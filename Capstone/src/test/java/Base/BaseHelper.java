package Base;

import org.openqa.selenium.WebDriver;

import Config.Capstone.Config;

public class BaseHelper extends Config{
	
	public void getobject  (WebDriver driver ,String a) {
		driver.get(prop.getProperty(a));
		
		
	}
	

}
