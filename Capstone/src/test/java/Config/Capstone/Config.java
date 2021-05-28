package Config.Capstone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	WebDriver driver = new ChromeDriver();
	protected Properties prop=new Properties();
public void startup () throws IOException {	
	
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	// driver object
	
	FileInputStream ip= new FileInputStream("C:\\Users\\dell1\\eclipse-workspace\\Capstone\\src\\test\\java\\data.properties");
	prop.load(ip);
	
}

public void getobject(String a) {
	
	
	//prop.getProperty("Home_Page_URL");
	
	 driver.get(prop.getProperty(a));
	
}



}
